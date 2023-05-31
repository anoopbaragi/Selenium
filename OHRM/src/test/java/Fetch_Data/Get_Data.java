package Fetch_Data;

import Locators.Locator;
import org.openqa.selenium.By;

import static Configarations.Config.*;

public class Get_Data extends Locator
{
    public void Expected_Data()
    {
        Expected_Data =  wd.findElement(E_Name_DrpDown).getText();
        System.out.println("Expected DATA : " + Expected_Data);
    }
    public void Actual_Data()
    {
        Actual_Data =  wd.findElement(Data).getText();
        System.out.println("Actual DATA : " + Actual_Data);
    }
}
