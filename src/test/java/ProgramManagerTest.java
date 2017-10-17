import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ProgramManagerTest {

    @Test
    public void returnRelevantProgram() throws Exception {
        CurrentDirectory currentDirectory = new CurrentDirectory();
        Dir dir = new Dir(currentDirectory);
        Cd cd = new Cd(currentDirectory);

        List<Program> programs = new ArrayList<>();
        programs.add(dir);
        programs.add(cd);
        ProgramManager manager = new ProgramManager(programs);

        Program result = manager.chooseProgram("dir");
        assertThat(result).isEqualTo(dir);

        Program resultCd = manager.chooseProgram("cd");
        assertThat(resultCd).isEqualTo(cd);
    }
}