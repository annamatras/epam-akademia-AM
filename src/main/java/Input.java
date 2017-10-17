import java.util.Scanner;

public class Input {

    private Scanner scanner = new Scanner(System.in);

    public String read() {
        scanner.useDelimiter(System.getProperty("line.separator"));
        return scanner.next();
    }
}
