import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("server or client?");
        if (in.next().equals("server")) {
            new Client();
        } else {
            new Server();
        }
    }
}
