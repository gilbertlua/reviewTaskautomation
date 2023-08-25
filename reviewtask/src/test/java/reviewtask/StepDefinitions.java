package reviewtask;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import env.DriverUtil;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StepDefinitions {
    protected WebDriver _driver = DriverUtil.DefaultDriver();
    

    @Given("load login page")
    public void loadLoginStep_page() {
        _driver.get("https://essdummy.formulatrix.com/review/Login");
        LoginStep.SetDriver(_driver);     
    }   
    @When("login using {string} and {string}")
    public void login_using_and(String string, String string2) {
        LoginStep.SetUser(string);
        LoginStep.SetPass(string2);
        LoginStep.LoginToPage();        
    }
    @Then("dasboard page loaded")
    public void dasboard_page_loaded() {
        Object expectedTitle = "Dashboard";
        Object actualTitle = LoginStep.GetTitle();
        assertEquals(expectedTitle,actualTitle);
    }

    @When("Load to review task page")
    public void load_to_review_task_page() {
        LoginStep.LoadReviewPage();
    }
    @Then("review task page can be loaded")
    public void review_task_page_can_be_loaded() {
        
    }
}
