import java.util.Scanner;

public class DniTygodnia {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int dzienTygodnia = 3;
        if(dzienTygodnia == 1)
            System.out.println("poniedziałek, zostało 5 dni do weekendu ");
        else if (dzienTygodnia == 2)
            System.out.println("wtorek, zostało 4 dni do weekendu");
        else if (dzienTygodnia == 3)
            System.out.println("sroda, zostało 3 dni do weekendu");
        else if (dzienTygodnia == 4)
            System.out.println("czwartek, zostało 2 dni do weekendu");
        else if (dzienTygodnia == 5)
            System.out.println("piatek, zostało 2 dni do weekendu");
        else
            System.out.println("weekend");


        f_tydzien(2);
        System.out.println("podaj dzien tygodnia");
        int dzien = Integer.parseInt(scanner.next());
        f_tydzien(dzien);
    }


    static void f_tydzien(int dzien){
        /*
        String[] tydzien = new String[5];
        tydzien[0]="poniedzialek";
        tydzien[1]="wtorek";
        tydzien[2]="sroda";
        tydzien[3]="czwartek";
        tydzien[4]="piatek";
        */
        String[] tydzien={"poniedzialek", "wtorek", "sroda", "czwartek", "piatek"};
        dzien=dzien%5;
        System.out.println("dzis jest " + tydzien[dzien-1] + ". Do weekendu zostalo " + (6-dzien) + " dni.");
    }
}
