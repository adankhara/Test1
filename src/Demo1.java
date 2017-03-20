import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Demo1 {

    public static void main(String[] args)
    {
        NopCommerceRegistration nopCommerce = new NopCommerceRegistration();
        nopCommerce.Register();
    }
}
