package com.keste.pages;

import org.openqa.selenium.By;

import com.keste.enums.WaitStrategy;
import com.keste.utlis.RandomTxt;

public class LogIn_To_Salesforce extends BasePage{


private final By UserName= By.id("username");

private final By Password= By.id("password");

private final By LoginToSandbox= By.xpath("//input[@value='Log In to Sandbox']");

public Homepage Login_To_SF() {
	
	
	sendKeys(UserName, "akash.sv1@argano.com.full", WaitStrategy.CLICKABLE, 10);
	sendKeys(Password, "Fenoy@2021", WaitStrategy.CLICKABLE, 100);
	click(LoginToSandbox, WaitStrategy.CLICKABLE, 10);
	
	return new Homepage();
}








}
