package pl.sda.javaintro.sda;

public class Zwierze {
    private String gatunek;
    private String rodzajZeWzgleduNaJedzenie;
    private String agresja;

    public Zwierze(String gatunek, String rodzajZeWzgleduNaJedzenie, String agresja) {
        this.gatunek = gatunek;
        this.rodzajZeWzgleduNaJedzenie = rodzajZeWzgleduNaJedzenie;
        this.agresja = agresja;
        System.out.println("Bog stworzyl zwierze " + gatunek);
    }

    public Zwierze() {
        this.gatunek = "gatunek";
        this.rodzajZeWzgleduNaJedzenie = "rodzajZeWzgleduNaJedzenie";
        this.agresja = "agresja";


    }


    @Override
    public String toString() {
        return "Zwierze{" +
                "gatunek='" + gatunek + '\'' +
                ", rodzajZeWzgleduNaJedzenie='" + rodzajZeWzgleduNaJedzenie + '\'' +
                ", agresja='" + agresja + '\'' +
                '}';
    }
}
