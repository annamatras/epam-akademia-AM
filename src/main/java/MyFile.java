import java.io.File;

public interface MyFile {
    String name();

    MyFileImpl[] listFiles();

    boolean isDirectory();


    boolean isFile();
}
