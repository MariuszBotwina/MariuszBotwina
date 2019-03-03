package pl.sda.javaintro.sda.enumy;

public enum Currency {
    PLN(1),
    USD(3.78),
    EURO(4.3),
    JEN(23),
    FUNT(5);

    Currency(double waluta) {
        this.waluta = waluta;
    }

    private double waluta;

    public double getWaluta() {
        return waluta;
    }
}
