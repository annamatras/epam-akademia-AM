public class Exit implements Program {


    @Override
    public String run(String... args) {
        System.exit(0);
        return "";
    }

    @Override
    public String name() {
        return "exit";
    }
}
