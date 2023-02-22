package Package1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest
{
	WebDriver wd;
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\selenium-java-4.7.0\\chromedriver.exe");
	  wd = new ChromeDriver();
	  wd.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  wd.manage().window().maximize();
  }
  @Test (priority = 0)
  public void login() throws InterruptedException {
	  	Thread.sleep(3000);
	  	wd.findElement(By.xpath("//*[@name=\'username']")).sendKeys("Admin");
		//wd.findElement(By.name("username")).sendKeys("admin");
		//wd.findElement(By.name("password")).sendKeys("admin123");
	  	wd.findElement(By.xpath("//*[@name=\'password']")).sendKeys("admin123");
		wd.findElement(By.xpath("//*[@class=\'oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\']")).click();
		Thread.sleep(1000);
  }
  @Test (enabled = true)
  public void about_us() throws InterruptedException {
	  Thread.sleep(3000);
	  wd.findElement(By.linkText("Admin")).click();
	  wd.findElement(By.linkText("Dashboard.1")).click();
	  Thread.sleep(10000);
	 
  }
  @AfterTest
  public void afterTest()
  {
	  System.out.println("Logged in and closed the window");
	  wd.close();
  }
}
