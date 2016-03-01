package com.bazlur.tips.generics.wildcard;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Bazlur Rahman Rokon
 * @since 12/26/15.
 */
public class WildCardDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        //List<Object> objList = list;

        List a = new ArrayList<>();

        print(list);
        doSomething(new ArrayList<>());

        //List<Object> b = new ArrayList<String>();
        // generics in java isn't the real generics

        List<String> ddasdf= new ArrayList<>();

        List dddasdf= new ArrayList<>();
    }

    public static void doSomething (List list){

    }

    public static void print(List<?> list){
        list.forEach(System.out::println);
    }
}
