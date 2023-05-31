package Helper;

import Locators.Locator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static Configarations.Config.*;


public class Helper extends Locator
{
    public void wait_Click()
    {
        WebDriverWait wait = new WebDriverWait(wd, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(Edit_Icon));
    }
    public void I_Wait()
    {
        wd.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
    public void Sleep() throws InterruptedException
    {
        Thread.sleep(3000);
    }
}
