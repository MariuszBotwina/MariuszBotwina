package pl.sda.javaintro.sda.ifSwitch;

import java.util.Scanner;

public class zadanie {
   static void f_uniCode(int u)
    {
        if(u>=48 && u<=57)  //48<=u<=57
        {
            System.out.println("ten uniCode jest cyfrą");
        }
        else if(u>=97 && u<=122)
            System.out.println("ten uniCode jest małą literą");
        else if(u>=65 && u<=90)
            System.out.println("ten uniCode jest wielka litera");
        else
            System.out.println("nie wiadomo co");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj uniCode");
         f_uniCode(Integer.parseInt(scanner.next()));
       // f_uniCode (80);
       // f_uniCode(110);
    }
}
