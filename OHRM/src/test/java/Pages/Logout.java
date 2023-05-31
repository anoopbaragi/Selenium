package Pages;

import Helper.Helper;

import static Configarations.Config.*;

public class Logout extends Helper
{
    public void Log_Out() throws InterruptedException
    {
        Sleep();
        wd.findElement(Logout).click();
    }
}
