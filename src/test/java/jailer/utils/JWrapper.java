package jailer.utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import jailer.pages.FormCreationPage;
import jailer.pages.JailerPage1;
import jailer.pages.JailerPage2;

public class JWrapper extends SeWrappers {
	
	
	public void loginwithCorrectdata(String email, String pass, String app, String connname, String baseurl, String key)
	{
	
	JailerPage1 jp = PageFactory.initElements(driver,JailerPage1.class);
	
	jp.email(email);
	jp.Password(pass);
	jp.Login();
	jp.ButtonNew();
	jp.Konnector();
	jp.trigger();
	jp.searchApp(app);
	jp.clickApp();
	jp.createConnection();
	jp.connectionName(connname);
	jp.connectionURL(baseurl);
	jp.apiKey(key);
	jp.validaate();
	jp.saveAccount();
	jp.selectTrigger();
	jp.clickContinue();
	jp.clickContinu1();
	
	
	
	
	
	}
	
	public void loginandRunapp(String email, String pass, String app)
	{
	
	JailerPage2 jp = PageFactory.initElements(driver,JailerPage2.class);
	
	jp.email(email);
	jp.Password(pass);
	jp.Login();
	jp.ButtonNew();
	jp.Konnector();
	jp.trigger();
	jp.searchApp(app);
	jp.selectTrigger();
	
	
	
	
	
	
	}
	
	
	public void createForm(String email, String pass)
	{
	
	FormCreationPage fc = PageFactory.initElements(driver,FormCreationPage.class);
	
	fc.email(email);
	fc.Password(pass);
	fc.Login();
	fc.formCreate();
	fc.newForm();
	fc.dragandDrop1();
	fc.labelName("Full Name");
	
	
	
	}

}
