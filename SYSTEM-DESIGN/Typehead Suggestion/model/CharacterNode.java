//***********************************
//  Author : Upendra Nishad
//***********************************
package model;

public class CharacterNode {
    private char character;
    private boolean isEndOfWord;

    /**
     *
     * @param character
     */
    public CharacterNode(char character) {
        this.character = character;
        this.isEndOfWord = false;
    }
    public CharacterNode() {
        this.isEndOfWord = false;
    }
    public CharacterNode(char character,boolean endOfWord) {
        this.character = character;
        this.isEndOfWord = endOfWord;
    }
    public char getCharacter() {
        return character;
    }

    public void setCharacter(char character) {
        this.character = character;
    }

    public boolean isEndOfWord() {
        return isEndOfWord;
    }

    public void setEndOfWord(boolean endOfWord) {
        isEndOfWord = endOfWord;
    }

    @Override
    public String toString() {
        return "CharacterNode{" +
                "character=" + character +
                ", isEndOfWord=" + isEndOfWord +
                '}';
    }
}
