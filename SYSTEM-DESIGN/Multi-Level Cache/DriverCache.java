import model.User;
import service.CacheService;

import java.util.Random;

public class DriverCache {
    public static void main(String[] args)
    {
        CacheService cacheService = new CacheService(3);
        for(int i=0;i<100;i++)
        {
            User user = cacheService.getUserData(new Random().nextInt(10));
            System.out.println(user.toString()+"\n");
        }
    }
}
