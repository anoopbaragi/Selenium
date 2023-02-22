package Package1;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class modaldialogs 
{
	WebDriver wd;
	String URl ="https://demoqa.com/modal-dialogs";
 
  @BeforeTest
  public void beforeTest() 
  {
	  WebDriverManager.chromedriver().setup();
	  wd = new ChromeDriver();
	  wd.get(URl);
	  wd.manage().window().maximize();
  }
  
  @Test
  public void Modal() throws InterruptedException 
  {
	  wd.findElement(By.id("showSmallModal")).click();
	  Thread.sleep(2000);
	  wd.findElement(By.id("closeSmallModal")).click();
	  Thread.sleep(3000);
	  wd.findElement(By.id("showLargeModal")).click();
	  Thread.sleep(2000);
	  wd.findElement(By.id("closeLargeModal")).click();
  }
  
  @AfterTest
  public void afterTest()
  {
	  
  }

}
