import java.io.File;

public class MyFileImpl implements MyFile {

    private File file;

    MyFileImpl(File file) {
        this.file = file;
    }

    public String name() {
        return file.getName();
    }

    public MyFileImpl[] listFiles() {
        File[] files = file.listFiles();
        MyFileImpl[] result = new MyFileImpl[files.length];

        for(int i = 0; i<files.length; i++) {
            result[i] = new MyFileImpl(files[i]);
        }
        return result;
    }

    public boolean isDirectory() {
        return file.isDirectory();
    }

    @Override
    public boolean isFile() {
        return file.isFile();
    }
}
