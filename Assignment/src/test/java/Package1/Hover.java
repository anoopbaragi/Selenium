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

public class Hover 
{
	WebDriver wd;
	String URl ="https://demoqa.com/tool-tips";
	  
  @BeforeTest
  public void beforeTest() 
  {
	  
	  WebDriverManager.chromedriver().setup();
	  wd = new ChromeDriver();
	  wd.get(URl);
	  wd.manage().window().maximize();
  }

  @Test
  public void ho() throws InterruptedException 
  {
	  JavascriptExecutor js = (JavascriptExecutor)wd;
	 Actions act = new Actions(wd);
	 Thread.sleep(3000);
	 WebElement bt =  wd.findElement(By.id("toolTipButton"));
	 act.moveToElement(bt).perform();
	 Thread.sleep(2000);
	 js.executeScript("window.scrollBy(0,250)");
	 WebElement bt1 = wd.findElement(By.xpath("//input[@id='toolTipTextField']"));
	 act.moveToElement(bt1).perform();
	 Thread.sleep(2000);
	 WebElement bt2 = wd.findElement(By.xpath("//a[normalize-space()='Contrary']"));
	 act.moveToElement(bt2).perform();
	 Thread.sleep(2000);
	 WebElement bt3 = wd.findElement(By.xpath("//a[normalize-space()='1.10.32']"));
	 act.moveToElement(bt3).perform(); 
  }
  
  @AfterTest
  public void afterTest() {
  }

}
