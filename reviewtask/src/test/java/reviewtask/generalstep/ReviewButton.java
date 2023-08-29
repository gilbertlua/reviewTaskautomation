package reviewtask.generalstep;

import org.openqa.selenium.WebDriver;

import reviewtask.driverfactory.DriverFactory;
import reviewtask.generalfunctions.GeneralAction;
import reviewtask.generalfunctions.SupportFunction;
import reviewtask.softassert.SoftAssert;

public class ReviewButton {
    WebDriver _driver = DriverFactory.GetDriver();
       
    public static void ClickReview() {
        SupportFunction.TimeDelay(1000);
        GeneralAction.Click("#fmlx-table--row-0 > td:nth-child(10) > button");
    }
    public static void ReviewClicked() {
        String actual = GeneralAction.GetValue("#root > div.header > div.title");
        String expected = "Review Task";   
        SoftAssert.StringCompare(expected, actual);
    }
}

// span > span:nth-child(1)
// .ratingDotPoin > span:nth-child(9)