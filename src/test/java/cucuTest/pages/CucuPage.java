package cucuTest.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CucuPage extends BasePage{

    @FindBy(xpath = "(//input)[1]")
    public WebElement searchBar;

}