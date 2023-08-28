package reviewtask.generalfunctions;


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
    public static void WaitPageLoaded(){
        
    }
}
