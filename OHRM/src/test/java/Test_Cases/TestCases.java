package Test_Cases;

import Configarations.Config;
import Fetch_Data.Get_Data;
import Pages.Add_User;
import Pages.HRA;
import Pages.Login;
import Pages.Logout;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Objects;

import static Configarations.Config.Actual_Data;
import static Configarations.Config.Expected_Data;

public class TestCases
{
    @Test
    public void Test_Case1() throws InterruptedException, IOException {
        Config cfg = new Config();
        cfg.beforesuite();
        Login login_page = new Login();
        login_page.Login_page("Admin","RBHh7spC@8");
        HRA page1 = new HRA();
        page1.Click_HRA();
        Add_User add_user = new Add_User();
        add_user.User_Details();
        Logout logout = new Logout();
        logout.Log_Out();
        login_page.Login_page("Baragi","Abcd@1234");
        Get_Data get_data = new Get_Data();
        get_data.Actual_Data();
        logout.Log_Out();
        assert Objects.equals(Expected_Data, Actual_Data);
        cfg.aftersuite();
        //Using_Properties properties = new Using_Properties();
//          properties.UsingProperties();
    }
}

