package reviewtask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class LoginStep {
    private static WebDriver _driver;
    private static String _user;
    private static String _pass;
    private static String _curentTitle;

    public static Boolean SetUser(String user){
        if(user!=null){
            _user = user;
            return true;
        }
        return false;
    }
    public static Boolean SetPass(String pass){
        if(pass!=null){
            _pass = pass;
            return true;
        }
        return false;
    }
    public static Boolean SetDriver(WebDriver driver){
        if(driver!=null){
            _driver = driver;
            return true;
        }
        return false;
    }
    public static String GetTitle(){
        return  _curentTitle;
    }
    public static Boolean SetTitle(String title){
        if(title!=null){
            _curentTitle = title;        
            return true;
        }
        return false;
    }

    public static void Time(int time){
        try {
            Thread.sleep(time);
        }
        catch (InterruptedException e) {
            System.out.println("cant sleep");
        }
    }

    public static void LoginToPage(){
        _driver.findElement(By.cssSelector("#username")).sendKeys(_user);
        _driver.findElement(By.id("password")).sendKeys(_pass);
        _driver.findElement(By.className("mt-4")).click();
        Time(1000);   
        String title = _driver.findElement(By.cssSelector("#root > div.header > div.title")).getText();     
        SetTitle(title);
    }


    public static void LoadReviewPage(){
        _driver.findElement(By.cssSelector("#root > div.header > a > svg")).click();
        Time(1000);
        _driver.findElement(By.cssSelector("#root > nav > ul > li:nth-child(2) > a")).click();
        Time(1000);
        String title = _driver.findElement(By.cssSelector("#root > div.header > div.title")).getText();
        SetTitle(title);
    }
}
