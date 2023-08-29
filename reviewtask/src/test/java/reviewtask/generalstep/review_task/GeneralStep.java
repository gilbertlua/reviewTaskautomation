    package reviewtask.generalstep.review_task;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.support.ui.WebDriverWait;

    import io.cucumber.java.en.And;
    import io.cucumber.java.en.Then;
    import io.cucumber.java.en.When;
    import reviewtask.driverfactory.DriverFactory;

    public class GeneralStep {
        WebDriverWait driverWait;
        WebDriver _driver = DriverFactory.GetDriver();
    
        // load review task page
        @When("load to review task page")
        public void load_to_review_task_page() {
            LoadPage.LoadReviewPage();
        }
        @Then("the review task page loaded")
        public void the_review_task_page_loaded() {        
            LoadPage.ReviewPageLoaded();
        }
    
    
        // select desired period
        @And("select the period")
        public void select_the_period() {        
            SelectPeriod.SelectThePeriod();
        }   
        @Then("the select period can be selected")
        public void the_select_period_can_be_selected() {
            SelectPeriod.PeriodSelected();
        }
    
        // click review button
        @When("click the review button")
        public void click_the_review_button() {
            ReviewButton.ClickReview();
        }
        @Then("review button can be clicked and review page is loaded")
        public void review_button_can_be_clicked_and_review_page_is_loaded() {
            ReviewButton.ReviewClicked();
        }
    
        // fill all questions
        @When("fill score question")
        public void fill_score_question() {
            FillQuestion.FillScoreQuestions();
        }
        @When("fill essay question {string}")
        public void fill_essay_question(String string) {
            FillQuestion.FillEssaiQuestions(string);
        }
        @When("click next button")
        public void click_next_button() {
            FillQuestion.NextButtonFirst();
        }
        @When("click submit button")
        public void click_submit_button(){
            FillQuestion.SubmitButton();
        }
        @Then("success fill all question")
        public void success_fill_all_question(){
            FillQuestion.SuccessFillQuestion();
            FillQuestion.BackToReviewTask();
            SelectPeriod.SelectThePeriod();
            FillQuestion.CheckDone();
        }
    
        // reset question test
        @When("reset all resettable questions")
        public void reset_all_resettable_questions() {
            ResetQuestion.RunResetQuestion();
        }
        @When("validate submit")
        public void validate_submit(){
            ResetQuestion.ValidateSubmit();
            LoadPage.LoadReviewPage();
        }
        
    }
