package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RegistrationPage {
	
	
	
@FindBy(how=How.ID,using="userName")	
public static WebElement userName;
@FindBy(how=How.ID,using="password")	
public static WebElement password;
@FindBy(how=How.NAME,using="Login")	
public static WebElement LoginButton;
@FindBy(how=How.CSS,using="button [type='button']")
public static WebElement addproduct;

}
