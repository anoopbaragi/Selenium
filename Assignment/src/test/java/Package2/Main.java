package Package2;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Window;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.swing.event.MenuKeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Main 
{
	WebDriver wd;
	String URl ="https://rahulshettyacademy.com/AutomationPractice/";
	
 
  @BeforeTest
  public void beforeTest()
  {
	  WebDriverManager.chromedriver().setup();
	  wd = new ChromeDriver();
	  wd.get(URl);
	  wd.manage().window().maximize();
  }
  
  @Test
  public void practice() throws InterruptedException, AWTException 
  {
	  JavascriptExecutor js  = (JavascriptExecutor)wd;
	  Robot rb = new Robot();
	  Actions act = new Actions(wd);
	  js.executeScript("document.getElementsByClassName('radioButton')[0].click()");
	  Thread.sleep(2000);
	  js.executeScript("document.getElementsByClassName('radioButton')[1].click()");
	  Thread.sleep(2000);
	  js.executeScript("document.getElementsByClassName('radioButton')[2].click()");
	  Thread.sleep(2000);
	  WebElement we = wd.findElement(By.id("autocomplete"));
	  act.click(we).perform();
	  act.sendKeys("ind").perform();
	  Thread.sleep(3000);
	  rb.keyPress(MenuKeyEvent.VK_DOWN);
	  rb.keyPress(MenuKeyEvent.VK_DOWN);
	  Thread.sleep(3000);
	  rb.keyPress(MenuKeyEvent.VK_ENTER);
	  Thread.sleep(2000);
	  wd.findElement(By.id("dropdown-class-example")).click();
	  rb.keyPress(MenuKeyEvent.VK_DOWN);
	  rb.keyPress(MenuKeyEvent.VK_DOWN);
	  Thread.sleep(3000);
	  rb.keyPress(MenuKeyEvent.VK_ENTER);
	  Thread.sleep(2000);
	  js.executeScript("document.getElementById('checkBoxOption1').click()");
	  Thread.sleep(2000);
	  js.executeScript("document.getElementById('checkBoxOption2').click()");
	  Thread.sleep(2000);
	  js.executeScript("document.getElementById('checkBoxOption3').click()");
	  Thread.sleep(3000);
	  js.executeScript("document.getElementById('openwindow').click()");
	  String p_handle = wd.getWindowHandle();
	  Set<String> allwin = wd.getWindowHandles();
	  for(String handle:allwin)
	  {
		  //System.out.println(handle);
		  if(!handle.equalsIgnoreCase(p_handle))
		  {
			  wd.switchTo().window(handle);
			  //System.out.println("Title of child "+wd.getTitle());
			  wd.close();
		  }
	  }
	  wd.switchTo().window(p_handle);
	  Thread.sleep(1000);
	  js.executeScript("document.getElementById('opentab').click()");
	  Thread.sleep(4000);
	  rb.keyPress(MenuKeyEvent.VK_CONTROL);
	  rb.keyPress(MenuKeyEvent.VK_TAB);
	  rb.keyRelease(MenuKeyEvent.VK_CONTROL);  
	  Thread.sleep(3000);
	  js.executeScript("document.getElementById('name').value='Anoop'");
	  Thread.sleep(3000);
	  js.executeScript("document.getElementById('alertbtn').click()");
	  Thread.sleep(3000);
	  Alert alt = wd.switchTo().alert();
	  alt.accept();
	  js.executeScript("document.getElementById('name').value='Baragi'");
	  Thread.sleep(3000);
	  js.executeScript("document.getElementById('confirmbtn').click()");
	  Thread.sleep(3000);
	  alt.accept();
	  js.executeScript("window.scrollBy(0,600)");
	  Thread.sleep(3000);
	  js.executeScript("document.getElementById('hide-textbox').click()");
	  Thread.sleep(3000);
	  js.executeScript("document.getElementById('show-textbox').click()");
	  Thread.sleep(3000);
	  js.executeScript("document.getElementsByClassName('tableFixHead')[0].scroll(0,200)");
	  Thread.sleep(3000);
	  js.executeScript("window.scrollBy(0,600)");
	  WebElement we1 = wd.findElement(By.id("mousehover"));
	  act.moveToElement(we1).build().perform();
	  Thread.sleep(3000);
	  WebElement we2 = wd.findElement(By.xpath("//*[@class='mouse-hover-content']/a[1]"));
	  act.moveToElement(we2).click().build().perform();
	  Thread.sleep(3000);
	  js.executeScript("window.scrollBy(0,1800)");
	  List<WebElement> we3 = wd.findElements(By.tagName("iframe"));
	  wd.switchTo().frame("courses-iframe");
	  js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	  //Thread.sleep(3000);
	  //js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
  }
  
  @AfterTest
  public void afterTest() 
  {
	  
  }

}
