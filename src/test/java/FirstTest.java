import io.qameta.allure.Link;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.qameta.allure.Allure.step;

public class FirstTest extends Hook {

    @Test(description = "Test 1")
    @Link(url = "https://wikipedia.org", type = "Test case")
    public void test1() {
        step("Step 1");
        System.out.println("Action 1");

        step("Step 2");
        System.out.println("Action 1");

        Assert.fail("Assert failed");
    }

    @Test(description = "Test 2")
    @Link(url = "https://wikipedia.org", type = "Test case")
    public void test2() {
        step("Step 1");
        System.out.println("Action 1");

        step("Step 2");
        System.out.println("Action 1");
    }
}
