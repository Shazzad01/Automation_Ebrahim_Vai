package First_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

@Test
public class WebElementCommandsExample extends Base_driver{
    String url = "https://demoqa.com/automation-practice-form";
    public void webElementTest() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get(url);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        Thread.sleep(5000);

        js.executeScript("window.scrollTo(0,0)");
        Thread.sleep(5000);
        WebElement firstName = driver.findElement(By.xpath("//input[@id='firstName']"));
        firstName.sendKeys("Md");
        Thread.sleep(5000);
        WebElement gender = driver.findElement(By.xpath("//label[normalize-space()='Male']"));
        gender.click();
        Thread.sleep(5000);
        WebElement lastName = driver.findElement(By.xpath("//input[@id='lastName']"));
        lastName.clear();
        lastName.sendKeys("Shazzad");
        Thread.sleep(5000);
        WebElement email = driver.findElement(By.xpath("//input[@id='userEmail']"));
        System.out.println("Attribute value: "+email.getAttribute("placeholder"));
        System.out.println("Attribute value: "+email.getAttribute("pattern"));
        Thread.sleep(5000);

        WebElement Text = driver.findElement(By.xpath("//h5[normalize-space()='Student Registration Form']"));
        String formValue = Text.getText();
        System.out.println( formValue);
        Thread.sleep(5000);

        System.out.println(Text.getCssValue("font-size"));
        System.out.println(Text.getCssValue("color"));

        if (email.isDisplayed()){
            email.sendKeys("Test@noemail.com");
            Thread.sleep(5000);
        }else {
            System.out.println("Email address is not locateable");
        }

        WebElement sports = driver.findElement(By.xpath("//label[normalize-space()='Sports']"));
        js.executeScript("arguments[0].scrollIntoView(true);", sports);
        if (!sports.isSelected()){
            sports.click();
            Thread.sleep(5000);
        }else {
            System.out.println("Sports is already selected.");
        }

        if (!sports.isSelected()){
            sports.click();
            Thread.sleep(5000);
        }else {
            System.out.println("Sports is already selected.");
        }
        WebElement city = driver.findElement(By.xpath("//div[@id='stateCity-wrapper']//div[3]"));
        js.executeScript("arguments[0].scrollIntoView(true);", city);
        if (!city.isEnabled()){
            System.out.println("enable");
        }else {
            System.out.println("City is not enable");
        }


    }
}
