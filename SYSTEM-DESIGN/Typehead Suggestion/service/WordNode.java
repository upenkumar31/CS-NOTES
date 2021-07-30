package service;


import model.CharacterNode;
import utils.Constant;

import java.util.*;

/**
 *
 */
public class WordNode {
    CharacterNode characterNode;
    public LinkedList<WordNode> frequentChildCharacter;
    public HashMap<Character,WordNode> characterNodePresentOnNode;

    public WordNode addCharacter(Character character,boolean endOfWord)
    {
        if(characterNodePresentOnNode.getOrDefault(character,null)!=null)
        {
            WordNode wordNode = characterNodePresentOnNode.get(character);
            frequentChildCharacter.remove(wordNode);
            wordNode.characterNode.setEndOfWord(endOfWord);
            frequentChildCharacter.addFirst(wordNode);
            return wordNode;
        }
        else
        {
            CharacterNode characterNodeTemp = new CharacterNode(character,endOfWord);
            WordNode wordNode = new WordNode(characterNodeTemp);
            wordNode.characterNodePresentOnNode.put(character,wordNode);
            wordNode.frequentChildCharacter.addFirst(wordNode);
            return wordNode;
        }
    }
    WordNode(CharacterNode characterNode)
    {
        this.characterNode=characterNode;
        this.frequentChildCharacter = new LinkedList<>();
        this.characterNodePresentOnNode = new HashMap<>();
    }
    public boolean isCharacterAvailable(Character character)
    {
        return characterNodePresentOnNode.containsKey(character);
    }
    public WordNode getFirstNode()
    {
        return frequentChildCharacter.getFirst();
    }
    public List<WordNode> getFrequentNodeFromCharacterNode(WordNode wordNode)
    {
        if(characterNode == null)
            return null;
        int count = 0;
        List<WordNode> result = new ArrayList<>();
        for(WordNode node:frequentChildCharacter)
        {
            if(count< Constant.NUMBER_OF_SUGGESTED_CHARACTER)
            {
                result.add(node);
                count++;
            }
            else break;
        }
        return result;
    }
}
