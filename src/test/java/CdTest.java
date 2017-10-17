import static org.mockito.Mockito.mock;


public class CdTest{

    private final CurrentDirectory currentDirectory = mock(CurrentDirectory.class);
    private final Cd cd = new Cd(currentDirectory);


}