package env;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverUtil {
   protected static WebDriver _driver = null;
   public static WebDriver DefaultDriver(){
    if(_driver !=null){
        return _driver;
    }
    WebDriver driver = new ChromeDriver();
    return driver;
   }
}
