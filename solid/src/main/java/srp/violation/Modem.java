package srp.violation;

public interface Modem {
    void dial(String number);
    void hangup();
    void send(char c);
    char revice();
}
