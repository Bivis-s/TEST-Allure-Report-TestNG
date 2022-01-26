import org.testng.annotations.BeforeMethod;

public class Hook {
    @BeforeMethod(alwaysRun = true)
    public void precondition() {
        System.out.println("precondition");
    }
}
