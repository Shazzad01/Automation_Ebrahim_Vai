package First_Test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class First_Test_Automation extends Base_driver{
    @Test
    public void first_Test() throws InterruptedException {
        driver.manage().window().maximize();//red lines is log information
        driver.get("https://mvnrepository.com/");
        Thread.sleep(5000);
        Assert.assertEquals(driver.getTitle(),"Maven Repository: Search/Browse/Explore");
        //System.out.println(driver.getTitle());


    }
}
