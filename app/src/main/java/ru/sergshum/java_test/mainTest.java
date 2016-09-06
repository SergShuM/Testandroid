package ru.sergshum.java_test;

/**
 * Created by SErrG on 28.08.2016.
 */
public class mainTest{

    public static void main (String[] args){
        System.out.println("Hola hola.....");
        int Anna = 47;
        int Ola = 57;
        int Summa_1;


        Summa_1 = Anna + Ola;

         System.out.println(Summa_1);

        you();

        int i = 0;
        int a;
        a = ++i;
        System.out.println(a);

    }
    public static  void you (){
        long chislo = Long.MAX_VALUE;
        String jOin=oLa("Ford", chislo);

        System.out.println(jOin);
    }
    static String oLa(String x, long y){
        String port;
        port= x + " Mondeo " + y;
        return port;
    }
}
