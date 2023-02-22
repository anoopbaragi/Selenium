package Package1;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.awt.AWTException;
import java.awt.Robot;

import javax.swing.event.MenuKeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class Menu 
{
	WebDriver wd;
	String URl ="https://demoqa.com/menu";
	 
  
  @BeforeTest
  public void beforeTest() 
  {
	  WebDriverManager.chromedriver().setup();
	  wd = new ChromeDriver();
	  wd.get(URl);
	  wd.manage().window().maximize();
  }
  
  @Test
  public void mn() throws InterruptedException, AWTException 
  {
	  Actions act = new Actions(wd);
	  Robot rb = new Robot();
	  rb.keyPress(MenuKeyEvent.VK_DOWN);
	  WebElement we = wd.findElement(By.xpath("//*[@class='nav-menu-container']/ul/li[2]"));
	  act.moveToElement(we).build().perform();
	  Thread.sleep(1000);
	  WebElement ew = wd.findElement(By.xpath("//*[@class='nav-menu-container']/ul/li[2]/ul/li[3]/a"));
	  act.moveToElement(ew).build().perform();	
  }
  @AfterTest
  public void afterTest()
  {
	  
  }

}
