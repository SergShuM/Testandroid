package ru.sergshum.java_test;

/**
 * Created by SErrG on 02.09.2016.
 */
public class trutest {
    public static void main(String[] args) {
        System.out.println(" Toyota ");

        aArray();

        aArray_1();
    }

    static  void aArray(){

        char [] numbs = {78, 56, 245, 235, 147};

        for(int i = 0; i < numbs.length; i++){

            char numb = numbs[i];

            System.out.println(numb);
        }
    }

    static void aArray_1(){

        int [][] sell;
        sell = new int[10][10];

        int con = 0;

        for (int i = 1; i < sell.length; i++){

            if(con == 3){

                con = 0;
            }


            for(int j = 1; j < sell.length; j++){

                if(con >= 3){

                    System.out.println(j + " + " + i + " = " + j*i);
                    con = 0;

                }else {

                    System.out.print(j + " + " + i + " = " + j * i + ", ");
                    con++;
                }



            }
        }

    }
}
