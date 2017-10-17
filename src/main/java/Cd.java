class Cd implements Program {

    private CurrentDirectory currentDirectory;

    Cd(CurrentDirectory currentDirectory) {
        this.currentDirectory = currentDirectory;
    }

    @Override
    public String run(String... args) {
        if (args.length > 0) {
            return currentDirectory.newDir(args[0]);
        } else {
            return currentDirectory.newDir("");
        }
    }

    @Override
    public String name() {
        return "cd";
    }
}
