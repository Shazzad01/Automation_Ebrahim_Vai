package First_Test;

import org.testng.annotations.*;

public class TestNGExample {
    @BeforeSuite
    public void before_suite(){
        System.out.println("This is Before Suite");
    }
    @AfterSuite
    public void After_suite(){
        System.out.println("This is After Suite");
    }
    @BeforeTest
    public void before_test(){
        System.out.println("This is before Test");
    }
    @AfterTest
    public void after_suite(){
        System.out.println("This is After Test");
    }
    @BeforeClass
    public void before_class(){
        System.out.println("This is before class");
    }
    @AfterClass
    public void After_class(){
        System.out.println("This is After class");
    }
    @BeforeMethod
    public void before_method(){
        System.out.println("This is before method");
    }
    @AfterMethod
    public void After_mathod(){
        System.out.println("This is after mathod");
    }
    @Test
    public void first_test(){
        System.out.println("This is first Test");
    }
}
