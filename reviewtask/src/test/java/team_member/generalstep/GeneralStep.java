package team_member.generalstep;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import team_member.driverfactory.DriverFactory;
import team_member.generalstep.consolidation_review.Consolidation_LoadPage;
import team_member.generalstep.consolidation_review.Consolidation_ViewConsolidation;
import team_member.generalstep.review_result.ReviewResult_LoadPage;
import team_member.generalstep.review_result.ReviewResult_SelectPeriod;
import team_member.generalstep.review_result.ReviewResult_ViewButton;
import team_member.generalstep.review_task.ReviewTask_FillQuestion;
import team_member.generalstep.review_task.ReviewTask_LoadPage;
import team_member.generalstep.review_task.ReviewTask_ResetQuestion;
import team_member.generalstep.review_task.ReviewTask_ReviewButton;
import team_member.generalstep.review_task.ReviewTask_SelectPeriod;

public class GeneralStep {
        WebDriverWait driverWait;
        WebDriver _driver = DriverFactory.GetDriver();
        
          // load review task page
        @When("load to review task page")
        public void load_to_review_task_page() {
            ReviewTask_LoadPage.LoadReviewPage();
        }
        @Then("the review task page loaded")
        public void the_review_task_page_loaded() {        
            ReviewTask_LoadPage.ReviewPageLoaded();
        }

        // select desired period
        @And("select the period")
        public void select_the_period() {        
            ReviewTask_SelectPeriod.SelectThePeriod();
        }   
        @Then("the select period can be selected")
        public void the_select_period_can_be_selected() {
            ReviewTask_SelectPeriod.PeriodSelected();
        }
    
        // click review button
        @When("click the review button")
        public void click_the_review_button() {
            ReviewTask_ReviewButton.ClickReview();
        }
        @Then("review button can be clicked and review page is loaded")
        public void review_button_can_be_clicked_and_review_page_is_loaded() {
            ReviewTask_ReviewButton.ReviewClicked();
        }
    
        // fill all questions
        @When("fill score question")
        public void fill_score_question() {
            ReviewTask_FillQuestion.FillScoreQuestions();
        }
        @When("fill essay question {string}")
        public void fill_essay_question(String string) {
            ReviewTask_FillQuestion.FillEssaiQuestions(string);
        }
        @When("click next button")
        public void click_next_button() {
            ReviewTask_FillQuestion.NextButtonFirst();
        }
        @When("click submit button")
        public void click_submit_button(){
            ReviewTask_FillQuestion.SubmitButton();
        }
        @Then("success fill all question")
        public void success_fill_all_question(){
            ReviewTask_FillQuestion.SuccessFillQuestion();
            ReviewTask_FillQuestion.BackToReviewTask();
            ReviewTask_SelectPeriod.SelectThePeriod();
            ReviewTask_FillQuestion.CheckDone();
        }
    
        // reset question test
        @When("reset all resettable questions")
        public void reset_all_resettable_questions() {
            ReviewTask_ResetQuestion.RunResetQuestion();
        }
        @When("validate submit")
        public void validate_submit(){
            ReviewTask_LoadPage.LoadReviewPage();
        }

        // load review result
        @When("load to review result page")
        public void load_to_review_result_page() {
            ReviewResult_LoadPage.LoadReviewPage();
        }
        @Then("the review result page loaded")
        public void the_review_result_page_loaded() {
            ReviewResult_LoadPage.ReviewPageLoaded();
        }

        // select desired period in review result
        @When("select the period in review result")
        public void select_the_period_in_review_result() {
            ReviewResult_SelectPeriod.SelectThePeriod();
        }
        @Then("the select period can be selected in review result")
        public void the_select_period_can_be_selected_in_review_result() {
            ReviewResult_SelectPeriod.PeriodSelected();
        }

        // click view button
        @When("click the view button")
        public void click_the_view_button() {
            ReviewResult_ViewButton.ClickView();
        }
        @Then("view button can be clicked and view page is loaded")
        public void view_button_can_be_clicked_and_view_page_is_loaded() {
            ReviewResult_ViewButton.ViewClicked();
        }

        // consolidation review
        @When("load to consolidation page") 
	    public void load_to_consolidation_page(){
            Consolidation_LoadPage.LoadConsolidationPage();
        }
        @Then("the consolidation page loaded")
        public void the_consolidation_page_loaded(){
            Consolidation_LoadPage.ConsolidationPageLoaded();
        }  
        // check if have consolidation review then click view button
        @And ("is have consolidated review then click the view button")
        public void is_have_consolidated_review_then_click_the_view_button(){
            Boolean check = Consolidation_ViewConsolidation.IsHaveConsolidation();
            if(check){
                Consolidation_ViewConsolidation.ViewConsolidation();
            }
            else{
                Consolidation_LoadPage.LoadConsolidationPage();
            }
        }
        // check if have consolidation review then generate pdf file
        @And("is have consolidated review then generate pdf file")
        public void is_have_consolidated_review_then_generate_pdf_file()
        {
            Boolean check = Consolidation_ViewConsolidation.IsHaveConsolidation();
            if(check){
                Consolidation_ViewConsolidation.GeneratePdfFile();
            }
            else{
                Consolidation_LoadPage.LoadConsolidationPage();
            }
        }



      
        
    }
