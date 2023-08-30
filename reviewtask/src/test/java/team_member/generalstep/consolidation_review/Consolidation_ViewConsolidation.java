package team_member.generalstep.consolidation_review;


import org.openqa.selenium.WebDriver;

import team_member.driverfactory.DriverFactory;
import team_member.generalfunctions.GeneralAction;
import team_member.generalfunctions.SupportFunction;

public class Consolidation_ViewConsolidation {
    WebDriver _driver = DriverFactory.GetDriver();    
    public static Boolean IsHaveConsolidation(){
        Boolean check = SupportFunction.WaitElementVisible("#root > div.bodyContent > div > div > table > tbody");
        if(check){
            return true;
        }
        return false;
    }     
    public static void ViewConsolidation(){
        GeneralAction.Click("#root > div.bodyContent > div > div > table > tbody > tr > td:nth-child(4) > button.btn.btn-primary");
        SupportFunction.TimeDelay(1000);
        GeneralAction.ScrollDown();
    }
    public static void GeneratePdfFile(){
        SupportFunction.WaitElementVisible("#root > div.bodyContent > div > div > table > tbody");
        String checkStatus = GeneralAction.GetValue("#root > div.bodyContent > div > div > table > tbody > tr > td:nth-child(3) > span");
        Boolean check = checkStatus.equals("Done & Locked");
        if(check){
            GeneralAction.Click("#root > div.bodyContent > div > div > table > tbody > tr > td:nth-child(4) > button.btn.btn-danger"); 
        }
    }
}
