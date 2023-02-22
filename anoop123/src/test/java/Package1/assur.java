package Package1;

import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class assur {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium-java-4.7.0\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		/*String str = wd.getTitle();
		String expected_Title ="OrangeHRM";
		Assert.assertEquals(str, expected_Title);*/
		WebElement d = wd.findElement(By.xpath("//*[@class=\'oxd-text oxd-text--p orangehrm-login-forgot-header\']"));
		Assert.assertEquals(true, d.isDisplayed());
		System.out.println("Assurestion Passed");
		wd.close();
	}
}
