package service;


import model.CharacterNode;
import utils.Constant;

import java.util.ArrayList;
import java.util.List;

public class Dictionary {
    private static WordNode wordNode=null;
    private List<String> suggestedWord;
    public static Dictionary dictionaryObj= null;
    public static Dictionary getInstance()
    {
        if(dictionaryObj == null)
            dictionaryObj = new Dictionary();
        return dictionaryObj;
    }

    public static WordNode getWordNode() {
        if(wordNode == null)
            wordNode = new WordNode(new CharacterNode('*',false));
        return wordNode;
    }

    public void setWordNode(WordNode wordNode) {
        this.wordNode = wordNode;
    }

    public void addWord(String word)
    {
        WordNode temp = getWordNode();
        for(Character character:word.toCharArray())
        {
            temp = temp.addCharacter(character, false);
        }
        temp.characterNode.setEndOfWord(true);
    }

    public List<String> wordFromSuffix(String word)
    {
        WordNode endNode = getCharacterNodeEndOfSuffix(word);
        if(endNode ==  null)
            return null;
        suggestedWord = new ArrayList<>();
        getWords(endNode,word);
        return suggestedWord;
    }
    private void getWords(WordNode wordNode,String word)
    {
        if(wordNode== null||suggestedWord.size()==Constant.NUMBER_OF_SUGGESTED_CHARACTER)
            return;
        if(wordNode.characterNode.isEndOfWord())
        {
            suggestedWord.add(word+wordNode.characterNode.getCharacter());
        }
        for(WordNode node:wordNode.frequentChildCharacter)
        {
            getWords(node,word+wordNode.characterNode.getCharacter());
        }
    }
    private WordNode getCharacterNodeEndOfSuffix(String word)
    {
        WordNode suffix=getWordNode();
        for(Character character:word.toCharArray())
        {
            if(suffix.isCharacterAvailable(character))
            {
                 suffix = suffix.characterNodePresentOnNode.get(character);
            }
            else
                return null;

        }
        return suffix;
    }
}
