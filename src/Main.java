package com.company;

import java.sql.SQLOutput;

public class Main {
    /**
     * moja pierwsza lekcja
     */
    public static void main(String[] args) {
        System.out.println("HelloWorld");
        System.out.println("Mariusz Botwina");
        // To jest moje imie oraz nazwiko
        System.out.println("Witaj");
        System.out.println("Mariusz");
        System.out.println("Botwina");
        /*wyzej napisalem kolejno
        a) powitanie
        b) Imie
        c) Nazwisko
         */
        int liczba1 = 58;
        double liczba2 = 198273;
        double liczba3 = liczba1 + liczba2;

        System.out.println(liczba3);

        char symbol1 = 'a';
        int symbol2 = symbol1;
        System.out.println("symbol2 = " + symbol2);
        System.out.println(11 & 14);
        int a = 5, b = 8, c = 9;
        if (a == b || b > a) {
            System.out.println("good");
        }

        /* operatory bitowe
        101101 = 2 ^ 5 + 2 ^3 + 2 ^ 2 + 1 = 32  + 8 + 4 + 1 = 45
         */
        System.out.println(45 & 23);
        int g = 7,
                h = 0,
                j = 15;
        if (g < h)
            System.out.println("to jest dobry wynik");
        else if (j == h)
            System.out.println("to tez jest dobry wynik");
        else if (g < j) {
            System.out.println("najprawdziwszy wynik");
            System.out.println("naprawde");
        }

        int numberOne = 5;
        if (numberOne % 2 == 0)
            System.out.println("parzysta");
        else
            System.out.println("nieparzysta");
        int numberTwo = 4;

        String czyparzysta = numberTwo % 2 == 0 ? "parzysta" : "nieparzysta";
        System.out.println(czyparzysta);

        int n = 100;
        for (int i = 0; i < n; i++) //tutaj-c
        {
            //i++ - inkrementacja
            //i-- - dekrementacja
            //kazde przejscie petli - iteracja
            //rekurencja - zagniezdzanie sie funkcji
            System.out.println(i);
            if (i % 2 == 0) {
                i = i + 7;
                continue;
            }
            //stąd-c
            //if (i%10!=0)
            //continue;
            /*
            ... MEGA SUPER DUŻO LOGIKI ...
             */
            System.out.println("TEGO TUTAJ NIE MA");

            int int_g = 0;
            String string_g = "";

            /*
            if (i>50)
                break;
            //stąd-b
            */
        }//tutaj-b


        int i = 0;
        //while
        while (i % 2 == 0) {
            //    System.out.println(i);
            i++;
        }

        //do-while
        //int i=0
        do {
            //System.out.println(i);
            i++;
        }
        while (i % 2 == 0);
        //

       // System.out.println(f_obliczdelta(2, 15, 10));

       // System.out.println(f_obliczdelta(21, 152, 10));

       //System.out.println(f_obliczdelta(2, 15, 7));

       // System.out.println(f_obliczdelta(2, 115, 10));

    }

    int f_dodaj(int a, int b) {
        return a + b;
    }

    double f_obliczdelta(double a, double b, double c) {
        double delta;
        delta = b * b - 4 * a * c;
        return delta;
    
       /*komentarz
}

  /*  void f_rek (int x)
    {
        x = x^0.5;
        System.out.println(x);
        if(waronek==prawda)
            f_rek(x);
        x-x^0.5 < 0.00001
    }*/





