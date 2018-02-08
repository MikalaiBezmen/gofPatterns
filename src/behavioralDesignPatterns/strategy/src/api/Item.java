package behavioralDesignPatterns.strategy.src.api;

/**
 * Item.
 *
 * @author Mikalai Bezmen
 */
public class Item {

    private String upcCode;
    private int price;

    /**
     * Constructor.
     *
     * @param upcCode UPC code
     * @param price   price
     */
    public Item(String upcCode, int price) {
        this.upcCode = upcCode;
        this.price = price;
    }

    /**
     * @return UPC code.
     */
    public String getUpcCode() {
        return upcCode;
    }

    /**
     * @return price.
     */
    public int getPrice() {
        return price;
    }
}
