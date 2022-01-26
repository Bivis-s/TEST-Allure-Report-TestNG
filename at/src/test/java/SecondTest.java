import io.qameta.allure.Link;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static io.qameta.allure.Allure.step;

@Listeners({AfterAllSuitesExecutionListener.class})
public class SecondTest extends Hook {

    @Test(description = "Test 1")
    @Link(url = "https://wikipedia.org", type = "Test case")
    public void test1() {
        step("Step 1");
        System.out.println(Thread.currentThread().getName() + " | Action 1");

        step("Step 2");
        System.out.println(Thread.currentThread().getName() + " | Action 2");
    }

    @Test(description = "Test 2")
    @Link(url = "https://wikipedia.org", type = "Test case")
    public void test2() {
        step("Step 1");
        System.out.println(Thread.currentThread().getName() + " | Action 1");

        step("Step 2");
        System.out.println(Thread.currentThread().getName() + " | Action 2");

        Assert.fail("Assert failed");
    }
}
