package pl.sda.javaintro.sda.tworzenieObiektow;

public class Person {
    private String name;
    private String nazwisko;
    private int age;

    public Person(String name, String nazwisko, int age) {
        this.name = name;
        this.nazwisko = nazwisko;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", age=" + age +
                '}';
    }
}
