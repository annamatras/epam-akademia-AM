import java.util.Scanner;

public class Prompt implements Program {

    private final String defaultPrompt = "$>";
    private String customPropt;
    private String cwdPrompt;
    private boolean isCwd;
    private Input input;
    private Object currentDirectory;
    private Scanner scanner;


    public Prompt(String cwdPrompt) {
        customPropt = "$>";
        this.cwdPrompt = cwdPrompt;
        isCwd = false;
    }

    public void setCwd(boolean cwd) {
        isCwd = cwd;
    }

    void setCwdPrompt(String cwdPrompt) {
        this.cwdPrompt = cwdPrompt;
        if (isCwd) setCustomPrompt(cwdPrompt);
        System.out.println(customPropt);
    }

    void setCustomPrompt(String newPrompt) {
        customPropt = newPrompt + ">";
    }

    void setPromptToDefault() {
        customPropt = defaultPrompt;
    }

    void setPrompt(String newPropmt) {
        if (newPropmt.equals("reset")) {
            setPromptToDefault();
        }
        else if (newPropmt.equals("$cwd")) {
            isCwd = true;
            setCwdPrompt(newPropmt);
        } else {
            setCustomPrompt(newPropmt);
        }
    }

    @Override
    public String run(String... args) {
        System.out.println("Create new prompt:");
        String userInput = input.read();
            if (userInput.equals("$>")) {
                setCwd(true);
                setPrompt(userInput);
            } else {
                setCwd(false);
                setPrompt(userInput.split(" ")[1]);
            }
            return "";
        }

    @Override
    public String name() {
        return "prompt";
    }
}
