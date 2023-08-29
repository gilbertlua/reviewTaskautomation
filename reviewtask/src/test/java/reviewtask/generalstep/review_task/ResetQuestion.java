package reviewtask.generalstep.review_task;

import static org.junit.jupiter.api.Assertions.assertFalse;

import reviewtask.generalfunctions.GeneralAction;
import reviewtask.generalfunctions.SupportFunction;

public class ResetQuestion {
    public static void RunResetQuestion(){
        GeneralAction.ResetAllQuestion(".btn-outline-danger");
    }
    public static void  ValidateSubmit(){
        boolean check = SupportFunction.WaitElementVisible("#root > div.bodyContent > div > div > div.mb-4.card > div > h3 > b");
        assertFalse(check);
    } 
}
