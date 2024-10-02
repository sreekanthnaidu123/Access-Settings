package stepdefinitions;
    import io.cucumber.java.en.*;
    import workflows.SeleniumWorkFlow;
    import org.junit.Assert;
    import common.Assertion;
    import common.WebBrowserUtil;
    public class AlgoShackStepDefinition
	{
        SeleniumWorkFlow workFlow = new SeleniumWorkFlow();
        

            @When("^I clicked SignIn link in sign in$")			
            public void WhenIClickedSigninLinkInSignIn()
            {
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.SignInlinkButtonXPATH","XPATH");
                
            }

             @Then("^verify displayed Login to algoQA in sign in$")			
            public void ThenVerifyDisplayedLoginToAlgoqaInSignIn()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"AlgoShack","AlgoShack.LogintoalgoQALabelXPATH","XPATH"), "Then verify displayed Login to algoQA in sign in");
                WebBrowserUtil.captureScreenshot();
                
            }

            @When("^I entered Email Address in sign in as '(.*)'$")			
            public void WhenIEnteredEmailAddressInSignInAsemailAddress(String  _emailAddress)
            {
                workFlow.enterText(_emailAddress,0,"AlgoShack","AlgoShack.EmailAddressTextBoxXPATH","XPATH");
                
            }

            @When("^I entered Password in sign in as '(.*)'$")			
            public void WhenIEnteredPasswordInSignInAspassword(String  _password)
            {
                workFlow.enterText(_password,0,"AlgoShack","AlgoShack.PasswordTextBoxXPATH","XPATH");
                
            }

            @When("^I clicked LogIn Button in sign in$")			
            public void WhenIClickedLoginButtonInSignIn()
            {
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.LogInButtonButtonXPATH","XPATH");
                
            }

             @Then("^verify content User Signed In Successfully in sign in as '(.*)'$")			
            public void ThenVerifyContentUserSignedInSuccessfullyInSignInAsuserSignedInSuccessfully(String  _userSignedInSuccessfully)
            {
                Assertion.IsTrue(workFlow.verifyContentTextBox(_userSignedInSuccessfully,0,"AlgoShack","AlgoShack.UserSignedInSuccessfullyTextBoxXPATH","XPATH"), "Then verify content User Signed In Successfully in sign in as '<User Signed In Successfully>'");
      WebBrowserUtil.captureScreenshot();
                
            }

            @When("^I click if visible Sign In Popup Close in sign in$")			
            public void WhenIClickIfVisibleSignInPopupCloseInSignIn()
            {
                workFlow.clickIfVisible(0,"AlgoShack","AlgoShack.SignInPopupCloseButtonXPATH","XPATH");
                
            }

             @Then("^verify displayed Dashboard Page in home page$")			
            public void ThenVerifyDisplayedDashboardPageInHomePage()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"AlgoShack","AlgoShack.DashboardPageLabelXPATH","XPATH"), "Then verify displayed Dashboard Page in home page");
                WebBrowserUtil.captureScreenshot();
                
            }

            @When("^I wait for control visible My Profile in home page$")			
            public void WhenIWaitForControlVisibleMyProfileInHomePage()
            {
                workFlow.waitForControlVisible(0,"AlgoShack","AlgoShack.MyProfileButtonXPATH","XPATH");
                
            }

            @When("^I selected algoQA in home page$")			
            public void WhenISelectedAlgoqaInHomePage()
            {
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.algoQAButtonXPATH","XPATH");
                
            }

            @When("^I wait for control visible Project Explorer Label in project explorer$")			
            public void WhenIWaitForControlVisibleProjectExplorerLabelInProjectExplorer()
            {
                workFlow.waitForControlVisible(0,"AlgoShack","AlgoShack.ProjectExplorerLabelButtonXPATH","XPATH");
                
            }

            @When("^I click if visible Search The project in Project explorer Close Icon in project explorer$")			
            public void WhenIClickIfVisibleSearchTheProjectInProjectExplorerCloseIconInProjectExplorer()
            {
                workFlow.clickIfVisible(0,"AlgoShack","AlgoShack.SearchTheprojectinProjectexplorerCloseIconButtonXPATH","XPATH");
                
            }

             @Then("^verify displayed Project Explorer Label in project explorer$")			
            public void ThenVerifyDisplayedProjectExplorerLabelInProjectExplorer()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"AlgoShack","AlgoShack.ProjectExplorerLabelButtonXPATH","XPATH"), "Then verify displayed Project Explorer Label in project explorer");
                WebBrowserUtil.captureScreenshot();
                
            }

            @When("^I entered Project name in create project as '(.*)'$")			
            public void WhenIEnteredProjectNameInCreateProjectAsprojectName1(String  _projectName1)
            {
                workFlow.enterText(_projectName1,0,"AlgoShack","AlgoShack.ProjectnameTextBoxXPATH","XPATH");
                
            }

            @When("^I copied text Project name in create project$")			
            public void WhenICopiedTextProjectNameInCreateProject()
            {
                workFlow.copiedtext(0,"AlgoShack","AlgoShack.ProjectnameTextBoxXPATH","XPATH");
                
            }

            @When("^I selected Create in create project$")			
            public void WhenISelectedCreateInCreateProject()
            {
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.CreateButtonXPATH","XPATH");
                
            }

             @Then("^verify content Project created successfully popup in create project as '(.*)'$")			
            public void ThenVerifyContentProjectCreatedSuccessfullyPopupInCreateProjectAsprojectCreatedSuccessfullyPopup(String  _projectCreatedSuccessfullyPopup)
            {
                Assertion.IsTrue(workFlow.verifyContentTextBox(_projectCreatedSuccessfullyPopup,0,"AlgoShack","AlgoShack.ProjectcreatedsuccessfullypopupTextBoxXPATH","XPATH"), "Then verify content Project created successfully popup in create project as '<Project created successfully popup>'");
      WebBrowserUtil.captureScreenshot();
                
            }

            @When("^I wait in seconds for sometime in project explorer as '(.*)'$")			
            public void WhenIWaitInSecondsForSometimeInProjectExplorerAsforSometime2(String  _forSometime2)
            {
                workFlow.waitInSeconds(_forSometime2,0,"AlgoShack","AlgoShack.forsometimeTextBoxXPATH","XPATH");
                
            }

             @Then("^verify displayed Canvas Page in canvas$")			
            public void ThenVerifyDisplayedCanvasPageInCanvas()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"AlgoShack","AlgoShack.CanvasPageButtonXPATH","XPATH"), "Then verify displayed Canvas Page in canvas");
                WebBrowserUtil.captureScreenshot();
                
            }

            @When("^I drag and drop horizontally In Node in node configuration$")			
            public void WhenIDragDropHorizontallyInNodeInNodeConfiguration()
            {
                workFlow.dragAndDropHorizontally(0,"AlgoShack","AlgoShack.InNodeButtonXPATH","XPATH");
                
            }

            @When("^I selected New Node in node configuration$")			
            public void WhenISelectedNewNodeInNodeConfiguration()
            {
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.NewNodeButtonXPATH","XPATH");
                
            }

            @When("^I selected Node Edit in node configuration$")			
            public void WhenISelectedNodeEditInNodeConfiguration()
            {
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.NodeEditButtonXPATH","XPATH");
                
            }

            @When("^I selected Node Configuration OK in node configuration$")			
            public void WhenISelectedNodeConfigurationOkInNodeConfiguration()
            {
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.NodeConfigurationOKButtonXPATH","XPATH");
                
            }

            @When("^I ClickOnceVisible Displays control list panel in node configuration$")			
            public void WhenIClickoncevisibleDisplaysControlListPanelInNodeConfiguration()
            {
                workFlow.WhenIClickoncevisibleDisplaysControlListPanelInNodeConfiguration(0,"AlgoShack","AlgoShack.DisplayscontrollistpanelButtonXPATH","XPATH");
                
            }

            @When("^I clear and enter text Control Name in node configuration as '(.*)'$")			
            public void WhenIClearEnterTextControlNameInNodeConfigurationAscontrolName3(String  _controlName3)
            {
                workFlow.clearAndEnterText(_controlName3,0,"AlgoShack","AlgoShack.ControlNameTextBoxXPATH","XPATH");
                
            }

            @When("^I selected Add New Control in node configuration$")			
            public void WhenISelectedAddNewControlInNodeConfiguration()
            {
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.AddNewControlButtonXPATH","XPATH");
                
            }

            @When("^I clear and enter text Control Name2 in node configuration as '(.*)'$")			
            public void WhenIClearEnterTextControlName2InNodeConfigurationAscontrolName24(String  _controlName24)
            {
                workFlow.clearAndEnterText(_controlName24,0,"AlgoShack","AlgoShack.ControlName2TextBoxXPATH","XPATH");
                
            }

            @When("^I selected Select or deselect Multiple Control in node configuration$")			
            public void WhenISelectedSelectOrDeselectMultipleControlInNodeConfiguration()
            {
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.SelectordeselectMultipleControlButtonXPATH","XPATH");
                
            }

            @When("^I selected Delete Selected Control in node configuration$")			
            public void WhenISelectedDeleteSelectedControlInNodeConfiguration()
            {
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.DeleteSelectedControlButtonXPATH","XPATH");
                
            }

             @Then("^verify displayed No Controls Found in node configuration$")			
            public void ThenVerifyDisplayedNoControlsFoundInNodeConfiguration()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"AlgoShack","AlgoShack.NoControlsFoundLabelXPATH","XPATH"), "Then verify displayed No Controls Found in node configuration");
                WebBrowserUtil.captureScreenshot();
                
            }

            @When("^I disabledElement Control Name Save is restricted in node configuration$")			
            public void WhenIDisabledelementControlNameSaveIsRestrictedInNodeConfiguration()
            {
                workFlow.WhenIDisabledelementControlNameSaveIsRestrictedInNodeConfiguration(0,"AlgoShack","AlgoShack.ControlNameSaveisrestrictedButtonXPATH","XPATH");
                
            }

            @When("^I selected Control Name Cancel in node configuration$")			
            public void WhenISelectedControlNameCancelInNodeConfiguration()
            {
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.ControlNameCancelButtonXPATH","XPATH");
                
            }

            @When("^I selected Displays control list panel in node configuration$")			
            public void WhenISelectedDisplaysControlListPanelInNodeConfiguration()
            {
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.DisplayscontrollistpanelButtonXPATH","XPATH");
                
            }

            @When("^I copied text Control Name in node configuration$")			
            public void WhenICopiedTextControlNameInNodeConfiguration()
            {
                workFlow.copiedtext(0,"AlgoShack","AlgoShack.ControlNameTextBoxXPATH","XPATH");
                
            }

            @When("^I copied text Control Name2 in node configuration$")			
            public void WhenICopiedTextControlName2InNodeConfiguration()
            {
                workFlow.copiedtext(0,"AlgoShack","AlgoShack.ControlName2TextBoxXPATH","XPATH");
                
            }

            @When("^I selected Control Name Save in node configuration$")			
            public void WhenISelectedControlNameSaveInNodeConfiguration()
            {
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.ControlNameSaveButtonXPATH","XPATH");
                
            }

             @Then("^verify content Successfully Updated Controls popup in node configuration as '(.*)'$")			
            public void ThenVerifyContentSuccessfullyUpdatedControlsPopupInNodeConfigurationAssuccessfullyUpdatedControlsPopup(String  _successfullyUpdatedControlsPopup)
            {
                Assertion.IsTrue(workFlow.verifyContentTextBox(_successfullyUpdatedControlsPopup,0,"AlgoShack","AlgoShack.SuccessfullyUpdatedControlspopupTextBoxXPATH","XPATH"), "Then verify content Successfully Updated Controls popup in node configuration as '<Successfully Updated Controls popup>'");
      WebBrowserUtil.captureScreenshot();
                
            }

            @When("^I selected Add Features in node configuration$")			
            public void WhenISelectedAddFeaturesInNodeConfiguration()
            {
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.AddFeaturesButtonXPATH","XPATH");
                
            }

            @When("^I checked Select All Controls for Delete or Move in node configuration$")			
            public void WhenICheckedSelectAllControlsForDeleteOrMoveInNodeConfiguration()
            {
                workFlow.checkCheckbox(0,"AlgoShack","AlgoShack.SelectAllControlsforDeleteorMoveCheckBoxXPATH","XPATH");
                
            }

            @When("^I selected Move Selected Control in node configuration$")			
            public void WhenISelectedMoveSelectedControlInNodeConfiguration()
            {
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.MoveSelectedControlButtonXPATH","XPATH");
                
            }

             @Then("^verify displayed Move Control Page in node configuration$")			
            public void ThenVerifyDisplayedMoveControlPageInNodeConfiguration()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"AlgoShack","AlgoShack.MoveControlPageButtonXPATH","XPATH"), "Then verify displayed Move Control Page in node configuration");
                WebBrowserUtil.captureScreenshot();
                
            }

             @Then("^verify displayed Move Control label in node configuration$")			
            public void ThenVerifyDisplayedMoveControlLabelInNodeConfiguration()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"AlgoShack","AlgoShack.MoveControllabelLabelXPATH","XPATH"), "Then verify displayed Move Control label in node configuration");
                WebBrowserUtil.captureScreenshot();
                
            }

             @Then("^verify displayed Move Control Feature1 in node configuration$")			
            public void ThenVerifyDisplayedMoveControlFeature1InNodeConfiguration()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"AlgoShack","AlgoShack.MoveControlFeature1ButtonXPATH","XPATH"), "Then verify displayed Move Control Feature1 in node configuration");
                WebBrowserUtil.captureScreenshot();
                
            }

             @Then("^verify displayed Move Control Feature2 in node configuration$")			
            public void ThenVerifyDisplayedMoveControlFeature2InNodeConfiguration()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"AlgoShack","AlgoShack.MoveControlFeature2ButtonXPATH","XPATH"), "Then verify displayed Move Control Feature2 in node configuration");
                WebBrowserUtil.captureScreenshot();
                
            }

             @Then("^verify displayed Move Control Close in node configuration$")			
            public void ThenVerifyDisplayedMoveControlCloseInNodeConfiguration()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"AlgoShack","AlgoShack.MoveControlCloseButtonXPATH","XPATH"), "Then verify displayed Move Control Close in node configuration");
                WebBrowserUtil.captureScreenshot();
                
            }

            @When("^I selected Move Control to the 2nd Feature in node configuration$")			
            public void WhenISelectedMoveControlToThe2ndFeatureInNodeConfiguration()
            {
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.MoveControltothe2ndFeatureButtonXPATH","XPATH");
                
            }

             @Then("^verify displayed You Can not Move All The Controls in node configuration$")			
            public void ThenVerifyDisplayedYouCanNotMoveAllTheControlsInNodeConfiguration()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"AlgoShack","AlgoShack.YouCannotMoveAllTheControlsButtonXPATH","XPATH"), "Then verify displayed You Can not Move All The Controls in node configuration");
                WebBrowserUtil.captureScreenshot();
                
            }

            @When("^I selected Move Control Close in node configuration$")			
            public void WhenISelectedMoveControlCloseInNodeConfiguration()
            {
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.MoveControlCloseButtonXPATH","XPATH");
                
            }

            @When("^I unchecked Select All Controls for Delete or Move in node configuration$")			
            public void WhenIUncheckedSelectAllControlsForDeleteOrMoveInNodeConfiguration()
            {
                workFlow.uncheckCheckBox(0,"AlgoShack","AlgoShack.SelectAllControlsforDeleteorMoveCheckBoxXPATH","XPATH");
                
            }

             @Then("^verify enabled Control Name checkbox in node configuration$")			
            public void ThenVerifyEnabledControlNameCheckboxInNodeConfiguration()
            {
                Assertion.IsTrue(workFlow.verifyEnabled(0,"AlgoShack","AlgoShack.ControlNamecheckboxCheckBoxXPATH","XPATH"), "Then verify enabled Control Name checkbox in node configuration");
                WebBrowserUtil.captureScreenshot();
                
            }

            @When("^I selected Node Configuration Close in node configuration$")			
            public void WhenISelectedNodeConfigurationCloseInNodeConfiguration()
            {
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.NodeConfigurationCloseButtonXPATH","XPATH");
                
            }

            @When("^I selected Canvas Save in canvas$")			
            public void WhenISelectedCanvasSaveInCanvas()
            {
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.CanvasSaveButtonXPATH","XPATH");
                
            }

            @When("^I enter copied text Search Project name in project explorer$")			
            public void WhenIEnterCopiedTextSearchProjectNameInProjectExplorer()
            {
                workFlow.enterCopiedText(0,"AlgoShack","AlgoShack.SearchProjectnameTextBoxXPATH","XPATH");
                
            }

            @When("^I selected Created Project Name in project explorer$")			
            public void WhenISelectedCreatedProjectNameInProjectExplorer()
            {
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.CreatedProjectNameButtonXPATH","XPATH");
                
            }

            @When("^I selected Project name 3 dots in project explorer$")			
            public void WhenISelectedProjectName3DotsInProjectExplorer()
            {
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.Projectname3dotsButtonXPATH","XPATH");
                
            }

            @When("^I selected Delete Project in project explorer$")			
            public void WhenISelectedDeleteProjectInProjectExplorer()
            {
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.DeleteProjectButtonXPATH","XPATH");
                
            }

            @When("^I selected Project Delete Yes in delete$")			
            public void WhenISelectedProjectDeleteYesInDelete()
            {
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.ProjectDeleteYesButtonXPATH","XPATH");
                
            }

            @When("^I click if visible Deleted popup close in delete$")			
            public void WhenIClickIfVisibleDeletedPopupCloseInDelete()
            {
                workFlow.clickIfVisible(0,"AlgoShack","AlgoShack.DeletedpopupcloseButtonXPATH","XPATH");
                
            }

            @When("^I selected My Profile in home page$")			
            public void WhenISelectedMyProfileInHomePage()
            {
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.MyProfileButtonXPATH","XPATH");
                
            }

            @When("^I selected Logout in my profile$")			
            public void WhenISelectedLogoutInMyProfile()
            {
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.LogoutButtonXPATH","XPATH");
                
            }

             @Then("^verify content User logged out successfully popup in logout as '(.*)'$")			
            public void ThenVerifyContentUserLoggedOutSuccessfullyPopupInLogoutAsuserLoggedOutSuccessfullyPopup(String  _userLoggedOutSuccessfullyPopup)
            {
                Assertion.IsTrue(workFlow.verifyContentTextBox(_userLoggedOutSuccessfullyPopup,0,"AlgoShack","AlgoShack.UserloggedoutsuccessfullypopupTextBoxXPATH","XPATH"), "Then verify content User logged out successfully popup in logout as '<User logged out successfully popup>'");
      WebBrowserUtil.captureScreenshot();
                
            }

             @Then("^'(.*)' is displayed with '(.*)'$")			
            public void ThenpageIsDisplayedWithcontent(String  _page, String _content)
            {
                Assertion.IsTrue(workFlow.VerifyDefaultpageIsdisplayed(_page), "Then '<page>' is displayed with '<content>'");
                Assertion.IsTrue(workFlow.VerifymessageIsDisplayed(_content), "");;
                //Assertion.assertAll();
            }
    }