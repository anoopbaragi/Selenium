package Package1;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class resizable
{
	WebDriver wd;
	String URl ="https://demoqa.com/resizable";
  @BeforeTest
  public void beforeTest() throws InterruptedException
  {
	  WebDriverManager.chromedriver().setup();
	  wd = new ChromeDriver();
	  wd.get(URl);
	  wd.manage().window().maximize();
  }
  @Test
  public void rs() throws InterruptedException
  {
	  JavascriptExecutor js = (JavascriptExecutor)wd;
	  Actions act = new Actions(wd);
	  WebElement we = wd.findElement(By.xpath("//*[@class='react-resizable-handle react-resizable-handle-se'][1]"));
	  Thread.sleep(3000);
	  js.executeScript("window.scrollBy(0,250)");
	  Thread.sleep(3000);
	  act.clickAndHold(we).build().perform();
	  act.moveByOffset(150, 0).build().perform();
	  act.release().build().perform();
	  Thread.sleep(2000);
	  js.executeScript("window.scrollBy(0,250)");
	  WebElement we1 =	wd.findElement(By.xpath("//*[@id='resizable']/span"));
	  Thread.sleep(2000);
	  act.clickAndHold(we1).build().perform();
	  act.moveByOffset(150, 100).build().perform();
	  act.release().build().perform();
  }
  
  @AfterTest
  public void afterTest() 
  {
	  
  }

}
