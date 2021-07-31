package service;

import model.Chair;
import model.Customer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;

public class Barber extends Thread{
    Shop shop;
    ChairProducerService chairProducerService;
    ChairConsumerService chairConsumerService;
    ConcurrentLinkedDeque<Customer> customerList;
    public Barber()
    {
        shop = new Shop(5);
        chairConsumerService = new ChairConsumerService(shop);
        chairProducerService = new ChairProducerService(shop);
        customerList = new ConcurrentLinkedDeque<>();
    }
    public void addCustomer(String name)
    {
        customerList.add(new Customer(name));
    }
    @Override
    public void run() {
        chairProducerService.start();
        chairConsumerService.start();
        try{
            while(true)
            {
                if(!customerList.isEmpty())
                {
                    chairProducerService.addCustomer(customerList.poll().getCustomerName());
                    if(chairConsumerService.getState().equals("WAITING")) {
                        chairConsumerService.notify();
                        System.out.println("Barber was sleeping,awaking him");
                    }
                }
            }
        }catch(Exception exception)
        {
            exception.printStackTrace();
        }
    }
}
