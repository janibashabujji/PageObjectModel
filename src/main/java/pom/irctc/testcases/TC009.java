package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.alerts.pages.AlertsPage;
import wrappers.ProjectWrappers;

public class TC009 extends ProjectWrappers{

	
	
	@BeforeClass
	public void beforeClass() {
		testCaseName = "TC009";
		testCaseDescription = "To verify Prompt Alert";
		author = "Jani Basha Shaik";
		category = "smoke";
		browserName = "chrome";
		url = "https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt"	;
	}
	
	@Test
	public void promptAlert() {
		
		new AlertsPage()
		.switchToFrame()
		.clickOnTryIt()
		.enterAlert("Sujatha")
		.accept()
		.refresh()
		.switchToFrame()
		.clickOnTryIt()
		.alertText()
		.dismiss()
		.verifyName("User cancelled the prompt.")
		.defaultframe()
		.clickOnHome();
		
	}
	
	
	
	
}
