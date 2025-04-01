package Utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalTime;
import java.util.Iterator;
import java.util.Set;

import static StepDefinitions.PageInitializer.initializePageObjects;

public class CommonMethods {

    public static WebDriver driver;
    public static JavascriptExecutor js;
    public static void openBrowserAndLaunchApplication() throws IOException {

        switch (ConfigReader.read("browser")){
            case "Chrome":
                ChromeOptions options=new ChromeOptions();
                //options.setHeadless(true);
                driver = new ChromeDriver(options);
                break;

            case "FireFox":
                driver=new FirefoxDriver();
                break;
            case "Edge":
                driver=new EdgeDriver();
                break;
            default:
                throw new RuntimeException("Invalid Browser Name");
        }
//        impicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();
        initializePageObjects();
    }

    public static void closeBrowser(){
        if(driver!=null){
            driver.quit();
        }
    }

    public static String validateTitle(){

       String title=driver.getTitle();
       return title;
    }

    public static void mouseOverElement(WebElement wb){

        Actions ac=new Actions(driver);

        ac.moveToElement(wb).build().perform();

    }

    public static void clickUsingJs(WebElement wb){

        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click()",wb);


    }

    public static String getTextFromElement(WebElement wb){

        String text=wb.getText();

        return text;
    }

    public static void scrollDown(int pixels){

        js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,"+pixels+")","");
    }


    public static void switchWindows(){

        String currentWindow=driver.getWindowHandle();

        Set<String> allWindows=driver.getWindowHandles();

        Iterator<String> itr=allWindows.iterator();

        while(itr.hasNext()){

            String child=itr.next();

            if(!(child.equals(currentWindow))){

                driver.switchTo().window(child);
            }


        }


    }

    public static void captureScreenshot() throws IOException {

        LocalTime myObj= LocalTime.now();

        String s=myObj.toString();
        TakesScreenshot ts=(TakesScreenshot)driver;

        File src=ts.getScreenshotAs(OutputType.FILE);

        File dest=new File(Constants.SCREENSHOT_FILEPATH+"/inventory.png");

        FileUtils.copyFile(src,dest);

    }

    public static void waitForVisibiltyOfElement(WebElement wb,int time){

        WebDriverWait wt=new WebDriverWait(driver,Duration.ofSeconds(time));

        wt.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[@value='no']")));



    }


}


