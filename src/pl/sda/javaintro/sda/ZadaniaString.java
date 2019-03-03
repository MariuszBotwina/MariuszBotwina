package pl.sda.javaintro.sda;

public class ZadaniaString {



    public static void main(String[] args) {
        String text2 = "Hello ";
        String text = "Simon Says";
        System.out.println(text.toLowerCase()+ " " + text2
                .trim()
                .toLowerCase()
        );
        StringBuilder nazwa = new StringBuilder("simon says ").append("Hello World").replace(11,16,"Beautyfull");
        System.out.println(nazwa);

    }

}
