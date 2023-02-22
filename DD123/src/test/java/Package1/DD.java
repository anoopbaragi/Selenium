package Package1;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class DD 
{
	WebDriver wd;
	public String URL="https://opensource-demo.orangehrmlive.com/";
	public String un1, ps1;
	@BeforeTest
	public void BT() throws InterruptedException{
		WebDriverManager.chromedriver().setup();
		wd = new ChromeDriver();
		wd.get(URL);
		wd.manage().window().maximize();
		Thread.sleep(3000);
	}
  @Test
  public void datadriven() throws IOException, InterruptedException {
	 
	  File excel =new File("C:/Users/HP/Downloads/DD.xlsx/");
	  FileInputStream fis = new FileInputStream(excel);
	  XSSFWorkbook bk = new XSSFWorkbook(fis);
	  XSSFSheet sh = bk.getSheet("Sheet1");
	 
	  int rowcount = sh.getLastRowNum();
	 
	  for(int i=0; i<=rowcount; i++) {
		 String un = sh.getRow(i).getCell(0).getStringCellValue();
		 String ps = sh.getRow(i).getCell(1).getStringCellValue();
		 wd.findElement(By.name("username")).sendKeys(un);
		 wd.findElement(By.name("password")).sendKeys(ps);
		 wd.findElement(By.xpath("//*[@type='submit']")).click();
		 Thread.sleep(3000);
		
          if(wd.getCurrentUrl().equalsIgnoreCase("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index")) {
			
			 wd.findElement(By.xpath("//*[@class=\'oxd-userdropdown-name\']")).click();
			 Thread.sleep(1000);
			  wd.findElement(By.linkText("Logout")).click();
			  Thread.sleep(3000);
		 }
		
          else if(wd.findElement(By.xpath("//*[@class='oxd-alert-content oxd-alert-content--error']")).isDisplayed()) {
			 for(int j=i+1; j<=rowcount; j++) {
				 un1 = sh.getRow(j).getCell(0).getStringCellValue();
				 ps1 = sh.getRow(j).getCell(1).getStringCellValue();
				
				 wd.findElement(By.name("username")).sendKeys(un1);
				 wd.findElement(By.name("password")).sendKeys(ps1);
				
				 wd.findElement(By.xpath("//*[@type='submit']")).click();
				 Thread.sleep(3000);
			
			 if(wd.getCurrentUrl().equalsIgnoreCase("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index")) {
				
				 wd.findElement(By.xpath("//*[@class=\'oxd-userdropdown-name\']")).click();
				 Thread.sleep(1000);
				  wd.findElement(By.linkText("Logout")).click();
				  Thread.sleep(3000);
			 }
		 }
			 break;	
		 }
	  }
  }
}