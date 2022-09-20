/**
 * Created by LaunchCode
 */
import java.util.Scanner;
public class HelloWorld {

    public static void main(String[] args) {
        System.out.println(sayHello());
    }

    public static String sayHello() {
        Scanner input;
        input = new Scanner(System.in);
        System.out.println("Hello, World!");
        return "Hello, World!";
    }

}
