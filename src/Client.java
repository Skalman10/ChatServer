import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    private Socket socket;
    private Scanner tgb;
    private PrintWriter out;
    private BufferedReader in;

    public Client(String ip, int port) {
        try {
            socket = new Socket(ip, port);
            tgb = new Scanner(System.in);
            out = new PrintWriter(socket.getOutputStream(),true);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        } catch (Exception e){
            System.exit(0);
        }
    }
    public Client() {

    }
}
