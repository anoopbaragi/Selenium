package Package1;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class progress 
{
	WebDriver wd;
	String URl ="https://demoqa.com/progress-bar";
	
  @BeforeTest
  public void beforeTest() 
  {
	  WebDriverManager.chromedriver().setup();
	  wd = new ChromeDriver();
	  wd.get(URl);
	  wd.manage().window().maximize();
  }

  @Test
  public void pgs() throws InterruptedException 
  {
	  wd.findElement(By.id("startStopButton")).click();
	  Thread.sleep(5000);
	  wd.findElement(By.id("startStopButton")).click();
  }
  
  @AfterTest
  public void afterTest() 
  {
	  
  }

}
