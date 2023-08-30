package team_member.generalstep.review_task;

import org.openqa.selenium.WebDriver;

import team_member.driverfactory.DriverFactory;
import team_member.generalfunctions.GeneralAction;
import team_member.generalfunctions.SupportFunction;
import team_member.softassert.SoftAssert;


public class ReviewTask_FillQuestion {
    static WebDriver _driver = DriverFactory.GetDriver();
    public static void FillScoreQuestions(){
        // .ratingDotPoin > span:nth-child(7)
        SupportFunction.WaitElementVisible(".ratingDotPoin > span:nth-child(4) > svg > circle");
        GeneralAction.FillAllQuestionScore(".ratingDotPoin > span:nth-child(4) > svg > circle");
    }
    public static void FillEssaiQuestions(String keys){
        // #floatingTextarea2
        SupportFunction.WaitElementVisible("#floatingTextarea2");
        GeneralAction.FillAllQuestionEssay("#floatingTextarea2", keys);
    }
    public static void NextButtonFirst(){
        SupportFunction.TimeDelay(1000);
        SupportFunction.WaitElementVisible("#root > div.bodyContent > div > div > div:nth-child(2) > button");
        GeneralAction.Click("#root > div.bodyContent > div > div > div:nth-child(2) > button");
    }
    public static void SubmitButton(){
        SupportFunction.TimeDelay(1000);
        SupportFunction.WaitElementVisible("#root > div.bodyContent > div > div > div:nth-child(2) > button.btn.btn-primary.btn-md");
        GeneralAction.Click("#root > div.bodyContent > div > div > div:nth-child(2) > button.btn.btn-primary.btn-md");
    }
    public static void SuccessFillQuestion(){
        SupportFunction.TimeDelay(1000);
        SupportFunction.WaitElementVisible("#root > div.bodyContent > div > div > div.mb-4.card > div > h3 > b");
        String actual = GeneralAction.GetValue("#root > div.bodyContent > div > div > div.mb-4.card > div > h3 > b");
        String expected = "You are the best!";
        SoftAssert.StringCompare(expected, actual);
    }
    public static void BackToReviewTask(){
        GeneralAction.Click("#root > div.bodyContent > div > div > div.mb-4.card > div > button");
    }
    public static void CheckDone(){
        SupportFunction.WaitElementVisible("#fmlx-table--row-0 > td:nth-child(9) > span");
        String actual = GeneralAction.GetValue("#fmlx-table--row-0 > td:nth-child(9) > span");
        String expected = "Done";
        SoftAssert.StringCompare(expected, actual);

    }
}
