package service;

import model.User;

import java.util.ArrayList;
import java.util.Random;

public class CacheService {
    private int numberOfCache;
    ArrayList<CacheImpl> caches;

    public CacheService(int numberOfCache) {
        this.numberOfCache = numberOfCache;
        caches = new ArrayList<>();
        for(int i=0;i<numberOfCache;i++)
            caches.add(new CacheImpl(5));
    }
    public User getUserData(int key)
    {
        int count=1;
        User result = null;
        for(CacheImpl cache:caches)
        {
            // cache found
            if((result=cache.get(key))!=null)
            {
                System.out.println("Found data in cache: "+count);
                return result;
            }
            count++;
        }
        //cache miss
        result = DataProvider.getDataProviderInstance().getData(key);
        if(result!=null)
        {
            System.out.println("Data Coming from data source");
            caches.get(new Random().nextInt(numberOfCache)).put(key,result);
        }
        return result;
    }
}
