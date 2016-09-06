package ru.sergshum.java_test;

/**
 * Created by SErrG on 02.09.2016.
 */
public class trutest {
    public static void main(String[] args) {
        System.out.println(" Toyota ");

        aArray();
    }

    static  void aArray(){

        char [] numbs = {78, 56, 245, 235, 147};

        for(int i = 0; i < numbs.length; i++){

            char numb = numbs[i];

            System.out.println(numb);
        }
    }
}
