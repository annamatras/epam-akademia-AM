import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TreeTest {
    CurrentDirectory currentDirectory = mock(CurrentDirectory.class);
    Tree tree = new Tree(currentDirectory);

    @Test
    public void oneDirectory() throws Exception {
        MyFile myFile = new FileStub("src");

        when(currentDirectory.listFiles()).thenReturn(new MyFile[] {myFile});

        String result = tree.run();
        assertThat(result).isEqualTo("src");
    }


    @Test
    public void twoDirectoriesOnSameLevel() throws Exception {
        MyFile src = new FileStub("src");
        MyFile target = new FileStub("target");

        when(currentDirectory.listFiles()).thenReturn(new MyFile[] {src, target});

        String result = tree.run();
        assertThat(result).isEqualTo(
                "src\n" +
                "target");
    }

    class FileStub implements MyFile {

        private String name;

        public FileStub(String name) {
            this.name = name;
        }

        @Override
        public String name() {
            return name;
        }

        @Override
        public MyFileImpl[] listFiles() {
            return new MyFileImpl[0];
        }

        @Override
        public boolean isDirectory() {
            return true;
        }

        @Override
        public boolean isFile() {
            return false;
        }

        @Override
        public String toString() {
            return "name='" + name + '\'';
        }
    }
}