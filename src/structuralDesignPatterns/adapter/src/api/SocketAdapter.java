package structuralDesignPatterns.adapter.src.api;

import structuralDesignPatterns.adapter.src.impl.Volt;

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
