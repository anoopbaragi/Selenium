package Package1;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class blogin
{
	WebDriver wd;
	String URl ="https://demoqa.com/login";
	
  @BeforeTest
  public void beforeTest() 
  {
	  WebDriverManager.chromedriver().setup();
	  wd = new ChromeDriver();
	  wd.get(URl);
	  wd.manage().window().maximize();
  }

  @Test
  public void books() throws InterruptedException 
  {
	JavascriptExecutor js = (JavascriptExecutor)wd;
	Actions act = new Actions(wd);
	js.executeScript("window.scrollBy(0,250)");
	Thread.sleep(3000);
	wd.findElement(By.id("userName")).sendKeys("anoop");
	wd.findElement(By.id("password")).sendKeys("Abcd@123");
	Thread.sleep(2000);
	wd.findElement(By.id("login")).click();
	Thread.sleep(2000);
	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	Thread.sleep(3000);
	wd.findElement(By.id("gotoStore")).click();
	Thread.sleep(3000);
	WebElement we = wd.findElement(By.id("searchBox"));
	act.click(we).sendKeys("You Don't Know JS").perform();
	Thread.sleep(3000);
	wd.findElement(By.linkText("You Don't Know JS")).click();
	Thread.sleep(3000);
	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	wd.findElement(By.xpath("//*[@class='text-right fullButton']")).click();
	Thread.sleep(3000);
	Alert alt = wd.switchTo().alert();
	alt.accept();
	Thread.sleep(3000);
	wd.findElement(By.xpath("//*[@class='text-left fullButton']")).click();
	Thread.sleep(3000);
	wd.findElement(By.id("submit")).click();
  }
  
  @AfterTest
  public void afterTest() 
  {
	  
  }

}
