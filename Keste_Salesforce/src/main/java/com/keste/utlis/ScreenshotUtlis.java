package com.keste.utlis;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.keste.driver.DriverManager;

public final class ScreenshotUtlis {

private ScreenshotUtlis()
{
	
}
	public static String getBase64Image()
	{
		return ((TakesScreenshot)DriverManager.getDriver()).getScreenshotAs(OutputType.BASE64);
	}
}
