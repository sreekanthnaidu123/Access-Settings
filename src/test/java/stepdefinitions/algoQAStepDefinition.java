package stepdefinitions;
    import io.cucumber.java.en.*;
    import workflows.SeleniumWorkFlow;
    import org.junit.Assert;
    import common.Assertion;
    import common.WebBrowserUtil;
    public class algoQAStepDefinition
	{
        SeleniumWorkFlow workFlow = new SeleniumWorkFlow();
        

            @When("^I click if visible React tour Skip button in algoqa$")			
            public void WhenIClickIfVisibleReactTourSkipButtonInAlgoqa()
            {
                workFlow.clickIfVisible(0,"algoQA","algoQA.ReacttourSkipbuttonButtonXPATH","XPATH");
                
            }
    }