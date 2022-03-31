import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client implements Runnable{
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
            System.out.println("Client failed to connect");
            System.exit(0);
        }
    }
    public Client() {
        try {
            socket = new Socket("",1);
            tgb = new Scanner(System.in);
            out = new PrintWriter(socket.getOutputStream(),true);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        } catch (Exception e){
            System.out.println("Client failed to connect");
            System.exit(0);
        }
    }
    public String Send() {
        return tgb.nextLine();
    }

    @Override
    public void run() {
        String msg = null;
        while (true) {
            try {
                msg = in.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(msg);
        }
    }

    public void stop()  {
        try {
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
