public class CurrentPrompt {

    private final String defaultPrompt = "$>";
    private String customPropt;
    private String cwdPrompt;
    private boolean isCwd;

    public CurrentPrompt() {
    }

    public CurrentPrompt(String cwdPrompt) {
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
}
