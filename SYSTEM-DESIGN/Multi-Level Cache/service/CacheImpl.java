package service;

import model.Cache;
import model.User;

import java.util.HashMap;
import java.util.LinkedList;

public class CacheImpl implements Cache {
    private int capacity;
    private LinkedList<User> list;
    private HashMap<Integer,User> lookup;

    public CacheImpl(int capacity) {
        this.capacity = capacity;
        list = new LinkedList<>();
        lookup = new HashMap<>();
    }

    @Override
    public User get(int key){
        if(lookup.getOrDefault(key,null)!=null)
        {
            list.remove(lookup.get(key));
            list.addFirst(lookup.get(key));
        }
        else return null;
        return list.getFirst();
    }
    @Override
    public void put(int key, User value) {

        if(lookup.getOrDefault(key,null)!=null)
        {
            list.remove(value);
        }
        else
        {
            lookup.put(key,value);
            if(list.size()>=capacity)
            {
                list.removeLast();
            }
        }
        list.addFirst(value);
    }
}
