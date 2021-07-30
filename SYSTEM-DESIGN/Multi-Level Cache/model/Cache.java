package model;
public interface Cache {
    public User get(int key);
    public void put(int key,User value);
}
