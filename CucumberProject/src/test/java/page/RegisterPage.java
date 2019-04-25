package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RegisterPage {
@FindBy(how = How.ID,using="gender-female")
public static WebElement gender;
@FindBy(how = How.ID,using="FirstName")
public static WebElement FirstName;
@FindBy(how=How.ID,using="LastName")
public static WebElement LastName;
@FindBy(how=How.ID,using="Email")
public static WebElement Email;
@FindBy(how=How.ID,using="Password")
public static WebElement Password;
@FindBy(how=How.ID,using="ConfirmPassword")
public static WebElement ConfirmPassword;
@FindBy(how=How.CSS,using="input[value='Register']")
public static WebElement Register;
@FindBy(how=How.CSS,using="input[value='Continue']")
public static WebElement Continuebutton;
@FindBy(how=How.XPATH,using="/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]")
public static WebElement message;
}
