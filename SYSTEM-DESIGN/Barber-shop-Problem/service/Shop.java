package service;

import model.Chair;

import java.util.concurrent.ConcurrentLinkedDeque;

public class Shop {
    private int numberOfChair;
    Chair [] chairs;
    ConcurrentLinkedDeque<Chair> occupiedChairs;
    ConcurrentLinkedDeque<Chair> freeChairs;

    public Shop(int numberOfChair)
    {
        this.numberOfChair = numberOfChair;
        chairs = new Chair[numberOfChair];
        occupiedChairs = new ConcurrentLinkedDeque<>();
        freeChairs =  new ConcurrentLinkedDeque<>();
        for(int chairNumber=0;chairNumber<numberOfChair;chairNumber++)
            freeChairs.add(new Chair(chairNumber));
    }

    public boolean isAllChairsOccupied() {
        return occupiedChairs.size()==numberOfChair;
    }

    public boolean isAllChairFree() {
        return freeChairs.size()==numberOfChair;
    }

    public Chair getFreeChairs() {
        return freeChairs.pollFirst();
    }
    public void occupyOneChair(Chair chair)
    {
        occupiedChairs.addLast(chair);
    }
}
