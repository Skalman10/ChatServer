import java.net.ServerSocket;

public class Server extends Client {
    private ServerSocket serverSocket;
    private int port;

    public Server(int port) {
        this.port = port;
    }
}
