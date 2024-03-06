package AdapterDesignPattern.model;

import AdapterDesignPattern.interfaces.SocketAdapter;

public class SocketAdapterImplementation extends Socket implements SocketAdapter {
    @Override
    public Volt get120Volts() {
        return getVolt();
    }

    @Override
    public Volt get12Volts() {
        Volt v = get1Volts();
        return convertVolt(v, 10);
    }

    @Override
    public Volt get3Volts() {
        Volt v = get1Volts();
        return convertVolt(v,40);
    }

    @Override
    public Volt get1Volts() {
        return get1Volts();
    }

    private Volt convertVolt(Volt v, int i){
        return new Volt(v.getVolts()/i);
    }
}
