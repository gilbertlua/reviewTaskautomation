package team_member.hooks;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import team_member.driverfactory.DriverFactory;
import team_member.generalfunctions.SupportFunction;
import team_member.loginstep.LogoutStep;

public class Hooks {
    static DriverFactory _driverFactory;
    static WebDriver _driver;
    static private String _url = "https://essdummy.formulatrix.com/";

    @BeforeAll
    public static void before_all(){
        _driver = DriverFactory.GetDriver(); 
        _driver.manage().window().maximize();
        _driver.get(_url);

    } 
    @AfterAll
    public static void after_all(){
        LogoutStep.press_the_ess_logout_button();
        LogoutStep.confirm_by_send_enter();
        SupportFunction.TimeDelay(1000);
        _driver.get(_url);
        SupportFunction.WaitElementVisible("#root > div > div > div.card-header.text-white > h2");
        SupportFunction.TimeDelay(1000);
        TearDown();
    }
    public static void TearDown(){
        try {
            _driver.close();    
        } catch (Exception e) {
            // TODO: handle exception
        }
        
    }
}
