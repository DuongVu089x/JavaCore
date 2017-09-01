package com.dav.javacore.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {
        List<String> demo = new ArrayList<String>();

        //add char from "A" to "Z" in ASCII
        for(int i= 65; i<91 ; i++){
            demo.add(Character.toString ((char) i));
        }

        //print char
        demo.forEach(string ->{
            System.out.println(string);
        });

    }
}
