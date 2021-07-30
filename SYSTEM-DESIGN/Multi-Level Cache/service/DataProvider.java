package service;

import model.User;
import java.util.LinkedList;
import java.util.Random;

public class DataProvider {
    private static DataProvider dataProvider = null;
    private final int totalNumberOfData = 1000;
    private LinkedList<User> userData;

    public static DataProvider getDataProviderInstance() {
        if(dataProvider==null)
            dataProvider = new DataProvider();
        return dataProvider;
    }
     DataProvider()
    {
        userData = new LinkedList<>();
        fillData();
    }
    private void fillData()
    {
        for(int i=0;i<totalNumberOfData;i++ )
        {
            userData.add(new User(i,"ABC"+String.valueOf(i),"XYZ"+String.valueOf(i),  String.valueOf(new Random().nextInt(99999999))));
        }
    }
    public User getData(int key)
    {
        //System.out.println("Requested data: "+key);
        if(key<0||key>=totalNumberOfData)
            return null;
        return userData.get(key);
    }
}
