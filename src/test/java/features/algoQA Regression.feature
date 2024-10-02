Feature: algoQA Regression1
#Regression Type
#Correct Values = true
#Incorrect Values = false
#Illegal Values = false
#Invalid Values = false
#Boundary Values = false
#Edge Cases Values = false

@Select_all_Unused_controls_try_to_move_and_delete_at_a_time
@uida1030989687
@set21
@test001
@NodeConfiguration
@NC_11
Scenario Outline: Verify user able select multiple controls by using select all and try to move and delete at a time selected controls (Unused controls) in Node Configuration
Given I have access to application
When I clicked SignIn link in sign in
Then verify displayed Login to algoQA in sign in
When I entered Email Address in sign in as '<Email Address>'
And I entered Password in sign in as '<Password>'
And I clicked LogIn Button in sign in
Then verify content User Signed In Successfully in sign in as '<User Signed In Successfully>'
When I click if visible Sign In Popup Close in sign in
Then verify displayed Dashboard Page in home page
When I wait for control visible My Profile in home page
And I selected algoQA in home page
And I wait for control visible Project Explorer Label in project explorer
And I click if visible Search The project in Project explorer Close Icon in project explorer
Then verify displayed Project Explorer Label in project explorer
When I entered Project name in create project as '<Project name1>'
And I copied text Project name in create project
And I selected Create in create project
#Then verify content Project created successfully popup in create project as '<Project created successfully popup>'
When I click if visible React tour Skip button in algoqa
And I wait in seconds for sometime in project explorer as '<for sometime2>'
Then verify displayed Canvas Page in canvas
When I drag and drop horizontally In Node in node configuration
And I selected New Node in node configuration
And I selected Node Edit in node configuration
And I selected Node Configuration OK in node configuration
And I ClickOnceVisible Displays control list panel in node configuration
And I clear and enter text Control Name in node configuration as '<Control Name3>'
And I selected Add New Control in node configuration
And I clear and enter text Control Name2 in node configuration as '<Control Name24>'
And I selected Select or deselect Multiple Control in node configuration
And I checked Select All Controls to Delete or Move in node configuration
And I selected Delete Selected Control in node configuration
Then verify displayed No Controls Found in node configuration
When I disabledElement Control Name Save is restricted in node configuration
And I selected Control Name Cancel in node configuration
And I selected Displays control list panel in node configuration
And I clear and enter text Control Name in node configuration as '<Control Name5>'
And I copied text Control Name in node configuration
And I selected Add New Control in node configuration
And I clear and enter text Control Name2 in node configuration as '<Control Name26>'
And I copied text Control Name2 in node configuration
And I selected Control Name Save in node configuration
Then verify content Successfully Updated Controls popup in node configuration as '<Successfully Updated Controls popup>'
When I selected Add Features in node configuration
And I selected Displays control list panel in node configuration
And I selected Select or deselect Multiple Control in node configuration
And I checked Select All Controls for Delete or Move in node configuration
And I selected Move Selected Control in node configuration
Then verify displayed Move Control Page in node configuration
And verify displayed Move Control label in node configuration
And verify displayed Move Control Feature1 in node configuration
And verify displayed Move Control Feature2 in node configuration
And verify displayed Move Control Close in node configuration
When I disabledElement Move Control Send is restricted in node configuration
And I selected Move Control to the 2nd Feature in node configuration
And I disabledElement Move Control Send is restricted in node configuration
Then verify displayed You Can not Move All The Controls in node configuration
When I selected Move Control Close in node configuration
And I selected Select or deselect Multiple Control in node configuration
And I checked Select All Controls for Delete or Move in node configuration
And I unchecked Select All Controls for Delete or Move in node configuration
And I selected Select All Controls button in node configuration
Then verify displayed Do you want to Enable All Controls in node configuration
When I selected Select All Controls button Yes in node configuration
Then verify displayed Enable All Controls popup in node configuration
And verify enabled Control Name checkbox in node configuration
When I selected Control Name Cancel in node configuration
And I selected Node Configuration Close in node configuration
And I selected Canvas Save in canvas
And I enter copied text Search Project name in project explorer
And I wait in seconds for sometime in project explorer as '<for sometime7>'
And I selected Created Project Name in project explorer
And I selected Project name 3 dots in project explorer
And I selected Delete Project in project explorer
And I selected Project Delete Yes in delete
And I click if visible Deleted popup close in delete
And I selected My Profile in home page
And I selected Logout in my profile
Then verify content User logged out successfully popup in logout as '<User logged out successfully popup>'
And '<page>' is displayed with '<content>'

Examples:
|SlNo.|Email Address|Password|User Signed In Successfully|Project name1|Project created successfully popup|for sometime2|Control Name3|Control Name24|Control Name5|Control Name26|Successfully Updated Controls popup|for sometime7|User logged out successfully popup|page|content|
|1|EmailAddress1|Password1|UserSignedInSuccessfully1|Projectname1|Projectcreatedsuccessfullypopup1|forsometime1|ControlName1|ControlName21|ControlName1|ControlName21|SuccessfullyUpdatedControlspopup1|forsometime1|Userloggedoutsuccessfullypopup1|AlgoShack|Sign In|


#Total No. of Test Cases : 1

