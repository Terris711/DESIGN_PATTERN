package AdapterDesignPattern.model;

import AdapterDesignPattern.interfaces.SocketAdapter;

import javax.accessibility.AccessibleContext;

public class SocketObjectAdapterImplementation implements SocketAdapter {
    // Using composition for adapter pattern
    private Socket socket = new Socket();

    @Override
    public Volt get120Volts() {
        return socket.getVolt();
    }

    @Override
    public Volt get12Volts() {
        Volt v = socket.getVolt();
        return convertVolt(v, 10);
    }

    @Override
    public Volt get3Volts() {
        Volt v = socket.getVolt();
        return convertVolt(v, 40);
    }

    @Override
    public Volt get1Volt() {
        return get1Volt();
    }

    private Volt convertVolt(Volt v, int i){
        return new Volt(v.getVolts()/i);
    }
}
