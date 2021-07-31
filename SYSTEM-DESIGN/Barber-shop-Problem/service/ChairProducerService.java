package service;

import model.Chair;
import model.Customer;

import javax.annotation.processing.SupportedOptions;
import javax.annotation.processing.SupportedSourceVersion;
import java.util.ConcurrentModificationException;
import java.util.LinkedList;

public class ChairProducerService extends Thread {
    Shop shop;
    LinkedList<Customer> customers;
    public ChairProducerService(Shop shop)
    {
        this.shop=shop;
        customers = new LinkedList<>();
    }
    public void addCustomer(String customerName)
    {
        customers.add(new Customer(customerName));
    }

    @Override
    public void run() {
        try {
            while (true) {
                if(!customers.isEmpty()) {
                    Customer currentCustomer = customers.pop();
                    if (shop.isAllChairsOccupied())
                        System.out.println("All Chair Occupied");
                    else {
                        Chair freeChair = shop.getFreeChairs();
                        System.out.println("Serving chair " + freeChair.getChairNumber() + " to " + currentCustomer.getCustomerName());
                        shop.occupyOneChair(freeChair);
                    }
                }
            }
        }catch (Exception exception)
        {
            exception.printStackTrace();
        }
    }
}
