package com.facebok.LoginTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.facebok.BaseTest.BaseTest;
import com.facebok.LoginPages.LoginAccountPage;

public class LoginAccountTest extends BaseTest{
	@Test
	public void loginTest() {
		LoginAccountPage lap=PageFactory.initElements(driver, LoginAccountPage.class);
	    lap.userName("sajid");
	    lap.passWord("1234");
	    lap.submit();
	}
}
