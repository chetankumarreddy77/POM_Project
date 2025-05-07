Feature: Create SKILLS Record Automation in orange HRM

Background: Common Steps
    Given User launch chrome browser
    When User opens URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"


Scenario: TC01 SKILLS Record
		And User enters username as "Admin" and password as "admin123"
    Then Navigate to SKILLS Page
    When Add SKILLS Records with SNAME as "PUSHPA_RAJ12" AND SDESCR as "PUSHDESCR0FIRE12"
    When Click on logout button
    Then Close Browser