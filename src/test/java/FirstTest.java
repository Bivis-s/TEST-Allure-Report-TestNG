import io.qameta.allure.Link;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.qameta.allure.Allure.step;

public class FirstTest extends Hook {

    @Test(description = "Test 1 With Retry Analyzer", retryAnalyzer = RetryAnalyzer.class)
    @Link(url = "https://wikipedia.org", type = "Test case")
    public void test1() throws InterruptedException {
        step("Step 1");
        System.out.println(Thread.currentThread().getName() + " | Action 1");
        Thread.sleep(500);

        step("Step 2");
        System.out.println(Thread.currentThread().getName() + " | Action 2");

        Assert.fail("Assert failed");
    }

    @Test(description = "Test 2")
    @Link(url = "https://wikipedia.org", type = "Test case")
    public void test2() throws InterruptedException {
        step("Step 1");
        System.out.println(Thread.currentThread().getName() + " | Action 1");

        Thread.sleep(2000);

        step("Step 2");
        System.out.println(Thread.currentThread().getName() + " | Action 2");
    }
}
