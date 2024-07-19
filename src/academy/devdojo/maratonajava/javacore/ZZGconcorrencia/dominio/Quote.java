package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.dominio;

public class Quote {
    private final String storeName;
    private final double price;
    private final Discount.Code discountCode;

    private Quote(String storeName, double price, Discount.Code discountCode) {
        this.storeName = storeName;
        this.price = price;
        this.discountCode = discountCode;
    }

    /**
     * Cria um objeto Quote com o seguinte padrão: 'storeName:price:discountCode'
     * @param value contém storeName:price:discountCode
     * @return new Quote with values from @param value
     */
    public static Quote newQuote(String value) {
        String[] values = value.split(":");
        return new Quote(values[0], Double.parseDouble(values[1]), Discount.Code.valueOf(values[2]));
    }

    public String getStoreName() {
        return storeName;
    }

    public double getPrice() {
        return price;
    }

    public Discount.Code getDiscountCode() {
        return discountCode;
    }

    @Override
    public String toString() {
        return "Quote{" +
                "storeName='" + storeName + '\'' +
                ", price=" + price +
                ", discountCode=" + discountCode +
                '}';
    }
}
