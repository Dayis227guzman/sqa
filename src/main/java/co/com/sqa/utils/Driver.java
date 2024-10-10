package co.com.sqa.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Driver {

    private static ChromeDriver chromeDriver;

    public Driver(){}

    public static Driver web(){
        WebDriverManager webDriverManager = WebDriverManager.chromedriver();
        webDriverManager.clearDriverCache();
        webDriverManager.clearResolutionCache().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments(new String[]{"--incognito","--start-maximized"});
        chromeDriver = new ChromeDriver(options);
        return new Driver();
    }

    public WebDriver inToUrl(String url){
        chromeDriver.get(url);
        return chromeDriver;
    }

    public static void closeProcess(){
        chromeDriver.quit();
    }

    public static WebDriver getDriver(){
        return chromeDriver;
    }



}
