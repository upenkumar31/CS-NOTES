package service;

import java.util.List;

public interface TypeHeadService {
    public void addWordToDictionary(String word);
    public List<String> getWordFromSuffix(String suffixWord);
}
