import java.util.Scanner;

public class Prompt implements Program {

    private CurrentPrompt currentPrompt;

    public Prompt(CurrentPrompt currentPrompt) {
        this.currentPrompt = currentPrompt;
    }

    @Override
    public String run(String... args) {
        System.out.println("Create new prompt:");
        String userInput = args[0];
            if (userInput.equals("$>")) {
                currentPrompt.setCwd(true);
                currentPrompt.setPrompt(userInput);
            } else {
                currentPrompt.setCwd(false);
                currentPrompt.setPrompt(userInput.split(" ")[1]);
            }
            return "";
        }

    @Override
    public String name() {
        return "prompt";
    }
}
