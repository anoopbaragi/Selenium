package Package1;

import java.awt.AWTException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Demo
{
	AndroidDriver<WebElement> driver;

	
	@BeforeTest
	public void bt() throws MalformedURLException
	{
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		dc.setCapability(AndroidMobileCapabilityType.CHROMEDRIVER_EXECUTABLE, "C:\\Users\\HP\\eclipse-workspace\\mobiletesting\\chromedriver.exe");
		driver=new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
	}
	
	@Test
	public void demo() throws InterruptedException, AWTException
	{
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//*[@class='gLFyf']")).sendKeys("Orangehrm Demo");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("OrangeHRM Demo.")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
		/*JavascriptExecutor js = (JavascriptExecutor)driver;
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		js.executeScript("document.getElementsByClassName('radioButton')[0].click()");
		js.executeScript("document.getElementsByClassName('radioButton')[1].click()");
		js.executeScript("document.getElementsByClassName('radioButton')[2].click()");
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"WebView\").instance(0))").click(); //scroll down to the element and click
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(1000);*/
	}
}
