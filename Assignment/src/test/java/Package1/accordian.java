package Package1;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class accordian 
{
	WebDriver wd;
	String URl ="https://demoqa.com/accordian";
	
  @BeforeTest
  public void beforeTest() 
  {
	  WebDriverManager.chromedriver().setup();
	  wd = new ChromeDriver();
	  wd.get(URl);
	  wd.manage().window().maximize();
  }
  
  @Test
  public void acc() throws InterruptedException
  {
	  JavascriptExecutor js = (JavascriptExecutor)wd;
	  wd.findElement(By.id("section1Heading")).click();
	  Thread.sleep(4000);
	  wd.findElement(By.id("section2Heading")).click();
	  Thread.sleep(4000);
	  js.executeScript("window.scrollBy(0,400)");
	  wd.findElement(By.id("section3Heading")).click();
	  Thread.sleep(2000);
	  wd.findElement(By.id("section1Heading")).click();
	  js.executeScript("window.scrollBy(0,-400)");
  }

  @AfterTest
  public void afterTest() 
  {
	  
  }

}
