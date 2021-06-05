package cucuTest.stepDefinitions;

import cucuTest.pages.CucuPage;
import cucuTest.utilities.ConfigurationReader;
import cucuTest.utilities.Driver;
import io.cucumber.java.en.Given;

public class UIStepDefitions {
    private CucuPage cucuPage;

    public UIStepDefitions(CucuPage cucuPage){
        this.cucuPage = cucuPage;
    }

    @Given("test step")
    public void test_step() {
        Driver.get().get(ConfigurationReader.get("url"));
        cucuPage.productButton.click();
    }

}
