package team_member.loginstep;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import team_member.driverfactory.DriverFactory;
import team_member.generalfunctions.GeneralAction;
import team_member.generalfunctions.SupportFunction;
import team_member.softassert.SoftAssert;


public class LoginStep {
    WebDriver _driver;
    @Given("Login to page {string} {string}")
    public void login_to_page(String string, String string2) {
        SupportFunction.WaitElementVisible("#username");
        _driver = DriverFactory.GetDriver();
        GeneralAction.SendKey("#username", string);
        GeneralAction.SendKey("#password", string2);
        GeneralAction.Click("#root > div > div > div.card-body.text-white > form > button");        
    }
    @Then("is success to dashboard page")
    public void is_success_to_dashboard_page() {
        SupportFunction.TimeDelay(1000);
        String actual = GeneralAction.GetValue("#root > div.header > div.title");
        String expected = "Dashboard";
        boolean check = SoftAssert.TitleCompare(expected, actual);
        assertTrue(check);
    }
}
