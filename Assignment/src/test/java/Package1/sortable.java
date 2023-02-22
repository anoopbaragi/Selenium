package Package1;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class sortable
{
	WebDriver wd;
	String URl ="https://demoqa.com/sortable";
  @BeforeTest
  public void beforeTest() 
  {
	  WebDriverManager.chromedriver().setup();
	  wd = new ChromeDriver();
	  wd.get(URl);
	  wd.manage().window().maximize();
  }

  @Test
  public void so() throws InterruptedException
  {
	  JavascriptExecutor js = (JavascriptExecutor)wd;
	  Actions act =  new Actions(wd);
	  wd.findElement(By.id("demo-tab-list")).click();
	  js.executeScript("window.scrollBy(0,200)");
	  WebElement we = wd.findElement(By.xpath("//div[@class='vertical-list-container mt-4']//div[@class='list-group-item list-group-item-action'][normalize-space()='One']"));
	  WebElement we1 = wd.findElement(By.xpath("//div[@class='vertical-list-container mt-4']//div[@class='list-group-item list-group-item-action'][normalize-space()='Three']"));
	  wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  act.dragAndDrop(we, we1).perform();
	  act.release(we).perform();
	  Thread.sleep(5000);
	  wd.findElement(By.id("demo-tab-grid")).click();
	  Thread.sleep(3000);
	  js.executeScript("window.scrollBy(0,150)");
	  WebElement we2 = wd.findElement(By.xpath("//div[@class='create-grid']//div[@class='list-group-item list-group-item-action'][normalize-space()='One']"));
	  WebElement we3 = wd.findElement(By.xpath("//div[normalize-space()='Eight']"));
	  wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  act.dragAndDrop(we2, we3).perform();
	  act.release(we2).perform();
  }
  
  @AfterTest
  public void afterTest() 
  {
	  
  }

}
