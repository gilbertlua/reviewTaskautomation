package team_member.generalstep.review_result;


import org.openqa.selenium.WebDriver;

import team_member.driverfactory.DriverFactory;
import team_member.generalfunctions.GeneralAction;
import team_member.generalfunctions.SupportFunction;
import team_member.softassert.SoftAssert;

public class ReviewResult_ViewButton {
    WebDriver _driver = DriverFactory.GetDriver();
       
    public static void ClickView() {
        SupportFunction.WaitElementVisible("#root > div.bodyContent > div > div:nth-child(2) > table > tbody > tr:nth-child(1) > td:nth-child(6) > button");
        GeneralAction.Click("#root > div.bodyContent > div > div:nth-child(2) > table > tbody > tr:nth-child(1) > td:nth-child(6) > button");
    }
    public static void ViewClicked() {
        String actual = GeneralAction.GetValue("#root > div.header > div.title");
        String expected = "Review Detail";   
        SoftAssert.StringCompare(expected, actual);
        ReviewResult_LoadPage.LoadReviewPage();
    }
}

// span > span:nth-child(1)
// .ratingDotPoin > span:nth-child(9)