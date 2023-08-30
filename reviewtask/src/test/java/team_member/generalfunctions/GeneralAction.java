package team_member.generalfunctions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class GeneralAction extends BaseGeneralFunction{
    public static void Click(String element){
        _driver.findElement(By.cssSelector(element)).click();
    }     
    public static void SendKey(String element, String key){
        _driver.findElement(By.cssSelector(element)).sendKeys(Keys.CONTROL,"a");
        _driver.findElement(By.cssSelector(element)).sendKeys(key);
    }
    public static void ClickMenuBar(){
        _driver.findElement(By.cssSelector("#root > div.header > a > svg")).click();
    }
    public static void SendEnter(){
        _driver.switchTo().activeElement().sendKeys(Keys.ENTER);
    }
    public static void ButtonArrow(int arrow,String element){
        switch(arrow){
            case 1:
                    _driver.findElement(By.cssSelector(element)).sendKeys(Keys.ARROW_DOWN);
                    break;
            case 2:
                    _driver.findElement(By.cssSelector(element)).sendKeys(Keys.ARROW_LEFT);
                    break;
        }
    }


    // input
    public static String GetValue(String element){
        String value = _driver.findElement(By.cssSelector(element)).getText();
        return value;
    }
    public static String GetInputValue(String element){
        String value = _driver.findElement(By.cssSelector(element)).getAttribute("value");
        return value;
    }
    public static void FillAllQuestionScore(String elements){
        List<WebElement> list = _driver.findElements(By.cssSelector(elements));
        for(WebElement element:list){
            element.click();
        }
    }
    public static void FillAllQuestionEssay(String elements, String Keys){
        List<WebElement> list = _driver.findElements(By.cssSelector(elements));
        for(WebElement element:list){
            element.clear();
            element.sendKeys(Keys);
        }
    }
    public static void ResetAllQuestion(String elements){
        List<WebElement> list = _driver.findElements(By.cssSelector(elements));
        for(WebElement element:list){
            element.click();
        }
    }
    public static void ScrollDown(){
        JavascriptExecutor js = (JavascriptExecutor) _driver;
        js.executeScript("window.scrollBy(0,1000)");
    }
    public static void SendEnterAlert(){
        _driver.switchTo().alert().accept();
    }
}
