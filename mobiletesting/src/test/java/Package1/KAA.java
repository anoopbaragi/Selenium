package Package1;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class KAA 
{
	AndroidDriver<WebElement> driver;
	
	@BeforeTest
	public void bt() throws MalformedURLException
	{
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
		dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "org.khanacademy.android");
		dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "org.khanacademy.android.ui.library.MainActivity");
		driver=new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"),dc);

	}
	@Test
	public void test() throws InterruptedException 
	{
		System.out.println("Khan Accademy");
		//Thread.sleep(2000);
		//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Sign in\"))").click();
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.Button"))).click();
		Thread.sleep(2000);
		driver.findElements(MobileBy.className("android.widget.Button")).get(5).click();
		Thread.sleep(2000);
		driver.findElement(MobileBy.AccessibilityId("Sign in with Google")).click();
		Thread.sleep(2000);
		//driver.findElements(MobileBy.className("android.widget.LinearLayout")).get(1).click();
		WebDriverWait wait1 = new WebDriverWait(driver,10);
		wait1.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(MobileBy.className("android.widget.LinearLayout"))).get(1).click();
		Thread.sleep(2000);
		//driver.findElement(MobileBy.className("android.widget.Button")).click();
		WebDriverWait wait2 = new WebDriverWait(driver,20);
		wait2.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(MobileBy.AccessibilityId("Dismiss")));
		Thread.sleep(2000);
		//driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"My courses\"))"));
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(text(\"My courses\"))"));
		Thread.sleep(2000);
		driver.findElements(MobileBy.className("android.widget.Button")).get(1).click();
		//Thread.sleep(2000);
		//driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Class 10\"))")).click();
		Thread.sleep(2000);
		//driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Trigonometry\")")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(text(\"Trigonometry\"))")).click();
		Thread.sleep(2000);
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(text(\"Physics library\"))")).click();
		Thread.sleep(2000);
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(text(\"See All (3)\"))")).click();
		Thread.sleep(2000);
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(text(\"Finance and capital markets\"))")).click();
		Thread.sleep(2000);
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Done\")")).click();
		//Thread.sleep(2000);
		//System.out.println("logout");
		//driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(text(\"My courses\"))"));
		//Thread.sleep(2000);
		//WebDriverWait wait3 = new WebDriverWait(driver,20);
		//wait3.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(MobileBy.AccessibilityId("Settings")));
		//System.out.println("in");
		//Thread.sleep(2000);
		//System.out.println("log");
		driver.findElement(MobileBy.AccessibilityId("Settings")).click();
		//System.out.println("log123");
		Thread.sleep(2000);
		//driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(text(\"Sign out\"))")).click();
		//Thread.sleep(2000);
		driver.findElement(MobileBy.id("android:id/button1")).click();
		System.out.println("Sigined Out");
		Thread.sleep(2000);
	 	driver.pressKey(new KeyEvent(AndroidKey.HOME));
	}
}
