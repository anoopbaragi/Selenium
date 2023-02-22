package Package2;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.awt.AWTException;
import java.awt.Robot;

import javax.swing.event.MenuKeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class OHRM 
{
	WebDriver wd;
	String URL = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
  @BeforeTest
  public void beforeTest()
  {
	  WebDriverManager.chromedriver().setup();
	  wd = new ChromeDriver();
	  wd.get(URL);
	  wd.manage().window().maximize();
  }
  
  @Test
  public void OHRM() throws InterruptedException, AWTException
  {
	  JavascriptExecutor js = (JavascriptExecutor)wd;
	  String str = wd.getTitle();
	  System.out.println("The title : " +str); 
	  Thread.sleep(3000);
	  wd.findElement(By.xpath("//*[@name=\'username']")).sendKeys("Admin");
	  wd.findElement(By.xpath("//*[@name=\'password']")).sendKeys("admin123");
	  wd.findElement(By.xpath("//*[@class=\'oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\']")).click();
	 /* Thread.sleep(6000);
	  wd.findElement(By.linkText("Admin")).click();
	  Thread.sleep(6000);
	  wd.findElement(By.xpath("//*[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow\']")).click();
	  Thread.sleep(3000);
	//wd.findElement(By.xpath("//*[@class='oxd-select-text-input'])[2]")).click();
	  Robot rb =new Robot();
	  rb.keyPress(MenuKeyEvent.VK_DOWN);
	  rb.keyPress(MenuKeyEvent.VK_DOWN);
	  rb.keyPress(MenuKeyEvent.VK_DOWN);
	  rb.keyPress(MenuKeyEvent.VK_ENTER);
	  Thread.sleep(3000);
	  wd.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();
	  Thread.sleep(3000);
	  js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	  js.executeScript("document.getElementsByClassName('oxd-icon bi-check oxd-checkbox-input-icon')[14].click()");
	  js.executeScript("document.getElementsByClassName('oxd-icon bi-trash')[24].click()");
	  Thread.sleep(3000);
	  //js.executeScript("document.getElementsByClassName('oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin').click()");
	  wd.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")).click();
	  Thread.sleep(6000);*/
	  Thread.sleep(3000);
	  wd.findElement(By.xpath("//*[@class=\'oxd-icon bi-caret-down-fill oxd-userdropdown-icon\']")).click();
      Thread.sleep(3000);   //waiting time
      wd.findElement(By.xpath("//*[@href=\'/web/index.php/auth/logout\']")).click();
  }
  
  @AfterTest
  public void afterTest() throws InterruptedException 
  {
	  //Thread.sleep(3000);
	  //wd.close();
  }

}

