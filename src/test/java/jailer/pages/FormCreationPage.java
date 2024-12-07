package jailer.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import jailer.utils.SeWrappers;



public class FormCreationPage extends SeWrappers
{

@FindBy(name="email")
public WebElement mail;

@FindBy(name="password")
public WebElement pass;

@FindBy(xpath="(//p[text()='Log in'])")
public WebElement button1;


@FindBy(xpath="//span[text()='Forms']")
public WebElement form;

@FindBy(xpath="//button[text()='New form']")
public WebElement nform;

@FindBy(xpath="(//div[@class='flex gap-4 h-full items-center '])[1]")
public WebElement drag1;

@FindBy(xpath="(//button[@class='relative rounded-lg w-full text-left px-3 group z-10'])[2]")
public WebElement drop1;

@FindBy(xpath="//input[@placeholder='Enter the field label']")
public WebElement label;


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

public void formCreate()
{
	javascriptExecutorClickWebElement(form);
	waitForClickElement(form,10);  //Explicit wait - wait.until(ExpectedConditions.elementToBeClickable(ele));
	clickElement(form);
}

public void newForm()
{
	waitForElement(nform,10);
	clickElement(nform);
}

public void dragandDrop1()
{

	actionsdragandDrop1(drag1,drop1);
	actionsDoubleClick(drop1);
}

public void labelName(String name)
{
	waitForElement(label,30);
	typeText(label,name);
}

}
