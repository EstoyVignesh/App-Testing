package jailer.tests;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import jailer.utils.JWrapper;
import jailer.utils.Reports;
import jailer.utils.SeWrappers;




public class LoginTest1 extends SeWrappers{
	

	
	@BeforeTest
	public void login()
	{
		excelfile ="Sampledata1";
		sheet1 = "sheet1";
	}
	
	JWrapper j = new JWrapper();
	Reports report = new Reports();
	
	@Parameters({"browser","url"}) 
	@BeforeMethod
	public void login1(String browserName, String url)
	{
		report.setTCDesc("Validating Signup Function");
		launchCrossBrowser(browserName,url);
	}
	
	
/*	@Test(dataProvider = "get",priority=1)
	 
	public void loginTest(String email,String pass, String app, String connname, String baseurl, String key)
	{		
		j.loginwithCorrectdata(email, pass, app, connname, baseurl, key);
//		j.createForm(email, pass);
	}
	
	*/
	
	
	@Test(dataProvider = "get")
	public void logintest1(String email,String pass, String app)
	{		
		
		j.loginandRunapp(email, pass, app);
	}
	
	
	
	@DataProvider(name = "get")
	public String[][] getdata() throws IOException{
	String[][] data = excelRead(excelfile,sheet1);   //Method 1
	
	//Method 2
	//String[][] data = excelRead(excelfile);
	
	return data;
	
	}
	

}
