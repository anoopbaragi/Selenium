package Package1;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class selectable 
{
	WebDriver wd;
	String URl ="https://demoqa.com/selectable";
  @BeforeTest
  public void beforeTest() 
  {
	  WebDriverManager.chromedriver().setup();
	  wd = new ChromeDriver();
	  wd.get(URl);
	  wd.manage().window().maximize();
  }
  @Test
  public void st() throws InterruptedException 
  {
	  JavascriptExecutor js = (JavascriptExecutor)wd;
	  js.executeScript("window.scrollBy(0,250)");
	  wd.findElement(By.xpath("//*[@id='demo-tabpane-list']/ul/li[1]")).click();
	  wd.findElement(By.xpath("//*[@id='demo-tabpane-list']/ul/li[2]")).click();
	  wd.findElement(By.xpath("//*[@id='demo-tabpane-list']/ul/li[3]")).click();
	  wd.findElement(By.xpath("//*[@id='demo-tabpane-list']/ul/li[4]")).click();
	  Thread.sleep(3000);
	  js.executeScript("window.scrollBy(0,250)");
	  wd.findElement(By.id("demo-tab-grid")).click();
	  wd.findElement(By.xpath("//*[@id='row1']/li[1]")).click();
	  wd.findElement(By.xpath("//*[@id='row1']/li[2]")).click();
	  wd.findElement(By.xpath("//*[@id='row1']/li[3]")).click();
	  Thread.sleep(2000);
	  wd.findElement(By.xpath("//*[@id='row2']/li[1]")).click();
	  wd.findElement(By.xpath("//*[@id='row2']/li[2]")).click();
	  wd.findElement(By.xpath("//*[@id='row2']/li[3]")).click();
	  Thread.sleep(2000);
	  wd.findElement(By.xpath("//*[@id='row3']/li[1]")).click();
	  wd.findElement(By.xpath("//*[@id='row3']/li[2]")).click();
	  wd.findElement(By.xpath("//*[@id='row3']/li[3]")).click();
	  Thread.sleep(3000);
	  wd.findElement(By.id("demo-tab-grid")).click();
	  wd.findElement(By.xpath("//*[@id='row1']/li[1]")).click();
	  wd.findElement(By.xpath("//*[@id='row1']/li[2]")).click();
	  wd.findElement(By.xpath("//*[@id='row1']/li[3]")).click();
	  Thread.sleep(2000);
	  wd.findElement(By.xpath("//*[@id='row2']/li[1]")).click();
	  wd.findElement(By.xpath("//*[@id='row2']/li[2]")).click();
	  wd.findElement(By.xpath("//*[@id='row2']/li[3]")).click();
	  Thread.sleep(2000);
	  wd.findElement(By.xpath("//*[@id='row3']/li[1]")).click();
	  wd.findElement(By.xpath("//*[@id='row3']/li[2]")).click();
	  wd.findElement(By.xpath("//*[@id='row3']/li[3]")).click();
	  Thread.sleep(3000);
	  wd.findElement(By.id("demo-tab-list")).click();
	  Thread.sleep(2000);
	  js.executeScript("window.scrollBy(0,-250)");
	  wd.findElement(By.xpath("//*[@id='demo-tabpane-list']/ul/li[1]")).click();
	  wd.findElement(By.xpath("//*[@id='demo-tabpane-list']/ul/li[2]")).click();
	  wd.findElement(By.xpath("//*[@id='demo-tabpane-list']/ul/li[3]")).click();
	  wd.findElement(By.xpath("//*[@id='demo-tabpane-list']/ul/li[4]")).click();
  }
  @AfterTest
  public void afterTest() 
  {
	  
  }

}
