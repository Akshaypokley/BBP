import Utilites.LoginFunction;
import Utilites.OpenBrowser;
import org.openqa.selenium.WebDriver;

import static Utilites.LoginFunction.LogFunction;
import static Utilites.OpenBrowser.GetUrl;
import static Utilites.OpenBrowser.openBrowser;

/**
 * Created by AKSHAY on 20/04/2018.
 */
public class SmapleTest {

    public static void main(String args[])
    {
        WebDriver driver;

        driver= openBrowser("Firefox");
        GetUrl("url");
        LogFunction(driver);
    }
}
