package dip.fix;

import java.util.logging.Logger;

public class Button {
    private static final Logger logger = Logger.getLogger(Button.class.getName());
    private Switchable device;

    public Button(Switchable device) {
        this.device = device;
        press();
    }

    public void press() {
        if (device.isWorking()) {
            logger.info(device.getClass().getName() + " in turning off");
            device.turnOff();
        } else {
            logger.info(device.getClass().getName() + " in turning on");
            device.turnOn();
        }
    }

    public void setDevice(Switchable device) {
        this.device = device;
    }
}
