package Package1;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class nativeapp 
{
	AndroidDriver<WebElement> driver;
	
	@BeforeTest
	public void bt() throws MalformedURLException
	{
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
		dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "io.appium.android.apis");
		dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "io.appium.android.apis.ApiDemos");
		driver=new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"),dc);

	}
	
	@Test
	public void testcase1() throws InterruptedException
	{
		System.out.println("Native Application");
		driver.findElements(MobileBy.id("android:id/text1")).get(9).click();
		/*Thread.sleep(2000);
		driver.findElements(MobileBy.id("android:id/text1")).get(2).click();
		Thread.sleep(2000);
		driver.findElements(MobileBy.id("android:id/checkbox")).get(0).click();
		Thread.sleep(2000);
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"WiFi settings\")")).click();
		Thread.sleep(2000);
		driver.findElements(MobileBy.id("android:id/edit")).get(0).sendKeys("Anoop");
		Thread.sleep(2000);
		driver.findElements(MobileBy.id("android:id/button2")).get(0).click();*/
		//driver.navigate().back();
		/*driver.findElements(MobileBy.id("android:id/text1")).get(1).click();
		Thread.sleep(2000);
		driver.findElements(MobileBy.id("android:id/text1")).get(1).click();
		Thread.sleep(2000);
		driver.findElement(MobileBy.className("android.view.View")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElements(MobileBy.id("android:id/text1")).get(2).click();
		Thread.sleep(2000);
		driver.findElements(MobileBy.id("com.example.android.apis:id/startButton")).get(0).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElements(MobileBy.id("android:id/text1")).get(3).click();
		Thread.sleep(2000);
		driver.findElement(MobileBy.id("com.example.android.apis:id/startButton")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElements(MobileBy.id("android:id/text1")).get(4).click();*/
		//driver.findElement(MobileBy.AccessibilityId("Animation")).click();
		//driver.openNotifications();
		//Thread.sleep(2000);
		//driver.findElement(MobileBy.AccessibilityId("Battery Saver")).click();
		//Thread.sleep(2000);
		//driver.findElement(MobileBy.AccessibilityId("Battery Saver")).click();
		//Thread.sleep(2000);
		//driver.pressKey(new KeyEvent(AndroidKey.VOLUME_UP).withKey(AndroidKey.POWER));
	}
}
