package signInTest;
import base.Base;
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
public class SignInTestClass extends Base {

    @Test(priority = 1)
    public void SingIn() throws InterruptedException, IOException {
        File directory = new File("./");
        System.out.println(directory.getAbsolutePath());
        String configFileName = "./src/main/resources/%s.properties";
        Properties props = new Properties();
        String EnvironmentName = System.getProperty("Environment");
        configFileName = String.format(configFileName, EnvironmentName);
        props.load(new FileInputStream(new File(configFileName)));
        Thread.sleep(5000);
        SingInLocators SingIn = PageFactory.initElements(driver, SingInLocators.class);
        String email = props.getProperty("userName");
        String password = props.getProperty("password");
        String firstname = props.getProperty("firstname");
        SingIn.etsysignin.click();
        Thread.sleep(5000);
        SingIn.register.click();
        Thread.sleep(2000);
        SingIn.Email.sendKeys(email);
        Thread.sleep(2000);
        SingIn.firstname.sendKeys(firstname);
        Thread.sleep(2000);
        SingIn.Password.sendKeys(password);
        Thread.sleep(2000);
        SingIn.clickregister.click();
        Thread.sleep(3000);


    }
}
