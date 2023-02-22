package Package1;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class Slider 
{
	WebDriver wd;
	String URl ="https://demoqa.com/slider";
	
  @BeforeTest
  public void beforeTest()
  {
	  WebDriverManager.chromedriver().setup();
	  wd = new ChromeDriver();
	  wd.get(URl);
	  wd.manage().window().maximize();
  }
  
  @Test
  public void sl() throws InterruptedException 
  {
	  Actions dragger = new Actions(wd);
	  WebElement slider = wd.findElement(By.xpath("//*[@class='range-slider range-slider--primary\']"));
	  dragger.dragAndDropBy(slider, 200, 0).build().perform();
	  Thread.sleep(3000);
	  dragger.dragAndDropBy(slider, -200, 0).build().perform();
  }
  
  @AfterTest
  public void afterTest() 
  {
	  
  }

}
