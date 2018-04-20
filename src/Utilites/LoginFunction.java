package Utilites;

import Pages.Loginpage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by laxmikant on 18/05/2017.
 */
public class LoginFunction {
   static WebDriver driver;

    public static void LogFunction(WebDriver driver)
    {
        Loginpage loginpage=new Loginpage(driver);
        loginpage.setLoginNm("Akshay85");
        loginpage.setLoginPass("Admin@123");
        loginpage.ClickSubmit();


    }


}
