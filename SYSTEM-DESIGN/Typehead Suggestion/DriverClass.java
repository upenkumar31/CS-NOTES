import service.TypeHeadServiceImpl;

import java.util.List;

public class DriverClass {
    public static void main(String[] args) {
        String words[]={"hello","hi","how","he","hell","hells"};
        TypeHeadServiceImpl typeHeadService = new TypeHeadServiceImpl();
        typeHeadService.addWordToDictionary(words);
        typeHeadService.searchWord("hello");
        List<String > recommendedWord = typeHeadService.getWordFromSuffix("hel");
        if(recommendedWord!=null) {
            for (String word : recommendedWord)
                System.out.println(word);
        }
    }
}
