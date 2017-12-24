package creationalDesignPatterns.singletone;

import java.util.Objects;

/**
 * ChocolateBoilerSync.
 * Date: 07/22/2017
 *
 * @author Mikalai Bezmen
 */
public class ChocolateBoilerSync {

    private static ChocolateBoilerSync chocolateBoilerSync;
    private boolean empty;
    private boolean boiled;

    private ChocolateBoilerSync() {
        empty = true;
        boiled = true;
    }

    public synchronized static ChocolateBoilerSync getInstance() {
            return Objects.isNull(chocolateBoilerSync)
                    ? new ChocolateBoilerSync()
                    : chocolateBoilerSync;
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
