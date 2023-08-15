package First_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LocatorExample extends Base_driver{
    @Test
    public void testLocators() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("https://www.shohoz.com/contact-us");
        Thread.sleep(5000);
        WebElement bus = driver.findElement(By.id("purpose"));
        bus.click();
        Thread.sleep(5000);
    }
    @Test
    public void testlocators_2() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("https://www.shohoz.com/contact-us");
//        WebElement bus = driver.findElement(By.name("purpose"));
//        bus.click();
//        Thread.sleep(5000);
        //ByLinktext
//        WebElement Launch = driver.findElement(By.linkText("Launch"));
//        Launch.click();
//        Thread.sleep(5000);
//        WebElement send = driver.findElement(By.className("btn"));
//        send.click();
//        Thread.sleep(5000);
        WebElement email = driver.findElement(By.xpath("//*[@id=\"form_contact_us\"]/div[3]/div[1]/label/span"));
        //email.sendKeys("abr@gmail.com");
        System.out.println(email.getText());
        //email.getText();
        Thread.sleep(5000);

    }
    @Test
    public void testlocator2() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("https://www.daraz.com.bd/?spm=a2a0e.login_signup.header.dhome.4eba2829IFSAL2#");
        Thread.sleep(5000);
        WebElement find = driver.findElement(By.xpath("//body/div[4]/div[3]/div[1]/div[1]/a[1]/div[2]"));
        find.click();
        Thread.sleep(5000);
    }
}
