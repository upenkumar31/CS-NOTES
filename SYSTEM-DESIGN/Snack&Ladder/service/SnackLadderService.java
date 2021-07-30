package service;

import model.Board;

import java.util.Random;

public class SnackLadderService {
    private int numberOfPlayer;
    private int[] playerPosition;
    private boolean isGameFinished;
    private static int diceBound;
    private Board board;
    private int finalPosition;

    public SnackLadderService(int numberOfPlayer, int diceBound) {
        this.numberOfPlayer = numberOfPlayer;
        this.playerPosition = new int[numberOfPlayer];
        this.isGameFinished = false;
        this.board = new Board();
        this.diceBound = 6*diceBound;
        this.finalPosition=99;
    }
    public void start()
    {
        int position;
        int diceValue;
        while(!isGameFinished)
        {
            for(int player=0;player<numberOfPlayer;player++)
            {
                position = playerPosition[player];
                diceValue = roleDice();
                if(position+diceValue>finalPosition)
                {
                    System.out.println("Can't proceed further place value more than 100");
                    continue;
                }
                if(board.isSnake(position+diceValue))
                {
                    position = board.getReducedPositionBySnake(position+diceValue);
                    System.out.println("Player:"+player+" Dice Value:"+ diceValue +" Biten By Snake"+ " New Position: "+(position+1) );
                }
                else if(board.isLadder(position+diceValue))
                {
                    position = board.getIncreasedPositionByLadder(position+diceValue);
                    System.out.println("Player:"+player+" Dice Value:"+ diceValue +" Got Ladder"+ " New Position: "+(position+1) );
                }
                else {
                    position += diceValue;
                    System.out.println("Player:"+player+" Dice Value:"+ diceValue + " New Position: "+(position+1) );
                }
                if(position==finalPosition)
                {
                    System.out.println("Player: "+player+" Won the Game");
                    isGameFinished=true;
                    break;
                }
                playerPosition[player]=position;
            }
        }
    }
    static int roleDice()
    {
        int diceValue = new Random().nextInt(diceBound)+1;
        if(diceValue == 6) diceValue  += roleDice();
        if(diceValue == 12) diceValue += roleDice();
        if(diceValue == 18) diceValue  = roleDice();
        return diceValue;
    }
}
