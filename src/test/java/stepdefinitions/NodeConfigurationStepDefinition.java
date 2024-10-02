package stepdefinitions;
    import io.cucumber.java.en.*;
    import workflows.SeleniumWorkFlow;
    import org.junit.Assert;
    import common.Assertion;
    import common.WebBrowserUtil;
    public class NodeConfigurationStepDefinition
	{
        SeleniumWorkFlow workFlow = new SeleniumWorkFlow();
        

            @When("^I checked Select All Controls to Delete or Move in node configuration$")			
            public void WhenICheckedSelectAllControlsToDeleteOrMoveInNodeConfiguration()
            {
                workFlow.checkCheckbox(0,"Node Configuration","Node Configuration.SelectAllControlstoDeleteorMoveCheckBoxXPATH","XPATH");
                
            }

            @When("^I selected Select All Controls button in node configuration$")			
            public void WhenISelectedSelectAllControlsButtonInNodeConfiguration()
            {
                workFlow.clickedElement(0,"Node Configuration","Node Configuration.SelectAllControlsbuttonButtonXPATH","XPATH");
                
            }

             @Then("^verify displayed Do you want to Enable All Controls in node configuration$")			
            public void ThenVerifyDisplayedDoYouWantToEnableAllControlsInNodeConfiguration()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"Node Configuration","Node Configuration.DoyouwanttoEnableAllControlsLabelXPATH","XPATH"), "Then verify displayed Do you want to Enable All Controls in node configuration");
                WebBrowserUtil.captureScreenshot();
                
            }

            @When("^I selected Select All Controls button Yes in node configuration$")			
            public void WhenISelectedSelectAllControlsButtonYesInNodeConfiguration()
            {
                workFlow.clickedElement(0,"Node Configuration","Node Configuration.SelectAllControlsbuttonYesButtonXPATH","XPATH");
                
            }

             @Then("^verify displayed Enable All Controls popup in node configuration$")			
            public void ThenVerifyDisplayedEnableAllControlsPopupInNodeConfiguration()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"Node Configuration","Node Configuration.EnableAllControlspopupTextBoxXPATH","XPATH"), "Then verify displayed Enable All Controls popup in node configuration");
                WebBrowserUtil.captureScreenshot();
                
            }
    }