public class Car {
    private String brand;
    private String color;
    private int speed;
    private int door;

    public Car(String brand, String color, int speed, int door) {
        this.brand = brand;
        this.color = color;
        this.speed = speed;
        this.door = door;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", speed=" + speed +
                ", door=" + door +
                '}';
    }
}






