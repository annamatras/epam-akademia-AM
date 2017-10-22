import java.util.Scanner;

class Input {

    private String defaultPrompt = "$>";

    private Scanner scanner = new Scanner(System.in);

    String read() {
        System.out.println("Use command: cd, dir and exit are already implemented");
        System.out.println(defaultPrompt);
        scanner.useDelimiter(System.getProperty("line.separator"));
        return scanner.next();
    }
}
