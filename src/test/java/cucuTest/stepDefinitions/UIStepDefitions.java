package cucuTest.stepDefinitions;

import cucuTest.pages.CucuPage;
import cucuTest.utilities.ConfigurationReader;
import cucuTest.utilities.Driver;
import io.cucumber.java.en.Given;
import org.openqa.selenium.Keys;

public class UIStepDefitions {
    private CucuPage cucuPage;

    public UIStepDefitions(CucuPage cucuPage){
        this.cucuPage = cucuPage;
    }

    @Given("test step")
    public void test_step() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @Given("type {string} and push enter in search bar")
    public void type_and_push_enter_in_search_bar(String text) {
        cucuPage.searchBar.sendKeys(text+ Keys.ENTER);
    }
}
