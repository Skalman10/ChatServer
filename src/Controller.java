import javax.swing.*;
import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {
            String ip = (String) JOptionPane.showInputDialog(null,"IP?","Connect to..",JOptionPane.QUESTION_MESSAGE);
            int port = Integer.parseInt(JOptionPane.showInputDialog(null,"Port?","Connect to..",JOptionPane.QUESTION_MESSAGE));
            Client client = new Client(ip,port);
            client.run();
            while () {

            }
        }
    }
