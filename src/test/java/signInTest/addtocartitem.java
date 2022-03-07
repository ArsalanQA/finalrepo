package signInTest;

import base.Base;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import signInLocators.SingInLocators;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class addtocartitem extends Base {

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
        Thread.sleep(5000);

      //  JavascriptExecutor js = (JavascriptExecutor) driver;
 //       js.executeScript("window.scrollBy(0,1050)", "");

        Signin.clickcategory.click();
        Thread.sleep(3000);
        Signin.additem.click();
        Thread.sleep(3000);
        Signin.clickdropdown.click();
        Thread.sleep(1000);
        Signin.selectitem.click();
        Thread.sleep(5000);
        //js.executeScript("window.scrollBy(0,750)", "");
        Thread.sleep(3000);
        Signin.addtobasket.click();
        Thread.sleep(10000);
        Signin.removefrombasket.click();
        Thread.sleep(5000);

    }
}
