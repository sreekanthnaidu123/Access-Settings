package stepdefinitions;
    import io.cucumber.java.en.*;
    import workflows.SeleniumWorkFlow;
    import org.junit.Assert;
    import common.Assertion;
    import common.WebBrowserUtil;
    public class CurrentScreenStepDefinition
	{
        SeleniumWorkFlow workFlow = new SeleniumWorkFlow();
        

            @When("^I disabledElement Move Control Send is restricted in node configuration$")			
            public void WhenIDisabledelementMoveControlSendIsRestrictedInNodeConfiguration()
            {
                workFlow.WhenIDisabledelementMoveControlSendIsRestrictedInNodeConfiguration(0,"Current Screen","Current Screen.MoveControlSendisrestrictedButtonXPATH","XPATH");
                
            }
    }