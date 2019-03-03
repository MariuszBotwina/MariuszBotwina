package pl.sda.javaintro.sda.enumy;

public enum Operation {
    PLUS("+"),
    MINUS("-"),
    MULITIPLY("*"),
    DIVIDE("/");
    private String symbol;



    Operation(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }
    public double calculated(double a, double b){
        double result = 0.0;
        switch (this){
            case PLUS:
                result = a + b;
                break;
            case MINUS:
                result = a - b;
                break;
            case MULITIPLY:
                result = a * b;
                break;
           case DIVIDE:
               result = a / b;
               break;
        }
        return result;
    }

}


