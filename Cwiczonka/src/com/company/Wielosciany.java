package com.company;

//Napisz program obliczający objętość prostopadłościanu (klasa Prostopadloscian o polach a,b,h) - funkcja zaprzyjaźniona
//liczy powierzchnię.
import java.util.Scanner;
public class Wielosciany {

    public static void main(String[] args) {

        int bok_a;
        int bok_b;
        int bok_h;
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj wysokość a");
        bok_a=scan.nextInt();
        System.out.println("Podaj wysokość b");
        bok_b=scan.nextInt();
        System.out.println("Podaj wysokość h");
        bok_h=scan.nextInt();
        /*Objetosc prostopadloscian=new Objetosc();
        prostopadloscian.liczObjetosc(bok_a, bok_b, bok_h);*/


        Objetosc prostopadloscian=new Objetosc(bok_a,bok_b,bok_h);
        prostopadloscian.liczObjetosc();




    }

}
