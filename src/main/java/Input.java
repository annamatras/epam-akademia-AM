import java.util.Scanner;

class Input {

    private Scanner scanner = new Scanner(System.in);

    String read() {
        System.out.println("Use command: cd, dir or exit are already implemented");
        System.out.println("$>");
        scanner.useDelimiter(System.getProperty("line.separator"));
        return scanner.next();
    }
}
