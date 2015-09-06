package dip.violation;

public class Button {

    private Lamp lamp;

    public Button(Lamp lamp) {
        this.lamp = lamp;
    }

    public void press() {
        if (lamp.isWorking()) {
            lamp.turnOff();
        } else {
            lamp.turnOn();
        }
    }
}
