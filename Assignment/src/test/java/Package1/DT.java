package Package1;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import javax.swing.event.MenuKeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class DT 
{
	WebDriver wd;
	String URl ="https://demoqa.com/date-picker";
  
  @BeforeTest
  public void beforeTest()
  {
	  WebDriverManager.chromedriver().setup();
	  wd = new ChromeDriver();
	  wd.get(URl);
	  wd.manage().window().maximize();
  }

  @Test
  public void DateT() throws InterruptedException, AWTException 
  {
	  JavascriptExecutor  js = (JavascriptExecutor)wd;
	  Robot rb = new Robot();
	  Actions act = new Actions(wd);
	 /* wd.findElement(By.id("datePickerMonthYearInput"));
	  Thread.sleep(1000);
	  js.executeScript("document.getElementById('datePickerMonthYearInput').click()");
	  Thread.sleep(2000);
	  Select mdown = new Select(wd.findElement(By.xpath("//select[@class='react-datepicker__month-select']")));
	  mdown.selectByVisibleText("March");
	  Thread.sleep(2000);
	  Select ydown = new Select(wd.findElement(By.xpath("//select[@class='react-datepicker__year-select']")));
	  ydown.selectByValue("2015");
	  Thread.sleep(2000);
	  WebElement we = wd.findElement(By.xpath("//div[@aria-label='Choose Wednesday, March 18th, 2015']"));
	  Thread.sleep(2000);
	  act.click(we).perform();
	  Thread.sleep(3000);
	  rb.keyPress(MenuKeyEvent.VK_ESCAPE);
	  Thread.sleep(3000);*/
	  js.executeScript("document.getElementById('dateAndTimePickerInput').click()");
	  Thread.sleep(3000);
	 wd.findElement(By.xpath("//div[contains(@class,'react-datepicker__month-read-view')]")).click();
	  rb.keyPress(MenuKeyEvent.VK_DOWN);
	  rb.keyPress(MenuKeyEvent.VK_DOWN);
	  rb.keyPress(MenuKeyEvent.VK_DOWN);
	  rb.keyPress(MenuKeyEvent.VK_DOWN);
	  act.click().perform();
	  Thread.sleep(3000);
	  wd.findElement(By.xpath("//span[@class='react-datepicker__year-read-view--selected-year']")).click();
	  rb.keyPress(MenuKeyEvent.VK_DOWN);
	  rb.keyPress(MenuKeyEvent.VK_DOWN);
	  rb.keyPress(MenuKeyEvent.VK_DOWN);
	  act.click().perform();
	  Thread.sleep(3000);
	  WebElement we1 = wd.findElement(By.xpath("//button[normalize-space()='Previous Month']"));
	  act.click(we1).perform();
	  Thread.sleep(2000);
	  WebElement we2 = wd.findElement(By.xpath("//div[@aria-label='Choose Monday, December 19th, 2022']"));
	  act.click(we2).perform();
	  Thread.sleep(3000);
	  wd.findElement(By.xpath("//*[@class='react-datepicker__time-box']/ul/li[50]")).click();
	  Thread.sleep(3000);
	  rb.keyPress(MenuKeyEvent.VK_ESCAPE); 


	  
  }
  
  
  @AfterTest
  public void afterTest()
  {
	  
  }

}
