package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amz 
{
	public static void main(String[] args) throws InterruptedException
	{
		String str;
		System.setProperty("webdriver.chrome.driver", "C:\\selenium-java-4.7.0\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.navigate().to("https://www.amazon.in/");
		Thread.sleep(3000);
		wd.findElement(By.xpath("//*[@class=\'nav-a nav-a-2   nav-progressive-attribute\']")).click();
		wd.findElement(By.xpath("//*[@id=\'ap_email\']")).sendKeys("9448762964");
		wd.findElement(By.xpath("//*[@class=\'a-button-input\']")).click();
		wd.findElement(By.xpath("//*[@id=\'ap_password\']")).sendKeys("Qwerty@4395");
		wd.findElement(By.xpath("//*[@class=\'a-button-input\']")).click();
		//wd.findElement(By.xpath("//*[@data-csa-c-id=\'c1jbr9-lhabra-bnwp3x-iwwo5r\']")).click();
		wd.findElement(By.linkText("Amazon Pay")).click();
		str =wd.getTitle();
		System.out.println("Title: "+str);
	}
}
