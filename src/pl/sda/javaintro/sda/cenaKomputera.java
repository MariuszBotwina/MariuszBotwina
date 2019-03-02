package pl.sda.javaintro.sda;

import java.util.Scanner;

public class cenaKomputera {
    public static void main(String[] args) {
        int płytaGłów = 350;
        int procesor = 250;
        int pamiecRam = 158;
        int dyskTwardy = 134;
        int monitor = 450;
        double vat1 = (procesor + pamiecRam + płytaGłów + dyskTwardy) * 1.23;
        double vat2 = monitor  * 1.23;
        System.out.println("cena komputera=" + vat1);
        System.out.println("cena monitora=" + vat2);

        getComputerPrice();
        getMonitorPrice();
    }
    static void getComputerPrice(int procesor, int pamiecRam, int płytaGłów, int dyskTwardy){
        double vat1 = (procesor + pamiecRam + płytaGłów + dyskTwardy) * 1.23;
        System.out.println("cena komputera "  + vat1);

    }
    static void getMonitorPrice (int monitor){
        double vat2 = monitor  * 1.23;
        System.out.println("cena monitora " + vat2);
    }
    static void getMonitorPrice(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj cene monitora");
        double vat2 = (Integer.parseInt(scan.next())  * 1.23);
        System.out.println("cena monitora "+ vat2);
    }
    static void getComputerPrice(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj cene procesora");
        int procesor = (Integer.parseInt(scan.next()));
        System.out.println("podaj cene pamieci ram");
        int pamiecRam = (Integer.parseInt(scan.next()));
        System.out.println("podaj cene plyty glownej");
        int plytaGlowna = (Integer.parseInt(scan.next()));
        System.out.println("podaj cene dysku twardego");
        int dyskTwardy = (Integer.parseInt(scan.next()));
        double vat1 = (procesor + pamiecRam + plytaGlowna + dyskTwardy) * 1.23;
        System.out.println("cena komputera wyosi " + vat1);

    }


}
