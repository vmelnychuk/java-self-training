package dip.fix;

public class Usage {
    public static void main(String[] args) {
        Button button = new Button(new Lamp());
        button.press();

        button.setDevice(new Heater());
        button.press();
    }
}
