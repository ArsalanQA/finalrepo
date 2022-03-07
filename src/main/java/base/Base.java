package base;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import static java.lang.System.getProperty;


public class Base {
    public WebDriver driver;
    public ExtentHtmlReporter htmlReporter;
    public ExtentReports extent;
    public ExtentTest logger;
    public static Logger log = Logger.getLogger(Base.class.getName());
    @BeforeClass
    public void navigate() throws IOException {
		htmlReporter = new ExtentHtmlReporter("C:\\ExtentReport\\nameOfTheReport.html");
        // Create an object of Extent Reports
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);

        extent.setSystemInfo("Environment", "QA");
        extent.setSystemInfo("User Name", "M Arsalan");
        htmlReporter.config().setDocumentTitle("ExtentReport");
        // Name of the report
        //htmlReporter.loadXMLConfig("./ExtentReport.xml");
        htmlReporter.config().setReportName("ExtentReport");
        // Dark Theme
        htmlReporter.config().setTheme(Theme.STANDARD);
        log.info("zzzzz");
        log.debug("");
        log.error("");
        log.warn("");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        File directory = new File("./");
        System.out.println(directory.getAbsolutePath());
        String configFileName = "./src/main/resources/%s.properties";
        Properties props = new Properties();
        String EnvironmentName = getProperty("Environment");
        configFileName = String.format(configFileName, EnvironmentName);
        props.load(new FileInputStream(new File(configFileName)));
        String URL = props.getProperty("environmenturl");
        System.out.println("URL fetched is: " + URL);
        driver.get(URL);
        driver.manage().window().maximize();
    }
    @AfterClass
    public void closeDriver(){
        driver.close();
        extent.flush();
    }
}
