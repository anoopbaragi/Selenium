package Configarations;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Config
{
    public static WebDriver wd;
    public static String  Expected_Data;
    public static  String Actual_Data;
    public String User_Name_1;
    public String Main_URL="https://mysuru-trials79.orangehrmlive.com/auth/login";

    @BeforeSuite
    public void beforesuite()
    {
        WebDriverManager.chromedriver().setup();
        wd=new ChromeDriver();
        wd.get(Main_URL);
        wd.manage().window().maximize();
    }

    @AfterSuite
    public void aftersuite()
    {
        wd.close();
    }
}
