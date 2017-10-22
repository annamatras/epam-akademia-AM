import java.io.File;

class CurrentDirectory {

    private File file;

    CurrentDirectory() {
        file = new File("");
    }

    String[] list() {
        return file.list();
    }

    String newDir(String command) {
        String path = file.getAbsolutePath();
        File newFile = new File(path + File.separator + command);
        if (newFile.isDirectory()) {
            file = newFile;
            return file.getAbsolutePath();
        } else {
            System.out.println("Directory not found: " + newFile.getAbsolutePath());
            return file.getAbsolutePath();
        }
    }

    String getCurrentDirName() {
        return file.getName();
    }

    public File getCurrentDir() {
        return file;
    }

    public MyFile[] listFiles() {
        return new MyFileImpl(getCurrentDir()).listFiles();

    }
}
