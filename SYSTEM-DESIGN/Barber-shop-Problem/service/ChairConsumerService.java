package service;

import model.Chair;

public class ChairConsumerService extends Thread {
    Shop shop;

    public ChairConsumerService(Shop shop) {
        this.shop = shop;
    }

    @Override
    public void run() {
        try {
            while (true) {
                synchronized (shop.occupiedChairs) {
                    if (!shop.isAllChairFree() && !shop.occupiedChairs.isEmpty()) {
                        Chair serviceChair = shop.occupiedChairs.pop();
                        System.out.println("Barber is service chair number" + serviceChair.getChairNumber());
                        Thread.sleep(1000);
                        shop.freeChairs.addLast(serviceChair);
                    } else {
                        System.out.println("No Customer,Barber is sleeping");
                        this.wait();
                    }
                }
            }
        }catch (InterruptedException exception)
        {
            exception.printStackTrace();
        }
    }
}
