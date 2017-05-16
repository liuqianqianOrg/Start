package com.yuhy;

/**
 * Created by YHY on 2017/5/13.
 */
public class NoteBook {
    /*
        step1 : create one person
        step2 : create one catagory
        step3 : inesrt a person
     */
    static String dat = "enjoy your holiday!";
    static{
        System.out.println("today is sat!");
        System.out.println(dat);
    }

    public static void main(String[] args) {

        Person p1 = new Person("lili","15211983302");
        Person p2 = new Person("john","17399874432");
        Person p3 = new Person("anna","17393324556");
        Person p4 = new Person("lyan","0108876932");
        p1.add(p2);
        p1.add(p3);
        p1.add(p4);
        p1.add(p1,p2,p3,p4);
        p1.delete(p3);
        p1.delete("110");

        p1.find("0108876932");
        p1.find("110");
        p1.show();
        new NoteBook().printASA();
    }


    public void printASA(){
        System.out.println("finally!");
    }

}
