package Package1;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.MoveToOffsetAction;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import io.appium.java_client.touch.offset.PointOption;

public class phone 
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
	public void testcase1() throws InterruptedException
	{
		System.out.println("Native Application");
		driver.findElement(MobileBy.AccessibilityId("key pad")).click();
		driver.findElement(MobileBy.AccessibilityId("7,PQRS")).click();
		driver.findElement(MobileBy.AccessibilityId("8,TUV")).click();
		driver.findElement(MobileBy.AccessibilityId("2,ABC")).click();
		driver.findElement(MobileBy.AccessibilityId("9,WXYZ")).click();
		driver.findElement(MobileBy.AccessibilityId("7,PQRS")).click();
		driver.findElement(MobileBy.AccessibilityId("2,ABC")).click();
		driver.findElement(MobileBy.AccessibilityId("6,MNO")).click();
		driver.findElement(MobileBy.AccessibilityId("8,TUV")).click();
		driver.findElement(MobileBy.AccessibilityId("4,GHI")).click();
		driver.findElement(MobileBy.AccessibilityId("6,MNO")).click();
		Thread.sleep(2000);
		driver.findElement(MobileBy.AccessibilityId("dial")).click();
		//WebElement we = driver.findElements(MobileBy.className("android.widget.FrameLayout")).get(0);
		/*AndroidTouchAction act = new AndroidTouchAction(driver);
		act.longPress(LongPressOptions.longPressOptions().withElement(ElementOption.element(we))).perform();
		System.out.println("Longpress Tapped");*/
		//WebElement we1 = driver.findElements(MobileBy.className("android.widget.LinearLayout")).get(1);
		//TouchAction act = new TouchAction(driver);
		//act.longPress(longPressOptions().withElement(element(we))).release().perform();
		//act.longPress(longPressOptions().withElement(element(we1)).withDuration(Duration.ofSeconds(2))).moveTo(we1);
		//act.longPress(longPressOptions().withElement(element(we)).withDuration(Duration.ofSeconds(20))).release().perform();
	}
}
