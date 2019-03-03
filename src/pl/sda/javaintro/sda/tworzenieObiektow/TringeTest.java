package pl.sda.javaintro.sda.tworzenieObiektow;

import pl.sda.javaintro.sda.tworzenieObiektow.Triangle;

public class TringeTest {
    public static void main(String[] args) {
         Triangle triangle = new Triangle();
                 int a = 3;
                 int b = 4;
                 int c = 5;
                 triangle.isRectangular(a, b, c);
                 boolean isRectangular;
        if (triangle.isRectangular(3, 4, 5)) isRectangular = true;
        else isRectangular = false;
        System.out.println(isRectangular);


    }
}
