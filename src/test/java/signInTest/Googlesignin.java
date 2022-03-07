package signInTest;
import base.Base;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import signInLocators.SingInLocators;

import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
public class Googlesignin extends Base {

    @Test(priority = 1)
    public void SignInGoogle() throws InterruptedException, IOException {
        File directory = new File("./");
        System.out.println(directory.getAbsolutePath());
        String configFileName = "./src/main/resources/%s.properties";
        Properties props = new Properties();
        String EnvironmentName = System.getProperty("Environment");
        configFileName = String.format(configFileName, EnvironmentName);
        props.load(new FileInputStream(new File(configFileName)));
        Thread.sleep(5000);
        SingInLocators Signin = PageFactory.initElements(driver, SingInLocators.class);
        String email = props.getProperty("userName");
        String password = props.getProperty("password");
        String firstname = props.getProperty("firstname");
        String gemail = props.getProperty("googlemail");
        String gpassword = props.getProperty("googlepassword");
        Signin.etsysignin.click();
        Thread.sleep(5000);
        Signin.clickgmail.click();
        Thread.sleep(4000);
        driver.getWindowHandles().forEach(tab -> driver.switchTo().window(tab));
        driver.manage().window().maximize();
        Thread.sleep(5000);
        Signin.gemail.sendKeys(gemail);
        Thread.sleep(3000);
        Signin.clicknext.click();
        Thread.sleep(2000);
        Signin.gpassword.sendKeys(gpassword);
        Thread.sleep(2000);
        Signin.clicknext.click();
        Thread.sleep(8000);
        driver.getWindowHandles().forEach(tab -> driver.switchTo().window(tab));


    }
}


