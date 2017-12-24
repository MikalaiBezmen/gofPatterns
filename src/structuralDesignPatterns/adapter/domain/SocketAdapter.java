package structuralDesignPatterns.adapter.domain;

/**
 * SocketAdapter интерфейс предоставляющий API для получения различного количество вольт.
 *
 * @author Mikalai Bezmen
 */
public interface SocketAdapter {

    Volt get120Volt();
    Volt get12Volt();
    Volt get3Volt();

}
