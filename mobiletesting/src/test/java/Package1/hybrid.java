package Package1;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class hybrid extends capabilities
{
	AndroidDriver<AndroidElement> driver;

	@Test
	public void test2() throws MalformedURLException, InterruptedException {
 driver = cap();
 driver.findElement(MobileBy.id("com.androidsample.generalstore:id/spinnerCountry")).click();
 driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"India\"))").click();
 driver.findElement(MobileBy.id("com.androidsample.generalstore:id/nameField")).sendKeys("ABCD");
 driver.findElement(MobileBy.id("com.androidsample.generalstore:id/radioMale")).click();
/* driver.findElement(MobileBy.id("com.androidsample.generalstore:id/btnLetsShop")).click();
 driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Jordan Lift Off\"))");
 Thread.sleep(1000);
 driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"ADD TO CART\")")).click();
 Thread.sleep(1000);
 driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"ADD TO CART\")")).click();
 Thread.sleep(1000);
 driver.findElement(MobileBy.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
 Thread.sleep(1000);
 String price1 = driver.findElements(MobileBy.id("com.androidsample.generalstore:id/productPrice")).get(0).getText();
 System.out.println("price-1: " + price1);
 price1 = price1.substring(1);
 Double dprice1 = Double.parseDouble(price1);
 System.out.println(dprice1);
 String price2 = driver.findElements(MobileBy.id("com.androidsample.generalstore:id/productPrice")).get(1).getText();
 System.out.println("price-2: " + price2);
 price2 = price2.substring(1);
 Double dprice2 = Double.parseDouble(price2);
 System.out.println(dprice2);
 String TotalPrice = driver.findElement(MobileBy.id("com.androidsample.generalstore:id/totalAmountLbl")).getText();
 System.out.println("Total Price: " + TotalPrice);
 TotalPrice = TotalPrice.substring(2);
 Double dtotal = Double.parseDouble(TotalPrice);
 System.out.println("dtotal:" + dtotal);
 Double AddedTotal = dprice1 + dprice2;
 System.out.println("AddTotal:" + AddedTotal);
 //Assert.assertEquals(dtotal, AddedTotal);
 if (dtotal.equals(AddedTotal))
 {
 System.out.println("Assertion Pass");
 } 
 else
 {
 System.out.println("Assertion Fail");
 }*/
 	//
 	//driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH));
 	//driver.findElements(MobileBy.id("com.android.systemui:id/task_view_thumbnail")).get(0).click();
 	//driver.findElement(MobileBy.className("android.widget.CheckBox")).click();
 	//driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH));
 	//driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH));
 	driver.pressKey(new KeyEvent(AndroidKey.VOLUME_DOWN).withKey(AndroidKey.POWER));
	}
}
