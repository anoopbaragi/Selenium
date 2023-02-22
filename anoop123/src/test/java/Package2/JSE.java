package Package2;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class JSE 
{  
	WebDriver wd;
	
  @BeforeTest
  public void beforeTest() 
  {
	  WebDriverManager.chromedriver().setup();
	  wd = new ChromeDriver();
	  wd.get("https://demoqa.com/text-box");
	  //wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  wd.manage().window().maximize();
  }
  
  @Test
  public void tc1() throws InterruptedException 
  {
	  JavascriptExecutor js = (JavascriptExecutor)wd;//it is replacing webdriver  with java script executor
	  Thread.sleep(3000);
	  /*js.executeScript("history.go(0)");
	  js.executeScript("window.history.forward(0)");*/
	  js.executeScript("document.getElementById('userName').value='Anoop'");
	  js.executeScript("document.getElementById('userEmail').value='anoop@gmail.com'");
	  js.executeScript("document.getElementById('currentAddress').value='Mysuru'");
	  js.executeScript("document.getElementById('permanentAddress').value='Mysuru'");
	  //js.executeScript("document.getElementById('submit').click()");
	  //wd.findElement(By.id("submit")).click();
	  js.executeScript("window.scrollBy(0,500)");
	  wd.findElement(By.xpath("//*[@class='btn btn-primary']")).click();
	  js.executeScript("window.scrollBy(0,1000)");
	  System.out.println(js.executeScript("return document.title"));
	  System.out.println(js.executeScript("return document.domain"));
	  //System.out.println(js.executeScript("return document.documentElement.innerText"));
	  //System.out.println(js.executeScript("return document.getElementById('submit').innerText"));
	 /*js.executeScript("document.getElementsByName('username')[0].value='Admin'");
	  js.executeScript("document.getElementsByName('password')[0].value='admin123'");
	  Thread.sleep(3000);
	  js.executeScript("document.getElementsByClassName('oxd-form-actions orangehrm-login-action')[0].click()");*/
  }
}
