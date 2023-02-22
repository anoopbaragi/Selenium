package Package1;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TAB
{
	WebDriver wd;
	String URl ="https://demoqa.com/tabs";
  @BeforeTest
  public void beforeTest() 
  {
	  WebDriverManager.chromedriver().setup();
	  wd = new ChromeDriver();
	  wd.get(URl);
	  wd.manage().window().maximize();
  }
  
  
  @Test
  public void tb() throws InterruptedException 
  {
	  JavascriptExecutor js = (JavascriptExecutor)wd;
	  js.executeScript("window.scrollBy(0,250)");
	  wd.findElement(By.id("demo-tab-what")).click();
	  Thread.sleep(2000);
	  wd.findElement(By.id("demo-tab-origin")).click();
	  Thread.sleep(2000);
	  wd.findElement(By.id("demo-tab-use")).click();
	  Thread.sleep(2000);
	  wd.findElement(By.id("demo-tab-use")).click();
	  Thread.sleep(2000);
	  wd.findElement(By.id("demo-tab-what")).click();
  }
  
  @AfterTest
  public void afterTest() 
  {
	  
  }

}
