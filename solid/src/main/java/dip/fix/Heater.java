package dip.fix;

public class Heater implements Switchable {

    private boolean working;

    @Override
    public void turnOn() {
        working = true;
    }

    @Override
    public void turnOff() {
        working = false;
    }

    @Override
    public boolean isWorking() {
        return working;
    }
}
