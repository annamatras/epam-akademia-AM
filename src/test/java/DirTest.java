import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class DirTest {

    @Test
    public void printAllFilesInCurrentDirectory() throws Exception {

        CurrentDirectory currentDirectory = mock(CurrentDirectory.class);
        String[] files = {".", "src", "main"};
        when(currentDirectory.list()).thenReturn(files);
        Dir dir = new Dir(currentDirectory);

        String result = dir.run();

        assertThat(result).isEqualTo(".\nsrc\nmain");
    }
}