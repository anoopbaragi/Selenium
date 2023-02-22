package Package2;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
/*import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;*/

import io.github.bonigarcia.wdm.WebDriverManager;

public class Extent_Report 
{
	//ExtentReports extent;
	//ExtentTest logger;
	  ExtentHtmlReporter htmlReporter; 
	  ExtentReports extent; 
	  WebDriver wd;
  @BeforeTest
  public void beforeTest()
  {
	  //extent = new ExtentReports(System.getProperty("user.dir")+ "/test-output/abcd2.html",true);
	  //extent.loadConfig(new File(System.getProperty("user.dir")+ "src/test/java/extent-config.xml"));
	  htmlReporter = new ExtentHtmlReporter("report.html");
	  extent = new ExtentReports();
	  extent.attachReporter(htmlReporter);
	  WebDriverManager.chromedriver().setup();
	  wd = new ChromeDriver();
	  wd.manage().window().maximize();
  }
	@Test
  public void ohrm() throws InterruptedException
  {
	  //logger = extent.startTest("Demo");
		ExtentTest test = extent.createTest("Demo");
		wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//logger.log(LogStatus.PASS, "web page has opened");
		//test.pass("details");
		test.log(Status.PASS, "Webpageopened");
		Thread.sleep(3000);//in the report we will have a record of the steps performed
		
		String title=wd.getTitle();
		//logger.log(LogStatus.PASS, "title");
		test.log(Status.PASS, "title");
		Thread.sleep(3000);
		
		Assert.assertEquals("demo", "demo");
		//logger.log(LogStatus.PASS, "Assert passed");
		test.log(Status.PASS, "Assert passed");
		Thread.sleep(3000);
		
		wd.findElement(By.name("username")).sendKeys("Admin");
		//logger.log(LogStatus.PASS, "username Entered");
		test.log(Status.PASS, "user name entered");
		Thread.sleep(3000);
		
		wd.findElement(By.name("password")).sendKeys("admin123");
		//logger.log(LogStatus.PASS, "username Entered");
		test.log(Status.PASS, "password entered");
		Thread.sleep(3000);
		
		wd.findElement(By.xpath("//*[@class=\'oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\']")).click();
		//logger.log(LogStatus.PASS, "login successfully");
		test.log(Status.PASS, "login sucessfully");
		Thread.sleep(3000);
  }
	
	@AfterTest
	public void afterTest()
	{
		//extent.endTest();// end the logger functions
		extent.flush();//it will push the all logger data on html report
		//extent.close();// it will give end to the reports
	}
}
