package Pages;



import Locators.Locator;

import static Configarations.Config.*;

public class Login extends Locator
{
    public void Login_page(String User_Name , String pass)
    {
        wd.findElement(UserName).sendKeys(User_Name);
        wd.findElement(Password).sendKeys(pass);
        wd.findElement(Submit).click();
    }
}
