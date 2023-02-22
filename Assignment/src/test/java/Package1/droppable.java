package Package1;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class droppable
{
	WebDriver wd;
	String URl ="https://demoqa.com/droppable";
  
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
	  wd.findElement(By.xpath("//*[@class='nav nav-tabs']/a[1]")).click();
	  Thread.sleep(3000);
	  WebElement we = wd.findElement(By.id("draggable"));
	  WebElement xz = wd.findElement(By.id("droppable"));
	  act.dragAndDrop(we, xz).perform();
	  Thread.sleep(3000);
	  wd.findElement(By.xpath("//*[@class='nav nav-tabs']/a[2]")).click();
	  Thread.sleep(3000);
	  WebElement we1 = wd.findElement(By.id("acceptable"));
	  WebElement xz1 =wd.findElement(By.xpath("//div[@id='acceptDropContainer']//div[@id='droppable']"));
	  act.dragAndDrop(we1,xz1).perform();
	  Thread.sleep(3000);
	  WebElement we2 = wd.findElement(By.id("acceptable"));
	  act.dragAndDropBy(we2, -300, -30).perform();
	  Thread.sleep(3000);
	  WebElement we3 = wd.findElement(By.id("notAcceptable"));
	  WebElement xz3 =wd.findElement(By.xpath("//div[@id='acceptDropContainer']//div[@id='droppable']"));
	  act.dragAndDrop(we3,xz3).perform();
	  Thread.sleep(3000);
	  wd.findElement(By.xpath("//*[@class='nav nav-tabs']/a[3]")).click();
	  Thread.sleep(3000);
	  WebElement we4 =wd.findElement(By.id("dragBox"));
	  WebElement xz4 = wd.findElement(By.xpath("//div[@id='notGreedyInnerDropBox']"));
	  act.dragAndDrop(we4, xz4).perform();
	  Thread.sleep(3000);
	  js.executeScript("window.scrollBy(0,200)");
	  Thread.sleep(3000);
	  WebElement xz5 = wd.findElement(By.xpath("//div[@id='greedyDropBox']"));
	  act.dragAndDrop(we4, xz5).perform();
	  Thread.sleep(3000);
	  wd.findElement(By.xpath("//*[@class='nav nav-tabs']/a[4]")).click();
	  Thread.sleep(3000);
	  WebElement we5 =wd.findElement(By.id("revertable"));
	  WebElement xz6 = wd.findElement(By.xpath("//div[@id='revertableDropContainer']//div[@id='droppable']"));
	  act.dragAndDrop(we5, xz6).perform();
	  Thread.sleep(3000);
	  WebElement we6 =wd.findElement(By.id("notRevertable"));
	  act.dragAndDrop(we6, xz6).perform();
  }
  
  @AfterTest
  public void afterTest() 
  {
	  
  }

}
