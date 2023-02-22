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

public class Dragabble 
{
	WebDriver wd;
	String URl ="https://demoqa.com/dragabble";
 
  @BeforeTest
  public void beforeTest() 
  {
	  WebDriverManager.chromedriver().setup();
	  wd = new ChromeDriver();
	  wd.get(URl);
	  wd.manage().window().maximize();
  }
  
  @Test
  public void drag() throws InterruptedException 
  {
	  JavascriptExecutor js = (JavascriptExecutor)wd;
	  Actions act=new Actions(wd);
	  js.executeScript("window.scrollBy(0,250)");
	  Thread.sleep(3000);
	  WebElement we = wd.findElement(By.id("dragBox"));
	  act.dragAndDropBy(we, 250, 250).perform();
	  Thread.sleep(2000);
	  wd.findElement(By.xpath("//*[@class='nav nav-tabs']/a[2]")).click();
	  Thread.sleep(3000);
	  WebElement we1 = wd.findElement(By.id("restrictedX"));
	  act.dragAndDropBy(we1, 250, 0).perform();
	  WebElement we2 = wd.findElement(By.id("restrictedY"));
	  act.dragAndDropBy(we2, 0, 250).perform();
	  Thread.sleep(3000);
	  act.dragAndDropBy(we1, -250, 0).perform();
	  act.dragAndDropBy(we2, 0, -250).perform();
	  Thread.sleep(2000);
	  wd.findElement(By.xpath("//*[@class='nav nav-tabs']/a[3]")).click();
	  Thread.sleep(3000);
	  WebElement we3 =wd.findElement(By.xpath("//*[@class='draggable ui-widget-content ui-draggable ui-draggable-handle']"));
	  act.dragAndDropBy(we3, 250, 100).perform();
	  Thread.sleep(3000);
	  WebElement we4 = wd.findElement(By.xpath("//*[@class='ui-widget-header ui-draggable ui-draggable-handle']"));
	  act.dragAndDropBy(we4, 0, 20).perform();
	  Thread.sleep(2000);
	  wd.findElement(By.xpath("//*[@class='nav nav-tabs']/a[4]")).click();
	  WebElement we5 = wd.findElement(By.id("cursorCenter"));
	  act.dragAndDropBy(we5, 300, 150).perform();
	  Thread.sleep(3000);
	  WebElement we6 = wd.findElement(By.id("cursorTopLeft"));
	  act.dragAndDropBy(we6, 400, 50).perform();
	  Thread.sleep(3000);
	  WebElement we7 = wd.findElement(By.id("cursorBottom"));
	  act.dragAndDropBy(we7, 250, 0).perform();
  }
  @AfterTest
  public void afterTest() 
  {
	  
  }

}
