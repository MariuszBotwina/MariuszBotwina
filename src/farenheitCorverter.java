import java.util.Scanner;

public class farenheitCorverter {
    public static void main(String[] args) {
        int fahr = 212;
        double cel = (fahr - 32 ) / 1.8;
        System.out.println(cel);
        convertToCelsius(185);
        convertToCelcius();
    }
    static void convertToCelsius(double temperatureInFahrenheit){
        double cel = (temperatureInFahrenheit - 32 ) / 1.8;
        System.out.println(cel);

    }
    static void convertToCelcius( ){
        System.out.println("podaj farenhite");
        Scanner s = new Scanner(System.in);
        double cel = (Integer.parseInt(s.next())- 32 ) / 1.8;
        System.out.println(cel);
    }
}
