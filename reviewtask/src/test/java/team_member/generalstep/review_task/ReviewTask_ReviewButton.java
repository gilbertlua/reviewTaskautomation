package team_member.generalstep.review_task;

import org.openqa.selenium.WebDriver;

import team_member.driverfactory.DriverFactory;
import team_member.generalfunctions.GeneralAction;
import team_member.generalfunctions.SupportFunction;
import team_member.softassert.SoftAssert;

public class ReviewTask_ReviewButton {
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