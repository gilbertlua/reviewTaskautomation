package reviewtask.hooks;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.Before;
import reviewtask.driverfactory.DriverFactory;

public class Hooks {
    static DriverFactory _driverFactory;
    WebDriver _driver;
    private String _url = "https://essdummy.formulatrix.com/";

    @Before
    public void LaunchBrowser(){
        _driver = DriverFactory.GetDriver(); 
        _driver.manage().window().maximize();
        _driver.get(_url);

    } 
    public void TearDown(){
        try {
            _driver.close();    
        } catch (Exception e) {
            // TODO: handle exception
        }
        
    }
}
