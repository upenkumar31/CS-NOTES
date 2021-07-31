import service.TypeHeadServiceImpl;

import java.util.List;

public class DriverClass {
    public static void main(String[] args) {
        String previouslySearchWord[]={"hello","hi","how","he","hell","hellos"};
        TypeHeadServiceImpl typeHeadService = new TypeHeadServiceImpl();
        typeHeadService.addWordToDictionary(previouslySearchWord);
        List<String > recommendedWord = typeHeadService.getWordFromPrefix("hel");
        if(recommendedWord!=null) {
            for (String word : recommendedWord)
                System.out.println(word);
        }
    }
}
