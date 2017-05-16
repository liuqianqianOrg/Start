package com.yuhy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by YHY on 2017/5/13.
 */
public class Person implements  IFriendsAction{

    private String name;

    private String cell;

    private Catagory cata = new Catagory();

    public Person(){
        System.out.println(" create a person");
    }
    public Person(String name,String cell){
        System.out.printf("create a person named %s who's cell is %s ;%n",name,cell);
        this.name = name;
        this.cell = cell;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCell() {
        return cell;
    }

    public String getName() {
        return name;
    }

    public Catagory getCata() {
        return cata;
    }

    public void setCata(Catagory cata) {
        this.cata = cata;
    }


    @Override
    public void add(Person p ) {
        cata.save(p);
    }
    public void add(Person ... p) {
        System.out.println(p instanceof Person []);
        for (Person p1 : p)
        cata.save(p1);
    }


    @Override
    public void delete(String cell) {
        cata.delete(cell);
    }

    @Override
    public void delete(Person p) {
        cata.delete(p);
    }


    @Override
    public Person find(String key) {
        return cata.seach(key);
    }

    @Override
    public void show() {
        cata.show();
    }

}
