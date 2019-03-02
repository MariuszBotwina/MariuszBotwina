package pl.sda.javaintro.sda;

import java.util.Scanner;

public class Zadania2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj liczba ");
        int liczba1 = Integer.parseInt(scanner.next());
        if (liczba1 <= 0) {
            System.out.println("mniejsza lub równe 0");
        } else if (liczba1 <= 10) {
            System.out.println("przedzial 1-10");
        } else if (liczba1 <= 100) {
            System.out.println("przedział 11-100");
        } else if (liczba1 <= 1000) {
            System.out.println("przedział 101-1000");
        } else if (liczba1 <= 10000) {
            System.out.println("przedział 1001-10000");
        }
/*zadanie kolejne*/
        System.out.println("podaj kolejna cyferke");
            //String s = scanner.next();
          //char a = s.charAt(0);
        int a=Integer.parseInt(scanner.next());


        switch (a) {
            case 1:
                System.out.println("I");
                break;
            case 2:
                System.out.println("II");
                break;
            case 3:
                System.out.println("III");
                break;
            case 4:
                System.out.println("IV");
                break;
            case 5:
                System.out.println("V");
                break;
            case 6:
                System.out.println("VI");
                break;
            case 7:
                System.out.println("VII");
                break;
            case 8:
                System.out.println("VIII");
                break;
            case 9:
                System.out.println("IX");
                default:
                    System.out.println("Nie obsługuje");

        }
    }}
