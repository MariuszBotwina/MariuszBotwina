import java.util.Scanner;

public class ZadaniaDwaZadDrugie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ocena na");
        int ocena = Integer.parseInt(scanner.next());
        if (ocena <= 1) {
            System.out.println("ocena nieodstaeczna");
        } else if (ocena <= 2 ){
            System.out.println("mierny");
        } else if (ocena <= 3 ){
            System.out.println("dostateczna");
        } else if (ocena <= 4){
            System.out.println("dobra");
        } else if (ocena <= 5){
            System.out.println("bardzo dobra");
        }
    }
}