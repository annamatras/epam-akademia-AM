import java.util.List;

class ProgramManager {

    private List<Program> programs;

    ProgramManager(List<Program> programs) {
        this.programs = programs;
    }

    Program chooseProgram(String command) {
        for (Program program : programs) {
            if (program.name().equals(command))
                return program;
        }
        throw new IllegalArgumentException("Invalid input: " + command);
    }
}
