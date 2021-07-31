package service;

import java.util.List;

/**
 *  This class adds word to frequent used dictionary
 *  and return frequent used word from prefix String
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
     * @param prefixWord
     * @return
     */
    @Override
    public List<String> getWordFromPrefix(String prefixWord) {
        return Dictionary.getInstance().wordFromPrefix(prefixWord);
    }

    public String searchWord(String word) {
        Dictionary.getInstance().addWord(word);
        return word;
    }
}
