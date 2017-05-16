package com.yuhy;

/**
 * Created by YHY on 2017/5/13.
 */
public interface ICatagoryAction {

     int l = 1;

     void save(Person p);

     void delete(Person p);

    Person seach(String cellOrName);

    void show();

}
