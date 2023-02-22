package Package1;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.List;

import javax.swing.event.MenuKeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class Autocomplete 
{
	WebDriver wd;
	String URl ="https://demoqa.com/auto-complete";
	
  @BeforeTest
  public void beforeTest() 
  {
	  WebDriverManager.chromedriver().setup();
	  wd = new ChromeDriver();
	  wd.get(URl);
	  wd.manage().window().maximize();
  }
  
  @Test
  public void ac() throws InterruptedException, AWTException
  {
	  JavascriptExecutor js = (JavascriptExecutor)wd;
	  Actions act = new Actions(wd);
	  Robot rb = new Robot();
	  WebElement we = wd.findElement(By.xpath("//div[@class='auto-complete__value-container auto-complete__value-container--is-multi css-1hwfws3']"));
	  act.click(we).perform();
	  act.sendKeys("G").perform();
	  Thread.sleep(3000);
	  rb.keyPress(MenuKeyEvent.VK_DOWN);
	  rb.keyPress(MenuKeyEvent.VK_ENTER);
	  act.sendKeys("B").perform();
	  Thread.sleep(3000);
	  rb.keyPress(MenuKeyEvent.VK_DOWN);
	  rb.keyPress(MenuKeyEvent.VK_ENTER);
	  act.sendKeys("A").perform();
	  Thread.sleep(3000);
	  rb.keyPress(MenuKeyEvent.VK_DOWN);
	  rb.keyPress(MenuKeyEvent.VK_ENTER);
	  act.sendKeys("R").perform();
	  Thread.sleep(3000);
	  rb.keyPress(MenuKeyEvent.VK_DOWN);
	  rb.keyPress(MenuKeyEvent.VK_ENTER);
	  Thread.sleep(2000);
	  rb.keyPress(MenuKeyEvent.VK_ESCAPE);
	  Thread.sleep(2000);
	  js.executeScript("window.scrollBy(0,250)");
	  Thread.sleep(3000);
	  WebElement we1 = wd.findElement(By.xpath("//div[@class='auto-complete__value-container css-1hwfws3']"));
	  act.click(we1).perform();
	  Thread.sleep(3000);
	  act.sendKeys("B").perform();
	  Thread.sleep(3000);
	  rb.keyPress(MenuKeyEvent.VK_ENTER); 
	  Thread.sleep(2000);
	  rb.keyPress(MenuKeyEvent.VK_ESCAPE);
  }
  
  @AfterTest
  public void afterTest() {
  }

}
