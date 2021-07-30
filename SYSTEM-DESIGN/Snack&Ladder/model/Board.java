package model;

public class Board {
    Box[] box;

    public Board() {
        box = new Box[100];
        for(int i=0;i<100;i++) box[i] = new Box();
        //Putting few Ladders on board
        box[5].setLadder(new Ladder(5,20));
        box[10].setLadder(new Ladder(10,35));
        box[15].setLadder(new Ladder(15,20));
        box[20].setLadder(new Ladder(20,40));
        box[25].setLadder(new Ladder(25,75));
        box[30].setLadder(new Ladder(30,95));

        //Putting few Snake
        box[9].setSnack(new Snake(9,3));
        box[27].setSnack(new Snake(27,4));
        box[78].setSnack(new Snake(78,39));
        box[94].setSnack(new Snake(94,71));
        box[40].setSnack(new Snake(40,11));
        box[84].setSnack(new Snake(84,7));
    }
    public boolean isSnake(int position)
    {
        return box[position].getSnack()!=null;
    }
    public boolean isLadder(int position)
    {
        return box[position].getLadder()!=null;
    }
    public int getReducedPositionBySnake(int currentPosition)
    {
        return box[currentPosition].getSnack().getEnd();
    }
    public int getIncreasedPositionByLadder(int currentPosition)
    {
        return box[currentPosition].getLadder().getEnd();
    }
}
