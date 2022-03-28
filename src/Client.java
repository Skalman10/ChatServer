import java.net.Socket;

public class Client {
    private Socket socket;

    public Client(String ip, int port) {
        try {
            socket = new Socket(ip, port);
        } catch (Exception e){
            System.exit(0);
        }
    }
}
