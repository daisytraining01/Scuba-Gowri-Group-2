Feature: BookStore Application

Scenario: Adding New book from Store
Given user is navigating to "https://demoqa.com/login" page
When user enters username as "Gowri14"
And user enters password as "XXXXX"
And clicking Login button
Then user succesfully logged in Profile
When user clicks BookStore and Select a Book
And clicks "Add To Your Collection"
Then book added succesfully in the user account

Scenario: Deleting existing book from account
Given user is navigating to "https://demoqa.com/login" page
When user enters username as "Gowri14"
And user enters password as "XXXXX"
And clicking Login button
Then user succesfully logged in Profile
And clicks Delete button in selected book
And clicks "OK"
Then book deleted succesfully in the user account

#Feature: Practice Form

Scenario: Submitting Practice Form
Given user is navigating to "https://demoqa.com/automation-practice-form" oage
When user enters firstname as "Gowri"
Then user enters lastname as "Venkatesan"
And user selects Gender
And user enters Mobile number as "XXXXXX"
And user selects Date of Birth
And user enter Subjects and Hobbies
And user uploads Picture
And user enters Address
And user enters State and City
And user click Submit
Then Practice form will be submitted

#Feature : Methods
Scenario: TextBox
Given user is on Page with TextBox
When clicking Textbox the user able to enter value in it
And user click Tab then focus shifts 
Then user able to add or delete the values entered in it

Scenario: CheckBox
Given user is on Page with CheckBox
When user clicks tab the checkbox focus change
And user can select mutiple checkboxed
Then user able to select or deselct the checkboxes


Scenario: Links
Given user is on the Page with Links
When user clicks on the links
And user able to navigate to the selected page
Then Navigate back to the same page

Scenario: Upload and Download
Given user is on the Page with Uplaod and Download
When user clicks Download , download of the object is expected
And user can verify the downloaded object
When user clicks Upload, navigates to local folder
And user browse the file and click uplaod
Then file should be uplaoded successfully

Scenario: BrowserWindows
Given user is on the Page with BrowserWindows
When user clicks on the button with New tab open
Then new tab opens in the Existing window
When user clicks on the button New Window
Then new weboage window opens 
When user clicks on the button New window with message
Then new window with message opens

Scenario: Alerts
Given user is on the Page with Alerts
When user clicks on the Alert button
Then alert window opened up
When user clicks on the Alert after 5 sec button
Then alert window opened up after 5 sec
When user clicks on the Alert button with confirm 
Then alert window opened with confirm button
When user clicks on the Alert button with Promptbox 
Then alert window opened with Promptbox
And user able to accept or dismiss the alert

Scenario: Accordian
Given user is on the Page with Accordian
When user selects on the questions
Then user will be able to view the questions with answers
And user will be able to verify all the questions with answers

Scenario: AutoComplete
Given user is on the Page with AutoComplete
When user enters single letter in the input box
Then relative values will be displayed to select autocomplete
And user can select multiple option by using Tab

Scenario: Tabs
Given user is on the Page with Tabs
When user enters selects different tabs
Then user will be able to navigate accordingly

Scenario: SelectMenu
Given user is on the Page with SelectMenu
When user select values from Selectvalue 
And select values from Selectone
And select values from OldstyleMenu
Then user able to navigate between options using tab
Then user can search the options for autocomplete

Scenario: Sortable
Given user is on the Page with Sortable
When user move or drag elements 
Then sort should happen for the elements presented based on selection
And user will be able to perform Sort in Both List and Grid view

Scenario: Resizeable
Given user is on the Page with Resizeable
When user resize the object
Then the object size should change as per the user
And the text of the size appears inside the box

Scenario: Draggable
Given user is on the Page with Draggable
When user drage the element in the page
Then user should able to drop the element in the page
When user tries to do drag and drop in the restricted axis and Container
Then user will be able to perform drag successfully


 
