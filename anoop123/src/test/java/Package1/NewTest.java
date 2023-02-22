package Package1;

import org.testng.annotations.Test;
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

public class NewTest 
{
	WebDriver wd;
	String URL1 = "https://www.google.com/";
	String URL2 = "https://www.amazon.in/";
  @BeforeTest
  public void beforeTest()
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\selenium-java-4.7.0\\chromedriver.exe");
	  wd = new ChromeDriver();
	  //wd.navigate().to(URL1);
	  wd.get(URL2);
	  wd.manage().window().maximize();
  }
  @Test(priority =0)
  public void login() throws InterruptedException, AWTException
  {
	  	//WebElement link = wd.findElement(By.xpath("//*[contains(text(),'Gmail')]"));
		WebElement link1 = wd.findElement((By.xpath("//*[@class=\'nav-a nav-a-2   nav-progressive-attribute\']")));
	  	Thread.sleep(3000);
	  	Actions act = new Actions(wd);
	  	act.contextClick(link1).build().perform();
	  	Robot rb = new Robot();
	  	Thread.sleep(3000);
	  	rb.keyPress(MenuKeyEvent.VK_DOWN);
	  	rb.keyPress(MenuKeyEvent.VK_ENTER);
	  	rb.keyPress(MenuKeyEvent.VK_CONTROL);
	  	rb.keyPress(MenuKeyEvent.VK_TAB);
  }
  @Test(enabled = false)
  public void signin() throws InterruptedException, AWTException
  {
	  WebElement link2 = wd.findElement(By.xpath("//*[@id=\'ap_email\']"));
	  Thread.sleep(2000);
	  Actions act1 = new Actions(wd);
	  act1.contextClick(link2).build().perform();
	  Robot rb1 = new Robot();
	  rb1.keyPress(MenuKeyEvent.VK_A);
  }
  @AfterTest
  public void afterTest() throws InterruptedException 
  {
	  //Thread.sleep(6000);
	  //wd.close();
  }
}
