package First_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

@Test
public class NavigationCommandsExample extends Base_driver{
    String url = "https://www.daraz.com.bd/";

    public void navigateTest() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get(url);
        WebElement signUp = driver.findElement(By.xpath("//a[normalize-space()='Signup / Login']"));

        signUp.click();
        Thread.sleep(3000);

        driver.navigate().back();
        Thread.sleep(3000);

        driver.navigate().forward();
        Thread.sleep(3000);

        driver.navigate().refresh();
        Thread.sleep(3000);
    }
}
