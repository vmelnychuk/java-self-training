package dip.violation;

public class Lamp {

    private boolean working;

    void turnOff() {
        if (isWorking()) {
            working = false;
        }
    }

    void turnOn() {
        if (!isWorking()) {
            working = true;
        }
    }

    public boolean isWorking() {
        return working;
    }
}
