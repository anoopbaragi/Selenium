package Package1;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.awt.AWTException;
import java.awt.Robot;

import javax.swing.event.MenuKeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class SMenu 
{
	WebDriver wd;
	String URl ="https://demoqa.com/select-menu";
 
  @BeforeTest
  public void beforeTest() 
  {
	  WebDriverManager.chromedriver().setup();
	  wd = new ChromeDriver();
	  wd.get(URl);
	  wd.manage().window().maximize();
  }
  
  @Test
  public void sm() throws InterruptedException, AWTException
  {
	  JavascriptExecutor js = (JavascriptExecutor)wd;
	  Robot rb = new Robot();
	  Actions act = new Actions(wd);
	  Thread.sleep(1000);
	  js.executeScript("window.scrollBy(0,250)");
	  wd.findElement(By.xpath("//*[@class=' css-tlfecz-indicatorContainer']")).click();
	  Thread.sleep(3000);
	  rb.keyPress(MenuKeyEvent.VK_DOWN);
	  rb.keyPress(MenuKeyEvent.VK_DOWN);
	  rb.keyPress(MenuKeyEvent.VK_ENTER);
	  wd.findElement(By.xpath("//*[@class=' css-tlfecz-indicatorContainer'][1]")).click();
	  Thread.sleep(3000);
	  rb.keyPress(MenuKeyEvent.VK_DOWN);
	  rb.keyPress(MenuKeyEvent.VK_ENTER);
	  wd.findElement(By.id("oldSelectMenu")).click();
	  rb.keyPress(MenuKeyEvent.VK_DOWN);
	  rb.keyPress(MenuKeyEvent.VK_ENTER);
	  js.executeScript("window.scrollBy(0,200)");
	  Thread.sleep(3000);
	  /*js.executeScript("document.getElementsByClassName('css-tlfecz-indicatorContainer')[4].click()");
	  wd.findElement(By.xpath("//*[@class='  css-tlfecz-indicatorContainer'][3]")).click();
	  rb.keyPress(MenuKeyEvent.VK_DOWN);
	  rb.keyPress(MenuKeyEvent.VK_ENTER);*/
	  WebElement we= wd.findElement(By.xpath("//div[@id='selectMenuContainer']//div[@class='row']//div[@class=' css-tlfecz-indicatorContainer']//*[name()='svg']"));
	  act.click(we).perform();
	  act.sendKeys("Green").perform();
	  rb.keyPress(MenuKeyEvent.VK_DOWN);
	  rb.keyPress(MenuKeyEvent.VK_ENTER);
	  act.sendKeys("Black").perform();
	  rb.keyPress(MenuKeyEvent.VK_DOWN);
	  rb.keyPress(MenuKeyEvent.VK_ENTER);
	  act.sendKeys("Blue").perform();
	  rb.keyPress(MenuKeyEvent.VK_DOWN);
	  rb.keyPress(MenuKeyEvent.VK_ENTER);
	  act.sendKeys("Red").perform();
	  rb.keyPress(MenuKeyEvent.VK_DOWN);
	  rb.keyPress(MenuKeyEvent.VK_ENTER);
	  Thread.sleep(3000);
	  rb.keyPress(MenuKeyEvent.VK_ESCAPE);
	  Select cdown = new Select(wd.findElement(By.xpath("//select[@id='cars']")));
	  cdown.selectByVisibleText("Audi");
  }
  
  @AfterTest
  public void afterTest() 
  {
  }

}
