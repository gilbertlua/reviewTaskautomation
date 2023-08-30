package team_member.generalfunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SupportFunction extends BaseGeneralFunction{
    
    public static String GetTitle(){
        String title = _driver.getTitle();
        return title;    
    }
    public static void TimeDelay(int time){
        try {
            Thread.sleep(time);
        } catch (Exception e) {
            
        }
    }
    public static Boolean WaitElementVisible(String element){
        try {
            WebDriverWait wait = new WebDriverWait(_driver, java.time.Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(element)));
            return true;    
        } catch (Exception e) {
            return false;
        }
    }
}
