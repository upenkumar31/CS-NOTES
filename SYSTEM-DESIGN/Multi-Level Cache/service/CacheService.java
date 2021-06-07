package service;

import Model.User;

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
        for(CacheImpl cache:caches)
        {
            // cache found
            if(cache.get(key)!=null)
            {
                System.out.println("Found data in cache: "+count);
                return cache.get(key);
            }
            count++;
        }
        //cache miss
        User result = DataProvider.getDataProviderInstance().getData(key);
        if(result!=null)
        {
            System.out.println("Data Coming from data source");
            caches.get(new Random().nextInt(numberOfCache)).put(key,result);
        }
        return result;
    }
}
