package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage {
	
	
	
@FindBy(how=How.ID,using="userName")	
public static WebElement userName;
@FindBy(how=How.ID,using="password")	
public static WebElement password;
@FindBy(how=How.NAME,using="Login")	
public static WebElement LoginButton;
@FindBy(how=How.XPATH,using="//div/div/div/div[1]/button")
public static WebElement addproduct;
@FindBy(how=How.ID,using="categorydropid")
public static WebElement catname;
public static void select()
{
	
	Select name= new Select(catname);
	name.selectByIndex(1);
}
@FindBy(how=How.NAME,using="subcategorydropname")
public static WebElement scatname;
public static void subselect()
{
	Select name1= new Select(scatname);
	name1.selectByIndex(2);

}
@FindBy(how=How.ID,using="prodid")
public static WebElement prodid;
@FindBy(how=How.ID,using="priceid")
public static WebElement priceid;
@FindBy(how=How.ID,using="quantityid")
public static WebElement quantityid;
@FindBy(how=How.ID,using="brandid")
public static WebElement brandid;
@FindBy(how=How.ID,using="description")
public static WebElement description;
@FindBy(how=How.CSS,using=("input[type='submit']"))
public static WebElement submit;
@FindBy(how=How.XPATH,using="/html/body/main/div/div/div/form/b/i")
public static WebElement msg;





}
