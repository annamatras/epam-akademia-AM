import java.util.Scanner;

class Input {

    private Scanner scanner = new Scanner(System.in);

    String read() {
        scanner.useDelimiter(System.getProperty("line.separator"));
        return scanner.next();
    }
}
