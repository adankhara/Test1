import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * Created by Jagdish on 20/03/2017.
 */
public class NopCommerceRegistration {
    private String _email;
    private String _password;

    public NopCommerceRegistration()
    {
        Random rand = new Random();

        int  n = rand.nextInt(50) + 1;
        _email = "dankhara" + n +"@gmail.com";
        _password = "fairy123";
    }

    public String GetEmail()
    {
        return _email;
    }

    public String GetPassword()
    {
        return _password;
    }

    public void Register()
    {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.linkText("Register")).click();
        //driver.findElement(By.id("gender-female")).click();
        //driver.findElement(By.xpath("//input[@id='gender-male']")).click();
        driver.findElement(By.xpath("//input[(@name='Gender') and (@value='F')]")).click();

        driver.findElement(By.id("FirstName")).sendKeys("Asha");
        driver.findElement(By.id("LastName")).sendKeys("Dankhara");
        driver.findElement(By.id("Email")).sendKeys(_email);
        driver.findElement(By.id("Company")).sendKeys("Hannah");
        driver.findElement(By.id("Newsletter")).click();
        driver.findElement(By.id("Password")).sendKeys(_password);
        driver.findElement(By.id("ConfirmPassword")).sendKeys(_password);
        /*
        driver.findElement(By.id("register-button")).click();
        String expectedResult = "Your registration completed";
        String actualResult = driver.findElement(By.className("result")).getText();
        Assert.assertEquals(expectedResult,actualResult);
        */
    }
}
