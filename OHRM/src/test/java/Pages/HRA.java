package Pages;

import Helper.Helper;

import static Configarations.Config.*;


public class HRA extends Helper
{
    public void Click_HRA()
    {
        wd.findElement(HRA_Click).click();
        wait_Click();
        wd.findElement(Add_User).click();
    }
}
