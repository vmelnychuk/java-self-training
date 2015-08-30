package ocp.violation;

public class Client {
    private Server server;

    public Server getServer() {
        return server;
    }

    public void setServer(Server server) {
        this.server = server;
    }

    public void connect() {
        server.connect();
    }

    public void disconnect() {
        server.disconnect();
    }
}
