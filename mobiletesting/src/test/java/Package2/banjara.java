package Package2;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
/*import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;*/

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class banjara 
{
	//ExtentReports extent;
	//ExtentTest logger;
	ExtentHtmlReporter htmlReporter; 
	ExtentReports extent; 
	AndroidDriver<WebElement> driver;
	
	@BeforeTest
	public void bt() throws MalformedURLException
	{
		//extent = new ExtentReports(System.getProperty("user.dir")+ "/test-output/report.html",true);
		//extent.loadConfig(new File(System.getProperty("user.dir")+ "src/test/java/extent-config.xml"));
		htmlReporter = new ExtentHtmlReporter("BanjaraReport.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
		dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.forbinary.banjararide");
		dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.forbinary.banjararide.activity.SplashActivity");
		driver=new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
	}
	
	@Test
	public void test1() throws InterruptedException
	{
		//logger = extent.startTest("BanjaraReport");
		ExtentTest test = extent.createTest("BanjaraReport");
		System.out.println("banjararide opened");
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"ENGLISH\"))").click();
		//logger.log(LogStatus.PASS, "Select Application Page Opened");
		test.log(Status.PASS, "Language Page Opened");
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.id("com.forbinary.banjararide:id/imageView_arrow"))).click();
		//logger.log(LogStatus.PASS, "Click Consumer Button Clicked");
		test.log(Status.PASS, "List of Country Button Clicked");
		Thread.sleep(2000);
		driver.findElement(MobileBy.id("com.forbinary.banjararide:id/editText_search")).sendKeys("India");
		//logger.log(LogStatus.PASS, "Search field Entered");
		test.log(Status.PASS, "Country name entered");
		Thread.sleep(2000);
		driver.findElementByAndroidUIAutomator("new UiSelector().text(\"India (IN)\")").click();
		//logger.log(LogStatus.PASS, "Searched Country Selected");
		test.log(Status.PASS, "Countary Name Selected");
		driver.findElement(MobileBy.id("com.forbinary.banjararide:id/edtMobileNumber")).sendKeys("7829726846");
		//logger.log(LogStatus.PASS, "Mobile Number Entered");
		test.log(Status.PASS, "Mobile NUmber Eneterd");
		driver.findElement(MobileBy.id("com.forbinary.banjararide:id/imgNext")).click();
		//logger.log(LogStatus.PASS, "Submit Click");
		test.log(Status.PASS, "Submit Button Clicked");
		Thread.sleep(15000);
		driver.findElement(MobileBy.id("com.forbinary.banjararide:id/imgNext")).click();
		//logger.log(LogStatus.PASS, "OTP Matches redirected to Book Now");
		test.log(Status.PASS, "OTP Matches redirected to Home Page");
		Thread.sleep(5000);
		driver.findElement(MobileBy.id("com.forbinary.banjararide:id/link_2")).click();
		//logger.log(LogStatus.PASS, "Book Now is Clicked");
		test.log(Status.PASS, "Book Now Clicked");
		Thread.sleep(5000);
		driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Hire Bike\")").click();
		//wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Hire Bike\")"))).click();
		//logger.log(LogStatus.PASS, "Hire Bike Clicked");
		test.log(Status.PASS, "Hire Bike Clicked");
		WebDriverWait wait1 = new WebDriverWait(driver,30);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("‎‏‎‎‎‎‎‏‎‏‏‏‎‎‎‎‎‏‎‎‏‎‎‎‎‏‏‏‏‏‎‏‏‎‏‏‎‎‎‎‏‏‏‏‏‏‏‎‏‏‏‏‏‎‏‎‎‏‏‎‏‎‎‎‎‎‏‏‏‎‏‎‎‎‎‎‏‏‎‏‏‎‎‏‎‏‎‏‏‏‏‏‎‎Navigate up‎‏‎‎‏‎")));
		Thread.sleep(2000);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"CB Hornet 160R\"))").click();
		//logger.log(LogStatus.PASS, "CB Hornet 160R Selected");
		test.log(Status.PASS, "CB Hornet 160R Selected");
		Thread.sleep(10000);
		//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"₹ 3,000\"))");
		//Thread.sleep(2000);
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Book Now\")")).click();
		//logger.log(LogStatus.PASS, "Book Now Clicked");
		test.log(Status.PASS, "Book Now Clicked");
		Thread.sleep(5000);
		driver.findElement(MobileBy.id("com.forbinary.banjararide:id/tvDate")).click();
		//logger.log(LogStatus.PASS, "Date Picker Clicked");
		test.log(Status.PASS, "Date Picker Clicked");
		Thread.sleep(3000);
		driver.findElement(MobileBy.AccessibilityId("Next month")).click();
		//logger.log(LogStatus.PASS, "Next Month Clicked");
		test.log(Status.PASS, "Next Month Clicked");
		Thread.sleep(2000);
		driver.findElement(MobileBy.AccessibilityId("10 February 2023")).click();
		//logger.log(LogStatus.PASS, "Date Selected");
		test.log(Status.PASS, "Date Selected");
		Thread.sleep(2000);
		driver.findElement(MobileBy.id("android:id/button1")).click();
		Thread.sleep(2000);
		driver.findElement(MobileBy.AccessibilityId("‎‏‎‎‎‎‎‏‎‏‏‏‎‎‎‎‎‏‎‎‏‎‎‎‎‏‏‏‏‏‎‏‏‎‏‏‎‎‎‎‏‏‏‏‏‏‏‎‏‏‏‏‏‎‏‎‎‏‏‎‏‎‎‎‎‎‏‏‏‎‏‎‎‎‎‎‏‏‎‏‏‎‎‏‎‏‎‏‏‏‏‏‎‎Navigate up‎‏‎‎‏‎")).click();
		//logger.log(LogStatus.PASS, "Navigate Back");
		test.log(Status.PASS, "Navigate Back");
		Thread.sleep(2000);
		driver.findElement(MobileBy.AccessibilityId("‎‏‎‎‎‎‎‏‎‏‏‏‎‎‎‎‎‏‎‎‏‎‎‎‎‏‏‏‏‏‎‏‏‎‏‏‎‎‎‎‏‏‏‏‏‏‏‎‏‏‏‏‏‎‏‎‎‏‏‎‏‎‎‎‎‎‏‏‏‎‏‎‎‎‎‎‏‏‎‏‏‎‎‏‎‏‎‏‏‏‏‏‎‎Navigate up‎‏‎‎‏‎")).click();
		//logger.log(LogStatus.PASS, "Navigate Back");
		test.log(Status.PASS, "Navigate Back");
		Thread.sleep(2000);
		driver.findElement(MobileBy.AccessibilityId("‎‏‎‎‎‎‎‏‎‏‏‏‎‎‎‎‎‏‎‎‏‎‎‎‎‏‏‏‏‏‎‏‏‎‏‏‎‎‎‎‏‏‏‏‏‏‏‎‏‏‏‏‏‎‏‎‎‏‏‎‏‎‎‎‎‎‏‏‏‎‏‎‎‎‎‎‏‏‎‏‏‎‎‏‎‏‎‏‏‏‏‏‎‎Navigate up‎‏‎‎‏‎")).click();
		//logger.log(LogStatus.PASS, "Navigate Back");
		test.log(Status.PASS, "Navigate Back");
		Thread.sleep(2000);
		driver.findElement(MobileBy.AccessibilityId("Open")).click();
		//logger.log(LogStatus.PASS, "Open Selected");
		test.log(Status.PASS, "Open Selected");
		Thread.sleep(2000);
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Bookings\")")).click();
		//logger.log(LogStatus.PASS, "Booking Selected");
		test.log(Status.PASS, "Booking Selected");
		Thread.sleep(5000);
		driver.findElement(MobileBy.id("com.forbinary.banjararide:id/search_button")).click();
		//logger.log(LogStatus.PASS, "Search Selected");
		test.log(Status.PASS, "Search Selected");
		Thread.sleep(2000);
		driver.findElement(MobileBy.id("com.forbinary.banjararide:id/search_src_text")).sendKeys("activa");
		//logger.log(LogStatus.PASS, "Activa Searched");
		test.log(Status.PASS, "Activa Searched");
		Thread.sleep(2000);
		driver.findElement(MobileBy.AccessibilityId("‎‏‎‎‎‎‎‏‎‏‏‏‎‎‎‎‎‏‎‎‏‎‎‎‎‏‏‏‏‏‏‎‏‏‎‎‏‏‎‎‏‏‏‎‏‏‏‏‏‏‎‏‏‏‏‏‎‏‎‏‎‏‎‎‏‎‎‎‎‏‎‎‎‏‏‎‏‏‏‏‎‎‎‎‎‎‎‎‎‎‏‎‎‏‎Clear query‎‏‎‎‏‎")).click();
		//logger.log(LogStatus.PASS, "Exit Button Clicked");
		test.log(Status.PASS, "Exit Button Clicked");
		Thread.sleep(2000);
		driver.findElement(MobileBy.AccessibilityId("‎‏‎‎‎‎‎‏‎‏‏‏‎‎‎‎‎‏‎‎‏‎‎‎‎‏‏‏‏‏‎‏‏‎‏‏‎‎‎‎‏‏‏‏‏‏‏‎‏‏‏‏‏‎‏‎‎‏‏‎‏‎‎‎‎‎‏‏‏‎‏‎‎‎‎‎‏‏‎‏‏‎‎‏‎‏‎‏‏‏‏‏‎‎Navigate up‎‏‎‎‏‎")).click();
		//logger.log(LogStatus.PASS, "Navigate Back");
		test.log(Status.PASS, "Navigate Back");
		Thread.sleep(2000);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Call Us\"))").click();
		//logger.log(LogStatus.PASS, "Call Us Selected");
		test.log(Status.PASS, "Call Us Selected");
		Thread.sleep(3000);
	 	driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH));
	 	Thread.sleep(3000);
	 	driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH));
		//logger.log(LogStatus.PASS, "Redirected to banjara app");
	 	test.log(Status.PASS, "Redirected to banjara app");
	 	Thread.sleep(5000);
		driver.findElement(MobileBy.AccessibilityId("Open")).click();
		//logger.log(LogStatus.PASS, "Open Selected");
		test.log(Status.PASS, "Open Selected");
		Thread.sleep(2000);
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Logout\")")).click();
		//logger.log(LogStatus.PASS, "Logout Selected");
		test.log(Status.PASS, "Logout Selected");
		Thread.sleep(5000);
	 	driver.pressKey(new KeyEvent(AndroidKey.HOME));
		}
	
	@AfterTest
	public void afterTest()
	{
		//extent.endTest(logger);// end the logger functions
		extent.flush();//it will push the all logger data on html report
		//extent.close();// it will give end to the reports
	}
}
