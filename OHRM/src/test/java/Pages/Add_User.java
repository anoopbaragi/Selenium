package Pages;

import Fetch_Data.Get_Data;
import Helper.Helper;

import static Configarations.Config.*;
import Fetch_Data.Get_Data.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Add_User extends Helper
{
    Get_Data getData = new Get_Data();
    JavascriptExecutor js = (JavascriptExecutor)wd;
    public void User_Details() throws InterruptedException {
        I_Wait();
        wd.findElement(E_Name).sendKeys("A");
        Sleep();
        getData.Expected_Data();
        wd.findElement(E_Name_DrpDown).click();
        wd.findElement(User_Name).sendKeys("Baragi");
        wd.findElement(ESS_Role).click();
        wd.findElement(ESS_Role_Select).click();
        wd.findElement(Supervisor_Role).click();
        wd.findElement(Supervisor_Role_Selected).click();
        wd.findElement(Admin_Role).click();
        wd.findElement(Admin_Role_Selected).click();
        js.executeScript("document.getElementById('status_0').click()");
        Sleep();
        js.executeScript("document.getElementById('status_1').click()");
        wd.findElement(New_Password).sendKeys("Abcd@1234");
        wd.findElement(Confirm_Password).sendKeys("Abcd@1234");
        WebElement we = wd.findElement(Element);
        js.executeScript("arguments[0].scrollIntoView(true);", we);
        wd.findElement(Save).click();
    }
}
