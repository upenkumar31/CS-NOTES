package service;

import java.util.List;

/**
 *  This class adds word to frequent used dictionary
 *  and return frequent used word from suffix String
 */
public class TypeHeadServiceImpl implements TypeHeadService {
    /**
     *
     * @param word
     */
    @Override
    public void addWordToDictionary(String word) {
        Dictionary.getInstance().addWord(word);
    }

    public void addWordToDictionary(String words[]) {
        for(String word:words )
        Dictionary.getInstance().addWord(word);
    }


    /**
     *
     * @param suffixWord
     * @return
     */
    @Override
    public List<String> getWordFromPrefix(String suffixWord) {
        return Dictionary.getInstance().wordFromSuffix(suffixWord);
    }

    public String searchWord(String word) {
        Dictionary.getInstance().addWord(word);
        return word;
    }
}
