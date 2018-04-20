package Pages;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by AKSHAY on 20/04/2018.
 */
public class Loginpage {

    WebDriver driver;

    @FindBy(xpath = ".//*[@id='imglogo']")
    WebElement BBPLOGO;

    @FindBy(xpath = ".//*[@id='txtLN']")
    WebElement LoginNm;


    @FindBy(xpath = ".//*[@id='txtPW']")
    WebElement LoginPass;


    @FindBy(xpath = ".//*[@id='btnLog']")
    WebElement Submit;

    public Loginpage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
        if(!BBPLOGO.isDisplayed())
            throw  new IllegalStateException("This is not login page");
    }

    public void setLoginNm(String loginNm)
    {
        LoginNm.sendKeys(loginNm);
    }

    public void setLoginPass(String loginPass)
    {
        LoginPass.sendKeys(loginPass);
    }

    public void  ClickSubmit()
    {
      Submit.click();
    }
}
