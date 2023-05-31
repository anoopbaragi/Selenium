package Locators;

import org.openqa.selenium.By;


public class Locator
{
    //Locators For Login_Page
    protected By UserName = By.id("txtUsername");
    protected By Password = By.id("txtPassword");
    protected By Submit = By.xpath("//*[@type='submit']");

    //Locators For Wait And Click Add_User
    public By HRA_Click = By.linkText("HR Administration");
    public By Edit_Icon = By.xpath("//*[text()='ohrm_edit']");

    public  By Add_User = By.xpath("//*[@class='btn-floating btn-large waves-effect waves-light']");

    //Locators For User Details

    public By E_Name = By.id("selectedEmployee_value");
    public By User_Name = By.id("user_name");
    public By E_Name_DrpDown = By.xpath("//*[@class=\"angucomplete-wrapper\"]/descendant::span[7]");

    public By ESS_Role = By.xpath("//*[@data-id='essrole']");
    public By ESS_Role_Select = By.id("bs-select-1-1");

    public By Supervisor_Role = By.xpath("//*[@data-id='supervisorrole']");

    public By Supervisor_Role_Selected = By.id("bs-select-2-2");

    public By Admin_Role = By.xpath("//*[@data-id='adminrole']");

    public By Admin_Role_Selected = By.id("bs-select-3-7");

    protected By New_Password = By.id("password");
    protected By Confirm_Password =By.id("confirmpassword");

    public  By Element = By.xpath("//*[@class='modal-content ']");

    public By Save = By.id("modal-save-button");

    public By Logout = By.xpath("//*[text()='Log Out']");

    public  By Data = By.xpath("//*[@class='name']");
}
