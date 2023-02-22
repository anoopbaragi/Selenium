package Package1;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.List;

import javax.swing.event.MenuKeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterTest;

public class PracticeForm 
{
	String URL1 = "https://demoqa.com/automation-practice-form";
	WebDriver wd;
  
  @BeforeTest
  public void beforeTest() 
  {
	  WebDriverManager.chromedriver().setup();
	  wd = new ChromeDriver();
	  wd.get(URL1);
	  wd.manage().window().maximize();
  }

  @Test
  public void form() throws InterruptedException, AWTException 
  {
	  JavascriptExecutor js = (JavascriptExecutor)wd;
	  js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	  js.executeScript("document.getElementById('firstName').value='Anoop'");
	  js.executeScript("document.getElementById('lastName').value='Baragi'");
	  js.executeScript("document.getElementById('userEmail').value ='baragi@gmail.com'");
	  //js.executeScript("document.getElementByxpath('//*[@class=\\'custom-control-label\\'])[1]\')).click()'");
	  wd.findElement(By.xpath("(//*[@class=\'custom-control-label\'])[1]")).click();
	  js.executeScript("document.getElementById('userNumber').value = '7829726846'");
	  js.executeScript("document.getElementById('dateOfBirthInput').value = '20 Dec 2022'");
	  //js.executeScript("document.getElementsByClassName('subjects-auto-complete__control css-yk16xz-control']/div').click().value = 'C'");
	  //wd.findElement(By.xpath("//*[@class='subjects-auto-complete__control css-yk16xz-control']/div")).sendKeys("A",Keys.TAB);
	  Thread.sleep(3000);
	  wd.findElement(By.xpath("(//*[@class=\'custom-control-label\'])[4]")).click();
	  wd.findElement(By.xpath("(//*[@class=\'custom-control-label\'])[5]")).click();
	  wd.findElement(By.xpath("(//*[@class=\'custom-control-label\'])[6]")).click();
	  wd.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\HP\\OneDrive\\Desktop\\Scrren Shot\\gitcmd.PNG");//uploading a file
	  wd.findElement(By.id("currentAddress")).sendKeys("Mysuru");
	  Thread.sleep(3000);
	  js.executeScript("document.getElementsByClassName(' css-1hwfws3')[1]).click()");
	  Robot rb =new Robot();
	  rb.keyPress(MenuKeyEvent.VK_DOWN);
	  rb.keyPress(MenuKeyEvent.VK_DOWN);
	  rb.keyPress(MenuKeyEvent.VK_ENTER);
	  wd.findElement(By.id("submit")).click();
  }
  
  @AfterTest
  public void afterTest() 
  {
	  
  }
}
