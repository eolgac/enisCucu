package cucuTest.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CucuPage extends BasePage{

    @FindBy(xpath = "//h4[.='Product']")
    public WebElement productButton;

}
