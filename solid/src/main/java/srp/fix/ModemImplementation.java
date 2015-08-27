package srp.fix;

public class ModemImplementation implements Connection, DataChannel {
    @Override
    public void dial(String number) {
    }

    @Override
    public void hangup() {
    }

    @Override
    public void send(char c) {
    }

    @Override
    public char recive() {
        return 0;
    }
}
