import java.io.IOException;
import java.net.ServerSocket;

public class Server extends Client {
    private ServerSocket serverSocket;
    private int port;
    private Client ServerClient;

    public Server(int port) {
        try {
            serverSocket = new ServerSocket(port);
        } catch (IOException e) {

        }
    }
}
