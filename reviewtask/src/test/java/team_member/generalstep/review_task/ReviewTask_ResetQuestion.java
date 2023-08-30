package team_member.generalstep.review_task;

import static org.junit.jupiter.api.Assertions.assertFalse;

import team_member.generalfunctions.GeneralAction;
import team_member.generalfunctions.SupportFunction;

public class ReviewTask_ResetQuestion {
    public static void RunResetQuestion(){
        GeneralAction.ResetAllQuestion(".btn-outline-danger");
    }
    public static void  ValidateSubmit(){
        boolean check = SupportFunction.WaitElementVisible("#root > div.bodyContent > div > div > div.mb-4.card > div > h3 > b");
        assertFalse(check);
    } 
}
