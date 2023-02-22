package Package1;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class calculator 
{
	AndroidDriver<WebElement> driver;
	
	@BeforeTest
	public void bt() throws MalformedURLException
	{
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
		dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.google.android.dialer");
		dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.google.android.apps.dialer.extensions.GoogleDialtactsActivity");
		driver=new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"),dc);

	}
	
	@Test
	public void test() throws InterruptedException
	{
		System.out.println("Calculator is accessable");
		driver.findElement(MobileBy.id("com.android.calculator2:id/digit_4")).click();
		driver.findElement(MobileBy.id("com.android.calculator2:id/digit_5")).click();
		driver.findElement(MobileBy.AccessibilityId("plus")).click();
		driver.findElement(MobileBy.id("com.android.calculator2:id/digit_9")).click();
		driver.findElement(MobileBy.AccessibilityId("equals")).click();
		Thread.sleep(4000);
		driver.findElement(MobileBy.AccessibilityId("clear")).click();
		driver.navigate().back();
		Thread.sleep(2000);
	}
}
