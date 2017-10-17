class Runner {

    private final ProgramManager manager;
    private final Printer printer;
    private final Input input;

    public Runner(ProgramManager manager, Printer printer, Input input) {
        this.manager = manager;
        this.printer = printer;
        this.input = input;
    }

    void run() {
        while (true) {
            String userInput = input.read();
            String[] inputs = userInput.split(" ");

            Program program = manager.chooseProgram(inputs[0]);
            if (inputs.length  == 1) {
                printer.print(program.run());
            } else {
                printer.print(program.run(inputs[1]));
            }
        }
    }

}
