package com.yuhy;

/**
 * Created by YHY on 2017/5/13.
 */
public interface IFriendsAction {

    int l = 2;

    void add(Person p);

    void delete(String cell);
    void delete(Person p);

    Person find(String cellOrName);
    void show();
}
