package com.keste.testcases;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import com.keste.driver.Driver;
import com.keste.driver.DriverManager;
import com.keste.reports.ExtentLogger;

public class BaseTest {

	protected BaseTest() {

	}

	@SuppressWarnings("unchecked")
	@BeforeMethod
	protected void setUp(Object[] data) {
		Map<String, String> map = (Map<String, String>) data[0];
		Driver.initDriver(map.get("Browser"));
		
	}

	@AfterMethod
	protected void cleanUp(Object[] data) {

		//Driver.quitDriver();
   DriverManager.getDriver().quit();
	}
	
	protected List<String> getStringListSplitbyComma(String testdata)
	{
		String testdataspacesremoved[] = testdata.trim().split("\\s*,\\s*");
		List<String> testdataList =Arrays.asList(testdataspacesremoved);
		return testdataList;
	}

}
