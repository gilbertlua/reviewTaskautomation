package reviewtask.generalstep;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import reviewtask.driverfactory.DriverFactory;
import reviewtask.generalfunctions.GeneralAction;
import reviewtask.generalfunctions.SupportFunction;
import reviewtask.softassert.SoftAssert;

public class GeneralStep {
    WebDriverWait driverWait;
    WebDriver _driver = DriverFactory.GetDriver();

    // load review task page
    @When("load to review task page")
    public void load_to_review_task_page() {
        SupportFunction.TimeDelay(1000);
        GeneralAction.ClickMenuBar();
        SupportFunction.TimeDelay(1000);
        GeneralAction.Click("#root > nav > ul > li:nth-child(2)");
    }
    @Then("the review task page loaded")
    public void the_review_task_page_loaded() {
        String actual = GeneralAction.GetValue("#root > div.header > div.title");
        String expected = "Review Task";        
        boolean check = SoftAssert.TitleCompare(expected,actual);
        assertTrue(check);
    }


    // select desired period
    @And("select the period")
    public void select_the_period() {        
        GeneralAction.Click("#mui-2");
        SupportFunction.TimeDelay(1000);
        GeneralAction.ButtonArrow(1, "#mui-2");
        GeneralAction.ButtonArrow(1, "#mui-2");
        SupportFunction.TimeDelay(1000);
        GeneralAction.SendEnter();
    }   
    
    @Then("the select period can be selected")
    public void the_select_period_can_be_selected() {
        String actual = GeneralAction.GetInputValue("#mui-2");
        String expected = "2023 - H2";
        Boolean check = SoftAssert.StringCompare(expected, actual);
        assertTrue(check);
    }

    // click review button
    @When("click the review button")
    public void click_the_review_button() {
        SupportFunction.TimeDelay(1000);
        GeneralAction.Click("#fmlx-table--row-0 > td:nth-child(10) > button");
    }
    @Then("review button can be clicked and review page is loaded")
    public void review_button_can_be_clicked_and_review_page_is_loaded() {
        String actual = GeneralAction.GetValue("#root > div.header > div.title");
        String expected = "Review Task";   
        SoftAssert.StringCompare(expected, actual);
    }

}
