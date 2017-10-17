import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


public class CdTest{

    private final CurrentDirectory currentDirectory = mock(CurrentDirectory.class);
    private final Cd cd = new Cd(currentDirectory);

    @Test
    public void changeCurrentDirectory() throws Exception {
        when(currentDirectory.newDir("src")).thenReturn("/home/user");

        String result = cd.run("src");

        assertThat(result).isEqualTo("/home/user");
        verify(currentDirectory).newDir("src");
    }

    @Test
    public void printCurrentDirectoryWhenNoArguments() throws Exception {
        when(currentDirectory.newDir(any())).thenReturn("/home/user");

        String result = cd.run();

        assertThat(result).isEqualTo("/home/user");
    }

}