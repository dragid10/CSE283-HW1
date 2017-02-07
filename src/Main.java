import java.net.InetAddress;
import java.net.UnknownHostException;

public class Main {

    public static void main(String[] args) {
        try {
            //	Question 1:
            InetAddress.getByName("localhost").getHostAddress();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
