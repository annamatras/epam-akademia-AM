import java.util.ArrayList;
import java.util.List;


class AppFactory {

    Runner getRunner() {
        ProgramManager manager = getProgramManager();
        Printer printer = getPrinter();
        Input input = getInput();

        return new Runner(manager, printer, input);
    }

    private ProgramManager getProgramManager() {
        CurrentDirectory currentDirectory = getCurrentDirectory();
        List<Program> programs = new ArrayList<>();
        programs.add(getDir(currentDirectory));
        programs.add(getCd(currentDirectory));
        programs.add(getExit());
        return new ProgramManager(programs);
    }

    private Program getDir(CurrentDirectory currentDirectory) {
        return new Dir(currentDirectory);
    }

    private Program getCd(CurrentDirectory currentDirectory){
        return new Cd(currentDirectory);
    }

    private Program getExit() {
        return new Exit();
    }

    private CurrentDirectory getCurrentDirectory() {
        return new CurrentDirectory();
    }

    private Printer getPrinter() {
        return new Printer();
    }

    private Input getInput() {
        return new Input();
    }
}
