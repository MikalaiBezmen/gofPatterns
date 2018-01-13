package structuralDesignPatterns.adapter.src.impl;

import structuralDesignPatterns.adapter.src.api.SocketAdapter;

/**
 * 1 Способ реализации паттерна {@code Adapter}.
 * Заключается в наследовании от базового класса и имплементации интерфейса адаптера.
 *
 * @author Mikalai Bezmen
 */
//Using inheritance for structuralDesignPatterns.adapter pattern
public class SocketClassAdapterImpl extends Socket implements SocketAdapter {

    @Override
    public Volt get120Volt() {
        return getVolt();
    }

    @Override
    public Volt get12Volt() {
        Volt volt = getVolt();
        return convertVolt(volt, 10);
    }

    @Override
    public Volt get3Volt() {
        Volt volt = getVolt();
        return convertVolt(volt, 40);
    }

    private Volt convertVolt(Volt volt, int i) {
        return new Volt(volt.getVolts() / i);
    }
}
