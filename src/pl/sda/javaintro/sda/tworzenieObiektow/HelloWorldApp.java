package pl.sda.javaintro.sda.tworzenieObiektow;

import pl.sda.javaintro.sda.tworzenieObiektow.Car;

public class HelloWorldApp {
    public static void main(String[] args) {
        Car toyota = new Car ("Toyota","black",145,4);
        System.out.println("My car is" + toyota);
        Car mercedes = new Car ("mercedes","red",250,4);
        System.out.println("My car is " + mercedes);
    }
}
