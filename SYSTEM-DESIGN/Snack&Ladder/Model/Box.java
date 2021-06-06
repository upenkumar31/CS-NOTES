package Model;

public class Box {
    private Snake snake;
    private Ladder ladder;
    Box()
    {
        snake = null;
        ladder = null;
    }

    public Snake getSnack() {
        return snake;
    }

    public Ladder getLadder() {
        return ladder;
    }

    public void setLadder(Ladder ladder) {
        this.ladder = ladder;
    }

    public void setSnack(Snake snake) {
        this.snake = snake;
    }
}
