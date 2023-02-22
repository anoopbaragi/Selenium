package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo 
{
	public static void main(String[] args) throws InterruptedException 
	{
		String str,str1;
		System.setProperty("webdriver.chrome.driver", "C:\\selenium-java-4.7.0\\chromedriver.exe");
		//WebDriver wd = new ChromeDriver();
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		//wd.findElement(By.name("username")).sendKeys("Admin");//username
		//wd.findElement(By.name("password")).sendKeys("admin123");//password
		wd.findElement(By.xpath("//*[@name=\'username']")).sendKeys("6546465");//xpathwithname
		wd.findElement(By.xpath("//*[@name=\'password']")).sendKeys("admin123");//xpathwithname
		//wd.findElement(By.xpath("//*[@class=\'oxd-input oxd-input--active\']")).sendKeys("Admin");//Xpathwithclass
		//wd.findElement(By.xpath("//*[@class=\'oxd-input oxd-input--active\']")).sendKeys("admin123");//Xpathwithclass
		wd.findElement(By.xpath("//*[@class=\'oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();//Xpath
		Thread.sleep(5000);
		//wd.findElement(By.linkText("Admin")).click();
		wd.findElement(By.xpath("(//*[@class=\'oxd-text oxd-text--span oxd-main-menu-item--name\'])[2]")).click();//PIM
		wd.findElement(By.xpath("//*[@class=\'oxd-icon bi-chevron-left\']")).click();
        wd.findElement(By.xpath("//*[@class=\'oxd-icon bi-caret-down-fill oxd-userdropdown-icon\']")).click();
        wd.findElement(By.xpath("//*[@class=\'oxd-icon bi-chevron-left\']")).click();
        wd.findElement(By.xpath("//*[@class=\'oxd-icon bi-caret-down-fill oxd-userdropdown-icon\']")).click();
        Thread.sleep(3000);   //waiting time
        wd.findElement(By.xpath("//*[@href=\'/web/index.php/auth/logout\']")).click();
		//Thread.sleep(5000);
		//wd.findElement(By.linkText("Dashboard")).click();
		//Thread.sleep(5000);
		//wd.findElement(By.xpath("//*[@href=\'/web/index.php/auth/logout\']"));
		//str=wd.getTitle();
		//str1=wd.getCurrentUrl();
		//System.out.println("The title of the webpage: " +str);
		//System.out.println("The Current URL: " +str1);
		//wd.close();
	}
	/*ad.findElement(By.xpath("//*[@class=\'oxd-userdropdown-name\']")).click();
	  Thread.sleep(1000);
	  ad.findElement(By.linkText("Logout")).click();
	  Thread.sleep(3000);*/
}
