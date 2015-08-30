package ocp.fix;

public class Client {
    private ServerInterface server;

    public ServerInterface getServer() {
        return server;
    }

    public void setServer(ServerInterface server) {
        this.server = server;
    }

    public void connect() {
        server.connect();
    }

    public void disconnect() {
        server.disconnect();
    }
}
