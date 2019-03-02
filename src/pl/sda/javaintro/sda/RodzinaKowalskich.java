package pl.sda.javaintro.sda;

public class RodzinaKowalskich {
    public static void main(String[] args) {
        Person tata = new Person("Adam ", "Kowalski ", 25);
        Person mama = new Person("Agata ","Kowlaska ", 23);
        Person dziecko = new Person ("dzesika","kowalska", 5);
        System.out.println("To jest rodzina Kowalskich tata " + tata + "mama " + mama + "oraz dziecko " + dziecko);


    }


}

