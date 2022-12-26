package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.PageInitializer;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class CommonMethods extends PageInitializer {
public static WebDriver driver;
    public static byte[] openBrowserAndLaunchApp() {
        ConfigReader.readProperties(Constants.CONFIGURATION_FILEPATH);
        switch (ConfigReader.getPropertyValue("browser")) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            default:
                throw new RuntimeException("Invalid browser name");
        }
        driver.manage().window().maximize();
        driver.get(ConfigReader.getPropertyValue("url"));
        driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT, TimeUnit.SECONDS);
//initializePageObjects();  we need to call this method to use it


        DOMConfigurator.configure("log4.xml");
        Log.startTestCase("Our first test case is login test");
        Log.info("Our login test is going on");
        Log.warning("Our test case might be failed");
    }
        public static void closeBrowser(){
            Log.info("Our test case is about to complete");
            Log.endTestCase("This is our login test again");
            driver.quit();
        }
        //we need to the before data and then sendKeys
        //we use this method instead of sendkeys method thougout the framework
        public static void sendText(WebElement element,String textToSend){ //->element,data
            element.clear();
            element.sendKeys(textToSend);
        }

        //webdriver wait
        public static WebDriverWait getWait(){ //returning the proper wait to be used anywhere else
            WebDriverWait wait =new WebDriverWait(driver,Constants.EXPLICIT_WAIT);
    }

    //wating for the element to be clickable
        public static void waitForClickability(WebElement element){
            getWait().until(ExpectedConditions.elementToBeClickable(element));
        }
        public static void click (WebElement element){
            waitForClickability(element);
            element.click();
        }

        //this method will return JavaScriptExecutor Object
        public static JavascriptExecutor getJSExecutor(){ //to scroll,click,highlight
            JavascriptExecutor jse=(JavascriptExecutor) driver;
            return jse;
        }

        // this function will perform click on element using javascript executor
        public static void jseClick(WebElement element){getJSExecutor().executeScript("arguments[0].click()",element);}

        //selecting the dropdown,using text ***********by index, by value, by text
        public static void selectDropdown(WebElement element,String text){
            Select sel=new Select(element);
            sel.selectByVisibleText(text);
        }
        public static byte[]takeScreenshot(String fileName){
            TakesScreenshot ts=(TakesScreenshot) driver;
            byte[] picBytes = ts.getScreenshotAs(OutputType.BYTES);
            File sourceFile =ts.getScreenshotAs(OutputType.FILE);

            try{
                FileUtils.copyFile(sourceFile,
                        new File(Constants.SCREENSHOT_FILEPATH + fileName + " " +
                                getTimeStamp("yyyy-MM-dd-HH-mm-ss")+".png"));
            } catch (IOException e){
                e.printStackTrace();
            }
            return picBytes;
        }
        public static byte[] getTimeStamp(String pattern){
            Date date =new Date();
            SimpleDateFormat sdf=new SimpleDateFormat(pattern);
            return sdf.format(date).getBytes();
        }
}

