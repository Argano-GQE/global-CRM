package com.keste.testcases;

import java.util.Map;

import org.testng.annotations.Test;

import com.keste.pages.Homepage;
import com.keste.pages.LeadPage;
import com.keste.pages.LogIn_To_Salesforce;
import com.keste.pages.Opportunity;

public class Salesforce_Test extends BaseTest {

 LogIn_To_Salesforce login;
 Homepage home;
 LeadPage lead;
 Opportunity opp;
 
 @Test(priority=1)
 public void CreateLeadAccount(Map<String, String> data) {
	 
 login= new LogIn_To_Salesforce();
 login.Login_To_SF();
 home= new Homepage();
 home.Create_New_Lead();
 lead= new LeadPage();
lead.LeadPage_Fields();
}
 
 @Test(priority=2)
 public void CreateOpportunity(Map<String, String> data) {
	 
 login= new LogIn_To_Salesforce();
 login.Login_To_SF();
 home= new Homepage();
 home.Create_NewOpportunity();
 opp=new Opportunity();
 opp.CreateOpportunity();

 }




}
