package team_member.loginstep;

import org.openqa.selenium.WebDriver;

import team_member.driverfactory.DriverFactory;
import team_member.generalfunctions.GeneralAction;
import team_member.generalfunctions.SupportFunction;

public class LogoutStep {
    static WebDriver _driver = DriverFactory.GetDriver();
    
    public static void  press_the_ess_logout_button(){
        
        SupportFunction.WaitElementVisible("#root > div.header > div:nth-child(3) > div:nth-child(2) > button");
        GeneralAction.Click("#root > div.header > div:nth-child(3) > div:nth-child(2) > button");
    }
    public static void confirm_by_send_enter(){
        GeneralAction.SendEnterAlert();
    }
}
