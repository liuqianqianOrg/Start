package com.yuhy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by YHY on 2017/5/13.
 */
public class Catagory implements ICatagoryAction{


    public Catagory(){

    }

    private Set<String> set = new HashSet<>();

    private Map<String,Person> map = new HashMap<>();


    public void setMap(Map<String, Person> map) {
        this.map = map;
    }

    public Map<String, Person> getMap() {
        return map;
    }

    private void setSet(Set<String> set) {
        this.set = set;
    }

    private Set<String> getSet() {
        return set;
    }


    @Override
    public void save(Person p) {
        Person o = seach(p.getCell());
        if (o!=null) {
            save(p,false);
        }else{
            save(p,true);
        }

    }
    public void save(Person p,Boolean flag) {
        if(flag){
            set.add(p.getCell());
            map.put(p.getCell(),p);
        }else{
            System.out.println("you already belong this friend "+p.getCell());
        }
    }
    @Override
    public void delete(Person p) {
        delete(p.getCell());
    }
    public void delete(String cell) {
        if(set.contains(cell)){
            delete(cell,true);
        }else{
            delete(cell,false);
        }
    }
    public void delete(String cell,Boolean flag) {
        if(flag){
            set.remove(cell);
            Person p = map.remove(cell);
            System.out.printf("removed firend %s ! %n",p.getCell());
        }else{
            System.out.println("can't find the friend !");
        }
    }

    @Override
    public Person seach(String cellOrName) {
        if(set.contains(cellOrName)){
            System.out.printf("you find you friend %s; %n",map.get(cellOrName).getName());
            return map.get(cellOrName);
        }
        System.out.println("you don't have this friend ! ");
        return null;
    }

    @Override
    public void show() {
        //链接数据库 query and show
        for(String cell : map.keySet()){
            System.out.printf("you have a friend cell : %s named : %s %n",cell,map.get(cell).getName());
        }
    }

    public Person seach(Person p) {
        //链接数据库，然后查询返回
        String cellOrName = p.getCell();
        if(set.contains(cellOrName)){
            return map.get(cellOrName);
        }
        return null;
    }

}
