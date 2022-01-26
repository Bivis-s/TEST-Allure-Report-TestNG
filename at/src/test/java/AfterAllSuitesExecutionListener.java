import org.testng.IExecutionListener;

public class AfterAllSuitesExecutionListener implements IExecutionListener {
    @Override
    public void onExecutionStart() {
        System.out.println("On Execution Start");
    }

    @Override
    public void onExecutionFinish() {
        System.out.println("On Execution Finish");
    }
}
