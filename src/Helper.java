import java.util.Scanner;

public class Helper {
    public static int askIntValue() {
        Scanner scanner = new Scanner(System.in);
        try {
            return Integer.parseInt(scanner.next());
        } catch (Exception ex) {
            System.out.println("Invalid given value for type int");
            throw ex;
        }
    }
}
