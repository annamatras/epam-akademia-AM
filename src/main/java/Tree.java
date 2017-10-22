class Tree implements Program {

    private CurrentDirectory currentDirectory;

    Tree(CurrentDirectory currentDirectory) {

        this.currentDirectory = currentDirectory;
    }

    @Override
    public String run(String... args) {

        MyFile[] files = currentDirectory.listFiles();
        return searchFiles(files, 0);
    }

    private String searchFiles(MyFile[] files, int indent) {
        String result = "";
        String dash = "";
        for(int i = 0; i < indent; i++) {
            dash += "-";
        }
        for (int i = 0, filesLength = files.length; i < filesLength; i++) {
            MyFile f = files[i];
            if (f.isFile()) {
                result += dash + f.name() + "\n";
            }
            if (f.isDirectory()) {
                result += dash + f.name() + newLineIfNeeded(files, indent, i);
                result += searchFiles(f.listFiles(), indent + 1);
            }
        }
        return result;
    }

    private String newLineIfNeeded(MyFile[] files, int indent, int i) {
        return isLastElementOnLevelZero(files, indent, i)
                ? "" : "\n";
    }

    private boolean isLastElementOnLevelZero(MyFile[] files, int indent, int i) {
        return files.length - 1 == i && indent == 0;
    }

    @Override
    public String name() {
        return "tree";
    }
}

