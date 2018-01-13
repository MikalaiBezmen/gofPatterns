package structuralDesignPatterns.adapter.src.impl;

import structuralDesignPatterns.adapter.src.api.SocketAdapter;

/**
 * 2 Способ реализации паттерна {@code Adapter}.
 * Отличие от первого способа в том что предпочтение отдаётся Композиции вместо Наследования.
 *
 * @author Mikalai Bezmen
 */
public class SocketObjectAdapterImpl implements SocketAdapter {

    //Using Composition for structuralDesignPatterns.adapter pattern
    private Socket socket = new Socket();

    @Override
    public Volt get120Volt() {
        return socket.getVolt();
    }

    @Override
    public Volt get12Volt() {
        Volt volt = socket.getVolt();
        return convertVolt(volt, 10);
    }

    @Override
    public Volt get3Volt() {
        Volt volt = socket.getVolt();
        return convertVolt(volt, 40);
    }

    private Volt convertVolt(Volt volt, int i) {
        return new Volt(volt.getVolts() / i);
    }
}
