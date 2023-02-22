package Package1;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class frames
{
	WebDriver wd;
	String URl ="https://demoqa.com/nestedframes";
  @BeforeTest
  public void beforeTest() throws InterruptedException 
  {
	  WebDriverManager.chromedriver().setup();
		wd = new ChromeDriver();
		wd.get(URl);
		wd.manage().window().maximize();
		Thread.sleep(3000);
  }
  @Test
  public void frames()
  {
	  List<WebElement> we = wd.findElements(By.tagName("iframe"));
		System.out.println(we.size());
		for(int i=0;i<8;i++)
		{
		String str =we.get(i).getAttribute("id");
		System.out.println(str);
		}
		wd.switchTo().frame("frame1");
  }
  
  @AfterTest
  public void afterTest() 
  {
	  
  }

}
