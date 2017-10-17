public class Dir implements Program {

    CurrentDirectory currentDirectory;

    public Dir(CurrentDirectory currentDirectory) {
        this.currentDirectory = currentDirectory;
    }

    @Override
    public String run(String... args) {
        String[] list = currentDirectory.list();
        StringBuilder result = new StringBuilder();
        String delim = "";
        for (String s : list) {
            result.append(delim).append(s);
            delim = "\n";
        }
        return result.toString();
    }

    public String name() {
        return "dir";
    }
}
