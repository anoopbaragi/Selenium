package Package2;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.event.MenuKeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class Upload
{  
	private static final Set<String> String = null;
	WebDriver wb;
	String URL = "https://demoqa.com/upload-download";
	String URL1 = "https://demoqa.com/alerts";
	String URL2 = "https://demoqa.com/browser-windows";
  @BeforeTest
  public void beforeTest() 
  {
	  WebDriverManager.chromedriver().setup();//chrome,firefox,safari
	  wb= new ChromeDriver();
  }

  @Test(enabled = false)
  public void uploadingfile()
  {
	wb.get(URL);
	wb.manage().window().maximize();
	wb.findElement(By.id("uploadFile")).sendKeys("C:\\Users\\HP\\OneDrive\\Desktop\\Scrren Shot\\gitcmd.PNG");//uploading a file
  }
  @Test(enabled = false)
  public void Aletrs() throws InterruptedException, AWTException 
  {
	  wb.get(URL1);
	  wb.manage().window().maximize();
	  wb.findElement(By.id("alertButton")).click();//clicking on alert button
	  Alert alt = wb.switchTo().alert();//switch alert pop up
	  Robot rb = new Robot();
	  Thread.sleep(3000);
	  System.out.println(alt.getText());
	  Thread.sleep(3000);
	  alt.accept();//Clicking on pop shown
	  wb.findElement(By.id("timerAlertButton")).click();//appear after 5 seconds
	  wb.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  WebDriverWait wbw = new WebDriverWait(wb, 180);	
	  wbw.until(ExpectedConditions.alertIsPresent());
	  System.out.println(alt.getText());
	  Thread.sleep(3000);
	  alt.accept();
	  wb.findElement(By.id("confirmButton")).click();
	  Thread.sleep(3000);
	  alt.dismiss();
	  Thread.sleep(3000);
	  rb.keyPress(MenuKeyEvent.VK_PAGE_DOWN);
	  wb.findElement(By.id("promtButton")).click();
      Thread.sleep(2000);
      Alert alter3=wb.switchTo().alert();
      System.out.println(alter3.getText());
      Thread.sleep(2000);
      alter3.sendKeys("abcd");
      alter3.accept();
  }
  @Test(enabled = true)
  public void browser_windows() throws InterruptedException, AWTException 
  {
	  wb.get(URL2);
	  wb.manage().window().maximize();
	  Robot rb = new Robot();
	  Thread.sleep(3000);
	 /* wb.findElement(By.id("tabButton")).click();
	  Thread.sleep(5000);
	  rb.keyPress(MenuKeyEvent.VK_CONTROL);
	  rb.keyPress(MenuKeyEvent.VK_TAB);
	  rb.keyRelease(MenuKeyEvent.VK_CONTROL);*/
	  for(int i =0; i<3;i++)
	  {
		  wb.findElement(By.id("windowButton")).click();
		  Thread.sleep(1000);
	  }
	  Thread.sleep(1000);
	  String p_window = wb.getWindowHandle();//this one gets the window handle (id) id of parent window
	  System.out.println(p_window);//print the same id.
	  Set<String> allwin =wb.getWindowHandles();
	  System.out.println(allwin);//getting the all id
	  System.out.println(allwin.size());//getting count of the id
	  String laswindow= "";
	  for(int i=0; i<3; i++){
		  wb.findElement(By.id("windowButton")).click();
		  Thread.sleep(1000);
		  }
		  Set<String> allwindows = wb.getWindowHandles();
		  System.out.println(allwindows);
		  System.out.println(allwindows.size());
		  String lastWindow="";
		  for(String handle: allwindows) {
		  wb.switchTo().window(handle);
		  wb.get("https://www.google.com/");
		  lastWindow = handle;
		  }
		  Thread.sleep(3000);
		  wb.switchTo().window(p_window);
		  wb.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  wb.close();
		  wb.switchTo().window(lastWindow);
		  wb.get("https://www.gmail.com/");
		  //Thread.sleep(2000);
		  //rc.keyPress(MenuKeyEvent.VK_DOWN);
		  //rc.keyPress(MenuKeyEvent.VK_DOWN);
		  //wb.findElement(By.id("messageWindowButton")).click();
		  //Thread.sleep(4000);
		  //wb.quit();
		  }
  @AfterTest
  public void afterTest() 
  {
	  //wb.close();
  }
}
