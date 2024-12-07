package jailer.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import jailer.utils.SeWrappers;



public class JailerPage2 extends SeWrappers
{

@FindBy(name="email")
public WebElement mail;

@FindBy(name="password")
public WebElement pass;

@FindBy(xpath="(//p[text()='Log in'])")
public WebElement button1;

@FindBy(xpath="//div[@class='p-4 flex justify-center rounded-full w-24 h-10 items-center cursor-pointer bg-blue-300 font-bold']")
public WebElement kon1;

@FindBy(xpath="//span[text()='New Konnector']")
public WebElement newk1;

@FindBy(xpath="//span[text()='Trigger']")
public WebElement trigg;

@FindBy(xpath="//input[@placeholder='Search apps']")
public WebElement app;

@FindBy(xpath="//span[text()='Freshsales Suite']")
public WebElement clicapp;

@FindBy(xpath="//div[text()='Create Connection']")
public WebElement conn;



@FindBy(xpath="//div[@data-value='new-contact-trigger']")
public WebElement selectrigg;

@FindBy(xpath="//button[text()='Continue']")
public WebElement continuee;

@FindBy(xpath="//button[text()='Continue']")
public WebElement continu;



public void email(String email)
{
	waitForElement(mail,30);
	typeText(mail,email);
}
	
public void Password(String pwd)
{
	waitForElement(pass,30);
	typeText(pass,pwd);
}

public void Login()
{
	waitForElement(button1,30);
	clickElement(button1);
}


public void ButtonNew()
{
	waitForElement(kon1,30);
	clickElement(kon1);
}

public void Konnector()
{
	waitForElement(newk1,30);
	clickElement(newk1);
}

public void trigger()
{
	waitForElement(trigg,30);
	clickElement(trigg);
}

public void searchApp(String text)
{
	waitForElement(app,30);
	typeText(app,text);
}

public void clickApp()
{
	waitForElement(clicapp,30);
	clickElement(clicapp);
}

public void chooseConnection()
{
	waitForElement(conn,30);
	clickElement(conn);
}

public void selectTrigger()
{
	waitForElement(selectrigg,30);
	clickElement(selectrigg);
}

public void clickContinue()
{
	waitForElement(continuee,30);
	clickElement(continuee);
}

public void clickContinu1()
{
	waitForClickElement(continu,40);  //Explicit wait - wait.until(ExpectedConditions.elementToBeClickable(ele));
	clickElement(continu);
}


}
