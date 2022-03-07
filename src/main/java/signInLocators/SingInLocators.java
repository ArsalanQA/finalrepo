package signInLocators;

import base.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SingInLocators extends Base {
    public SingInLocators(WebDriver driver){
        this.driver = driver;
    }

    @FindBy(xpath ="/html/body/div[6]/div[2]/div/div[2]/div/div/div/div/div/div[2]/form/div[1]/div/div[2]/input")
    public WebElement Email;
    @FindBy(xpath ="/html/body/div[6]/div[2]/div/div[2]/div/div/div/div/div/div[2]/form/div[1]/div/div[4]/input")
    public WebElement Password;
    @FindBy(xpath ="/html/body/div[6]/div[2]/div/div[2]/div/div/div/div/div/div[2]/form/div[1]/div/div[3]/input")
    public WebElement firstname;
    @FindBy(xpath ="/html/body/div[6]/div[2]/div/div[2]/div/div/div/div/div/div[2]/form/div[1]/div/div[1]/div/button")
    public WebElement register;
    @FindBy(xpath ="/html/body/div[6]/div[2]/div/div[2]/div/div/div/div/div/div[2]/form/div[1]/div/div[7]/div/button")
    public WebElement clickregister;
    @FindBy(xpath ="/html/body/div[6]/div[2]/div/div[2]/div/div/div/div/div/div[2]/form/div[3]/div[1]/div/button")
    public WebElement clickgmail;
    @FindBy(id ="identifierId")
    public WebElement gemail;
    @FindBy(xpath ="/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div[1]/div/div/div/div/div[1]/div/div[1]/input")
    public WebElement gpassword;
    @FindBy(xpath ="/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button/span")
    public WebElement clicknext;
    @FindBy(xpath ="/html/body/main/div/div[1]/div/div/ul/li[1]/a/div[2]/p[2]")
    public WebElement clickcategory;
    @FindBy(xpath ="/html/body/main/div/div[1]/div/div[3]/div[5]/div[1]/div/div/div/div[2]/a")
    public WebElement additem;
    @FindBy(xpath ="/html/body/main/div[1]/div[1]/div/div/div[1]/div[2]/div/div[3]/div/div[1]/div[2]/div/div/div[1]/select")
    public WebElement clickdropdown;
    @FindBy(xpath ="/html/body/main/div[1]/div[1]/div/div/div[1]/div[2]/div/div[3]/div/div[1]/div[2]/div/div/div[1]/select/option[2]")
    public WebElement selectitem;
    @FindBy(xpath ="/html/body/main/div[1]/div[1]/div/div/div[1]/div[2]/div/div[3]/div/div[2]/div/form/button")
    public WebElement addtobasket;

    @FindBy(xpath ="/html/body/main/div/div[3]/div[1]/div[1]/div/div[1]/ul/li/ul/li/div/div[2]/div/div/div[3]/ul/li[2]/a")
    public WebElement removefrombasket;
    @FindBy(xpath ="/html/body/div[2]/div[3]/div[1]/div/div/span/div[1]")
    public WebElement captchclick;









    @FindBy(xpath ="//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained login-button MuiButton-containedPrimary']")
    public WebElement SignInButton;
    @FindBy(xpath = "//div[@class='d-none d-lg-block login-banner']")
    public WebElement banner;
    @FindBy(xpath = "//span[@class='app-copyright-text']")
    public WebElement copyRight;
    @FindBy(xpath = "//a[@class='contect-support-text']")
    public WebElement contactSupportLink;
    @FindBy(xpath = "//img[@class='logo-min']")
    public WebElement munchiesLogo;
    @FindBy(xpath = "//span[@class='login-title']")
    public WebElement signInTitle;
    @FindBy(xpath = "/html/body/div[3]/header/div[4]/nav/ul/li[1]/button")
    public WebElement etsysignin;



}
