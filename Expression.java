import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class ExpressionEvaluator {

    private static final Pattern NUMBER_PATTERN = Pattern.compile("-?\\d+(\\.\\d+)?");
    private static final Pattern STRING_PATTERN = Pattern.compile("[A-Za-z0-9]+");

    private static final Map<String, Operator> OPERATORS = new HashMap<>();

    static {
        OPERATORS.put("+", new AdditionOperator());
        OPERATORS.put("-", new SubtractionOperator());
        OPERATORS.put("*", new MultiplicationOperator());
        OPERATORS.put("/", new DivisionOperator());
        OPERATORS.put("^", new PowerOperator());
    }

    public static <T> T evaluateExpression(String expression, Class<T> resultType) throws InvalidExpressionException {
        Deque<Object> stack = new ArrayDeque<>();

        //expression = expression.replaceAll("\\s+", "");

        for (String token : expression.split(" ")) {
            if (NUMBER_PATTERN.matcher(token).matches()) {
                stack.push(Double.parseDouble(token));
            } else if (STRING_PATTERN.matcher(token).matches()) {
                stack.push(token);
            } else if (OPERATORS.containsKey(token)) {
                Object operand2 = stack.pop();
                Object operand1 = stack.pop();
                Object result = OPERATORS.get(token).apply(operand1, operand2);
                stack.push(result);
            } else if (token.equals("(")) {
                stack.push(token);
            } else if (token.equals(")")) {
                Object result = evaluateSubExpression(stack);
                stack.push(result);
            } else {
                throw new InvalidExpressionException("Invalid token: " + token);
            }
        }

        if (stack.size() != 1) {
            throw new InvalidExpressionException("Invalid expression format");
        }

        Object result = stack.pop();
        return resultType.cast(result);
    }

    private static Object evaluateSubExpression(Deque<Object> stack) throws InvalidExpressionException {
        Deque<Object> subStack = new ArrayDeque<>();
        while (!stack.isEmpty() && !stack.peek().equals("(")) {
            subStack.push(stack.pop());
        }
        if (stack.isEmpty() || !stack.pop().equals("(")) {
            throw new InvalidExpressionException("Mismatched parentheses");
        }

        Deque<Object> reversedSubStack = new ArrayDeque<>();
        while (!subStack.isEmpty()) {
            reversedSubStack.push(subStack.pop());
        }

        Object result = reversedSubStack.pop();
        while (!reversedSubStack.isEmpty()) {
            Object operand2 = reversedSubStack.pop();
            Object operand1 = result;
            result = OPERATORS.get(operand2.toString()).apply(operand1, reversedSubStack.pop());
        }

        return result;
    }

    private interface Operator {
        Object apply(Object operand1, Object operand2) throws InvalidExpressionException;
    }

    private static class AdditionOperator implements Operator {
        @Override
        public Object apply(Object operand1, Object operand2) throws InvalidExpressionException {
            if (operand1 instanceof Double && operand2 instanceof Double) {
                return (Double) operand1 + (Double) operand2;
            } else if (operand1 instanceof String && operand2 instanceof String) {
                return (String)operand1 + operand2;
            } else {
                throw new InvalidExpressionException("Invalid addition operation");
            }
        }
    }

    private static class SubtractionOperator implements Operator {
        @Override
        public Object apply(Object operand1, Object operand2) throws InvalidExpressionException {
            if (operand1 instanceof Double && operand2 instanceof Double) {
                return (Double) operand1 - (Double) operand2;
            } else {
                throw new InvalidExpressionException("Invalid subtraction operation");
            }
        }
    }

    private static class MultiplicationOperator implements Operator {
        @Override
        public Object apply(Object operand1, Object operand2) throws InvalidExpressionException {
            if (operand1 instanceof Double && operand2 instanceof Double) {
                return (Double) operand1 * (Double) operand2;
            } else if (operand1 instanceof Double && operand2 instanceof String) {
                int repetitions =  (int) operand1;
                if (repetitions < 0) {
                    throw new InvalidExpressionException("Invalid repetition count: " + repetitions);
                }
                return ((String) operand2).repeat(repetitions);
            } else {
                throw new InvalidExpressionException("Invalid multiplication operation");
            }
        }
    }

    private static class DivisionOperator implements Operator {
        @Override
        public Object apply(Object operand1, Object operand2) throws InvalidExpressionException {
            if (operand1 instanceof Double && operand2 instanceof Double) {
                double divisor = (Double) operand2;
                if (divisor == 0) {
                    throw new InvalidExpressionException("Division by zero");
                }
                double result = (Double) operand1 / divisor;
                return String.format("%.2f", result);
            } else {
                throw new InvalidExpressionException("Invalid division operation");
            }
        }
    }

    private static class PowerOperator implements Operator {
        @Override
        public Object apply(Object operand1, Object operand2) throws InvalidExpressionException {
            if (operand1 instanceof Double && operand2 instanceof Double) {
                return Math.pow((Double) operand1, (Double) operand2);
            } else {
                throw new InvalidExpressionException("Invalid power operation");
            }
        }
    }

    public static class InvalidExpressionException extends Exception {
        public InvalidExpressionException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
       String expression = args[0];
            try {
                Double result = evaluateExpression(expression, Double.class);
                System.out.println(expression + " = " + result);
            } catch (InvalidExpressionException e) {
                System.out.println(expression + " = INVALID_EXPRESSION");
            } catch (Exception e) {
                System.out.println(expression + " = ERROR");
            }
        }
    }
}
