package com.facebok.LoginTests;

import org.testng.annotations.Test;

import com.facebok.BaseTest.BaseTest;
import com.facebok.LoginPages.LoginAccountPageWithConstructor;

public class LoginAccountWithConstructorTest extends BaseTest{
	
	@Test
	public void loginTest() {
	LoginAccountPageWithConstructor lap= new LoginAccountPageWithConstructor(driver);
	     lap.loginAccount("faruq", "1234");
	}

}
