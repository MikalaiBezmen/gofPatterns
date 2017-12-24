package creationalDesignPatterns.singletone;

/**
 * ChocolateBoilerInitInstance.
 * Date: 07/23/2017
 *
 * @author Mikalai Bezmen
 */
public class ChocolateBoilerInitInstance {

    private static ChocolateBoilerInitInstance chocolateBoilerInitInstance = new ChocolateBoilerInitInstance();
    private boolean empty;
    private boolean boiled;

    private ChocolateBoilerInitInstance() {
        empty = true;
        boiled = true;
    }

    public static ChocolateBoilerInitInstance getInstance() {
        return chocolateBoilerInitInstance;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            // заполнение ёмкости нагревателя молочно-шоколадной смесью
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            // Слить нагретое молоко и шоколад
            empty = true;
        }
    }

    public void boil() {
        if (!isBoiled() && !isEmpty()) {
            // Довести до кипения
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public void setEmpty(boolean empty) {
        this.empty = empty;
    }

    public boolean isBoiled() {
        return boiled;
    }

    public void setBoiled(boolean boiled) {
        this.boiled = boiled;
    }
}
