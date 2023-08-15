package First_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class BrowserCommandsExample extends Base_driver{

    String url = "https://www.daraz.com.bd/";
    @Test
    public void browserCommandTest() throws InterruptedException {
       driver.manage().window().maximize();
       driver.get(url);

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        WebElement signUp = driver.findElement(By.xpath("//a[normalize-space()='Signup / Login']"));
        signUp.click();
        Thread.sleep(5000);

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
    }

}
