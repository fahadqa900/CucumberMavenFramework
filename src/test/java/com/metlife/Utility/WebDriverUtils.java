package com.metlife.Utility;

import com.metlife.PageObjects.*;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import java.time.Duration;
public class WebDriverUtils
{
    static WebDriver driver;
    static Actions action;
    static WebElement search1;
    static WebElement search2;
    static WebElement element;
    public static void initialize()
    {
        switch (PropertyUtils.getProperty("browser"))
        {
            case "Firefox":
                driver = new FirefoxDriver();
                break;
            case "Edge":
                driver = new EdgeDriver();
                break;
            default:
                driver = new ChromeDriver();
                break;
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    public static void launchUrl(String url)
    {
        driver.get(url);
    }

    public static void type(By locator, String value)
    {
        element = driver.findElement(locator);
        element.clear();
        element.sendKeys(value);
    }

    public static void click(By locator)
    {
      driver.findElement(locator).click();
    }

    public static void clickHamberger()
    {
     driver.findElement(NavigateCommerceLocators.hambergerClick).click();
    }

    public static void clickViewAll()
    {
      driver.findElement(NavigateCommerceLocators.viewAllClick).click();
    }

    public static void enterInSearch(String searchText) throws InterruptedException
    {
      Thread.sleep(3000);
      driver.findElement(NavigateCommerceLocators.searchCommerce).sendKeys(searchText);
    }

    public static void clickOnCommerce()
    {
      driver.findElement(NavigateCommerceLocators.commerceLinkClick).click();
    }

    public static void clickTaskMenuNewAccountCreate()
    {
      driver.findElement(NavigateAccountLocators.showNavigationMenu).click();
    }

    public static void clickAccountOptionNewAccountCreate()
    {
      driver.findElement(NavigateAccountLocators.selectAccountOption).click();
    }

    public static void clickOnNewAccountCreate()
    {
      driver.findElement(CreateAccountLocators.newAccountClick).click();
    }

    public static void enterAccountNameCreate()
    {
      driver.findElement(CreateAccountLocators.enterAccountName).sendKeys("Dev1Account");
    }

    public static void clickSaveAccountCreate()
    {
      driver.findElement(CreateAccountLocators.clickOnSave).click();
    }

    public static void closeNewAccountWindow() throws InterruptedException
    {
      Thread.sleep(5000);
      driver.findElement(CreateAccountLocators.closeNewAccountWindow).click();
    }

    public static void refreshBrowserAccountCreation() throws InterruptedException
    {
      Thread.sleep(5000);
      driver.navigate().refresh();
    }
    public static void clickTaskMenuForHome()
    {
     driver.findElement(ViewAllRecentRecordsLocators.showNavigationMenu).click();
    }
    public static void clickHomeOption()
    {
        try
        {
         driver.findElement(ViewAllRecentRecordsLocators.homeNavigation).click();
        }
        catch (StaleElementReferenceException e)
        {
          driver.findElement(ViewAllRecentRecordsLocators.homeNavigation).click();
        }
    }
    public static void clickViewRecentRecords() throws InterruptedException
    {
     Thread.sleep(5000);
     driver.navigate().refresh();
     Thread.sleep(5000);
     driver.findElement(ViewAllRecentRecordsLocators.viewAllRecentRecords).click();
    }
    public static void closeRecentRecords() throws InterruptedException
    {
     Thread.sleep(5000);
     driver.findElement(ViewAllRecentRecordsLocators.closeRecentRecordsWindow).click();
    }
    public static void clickTaskMenuAccountRecentRecords()
    {
     driver.findElement(ViewAllRecentRecordsLocators.showNavigationMenu).click();
    }
    public static void clickAccountOptionRecentRecords()
    {
     driver.findElement(ViewAllRecentRecordsLocators.selectAccountOption).click();
    }
    public static void clickAccountCheckBox()
    {
     driver.findElement(EditAddAccountLocators.clickOnAccountCheckBox).click();
    }
    public static void openAccountEditSection() throws InterruptedException
    {
     Thread.sleep(5000);
     driver.findElement(EditAddAccountLocators.openAccountEditDelete).click();
    }
    public static void  clickEditButtonExistingAccount()
    {
     driver.findElement(EditAddAccountLocators.clickOnEdit).click();
    }
    public static void clearExistingAccountName()
    {
     driver.findElement(EditAddAccountLocators.enterAccountName).clear();
    }
    public static void enterToEditExistingAccount(String accountName)
    {
     driver.findElement(EditAddAccountLocators.enterAccountName).sendKeys(accountName);
    }
    public static void saveUpdateExistingAccount()
    {
     driver.findElement(EditAddAccountLocators.saveUpdate).click();
    }
    public static void clickNewToCreateSecondAccount()
    {
     driver.findElement(EditAddAccountLocators.newAccountClick).click();
    }
   public static void enterCreateSecondAccount(String accountName)
   {
   driver.findElement(EditAddAccountLocators.enterAccountName).sendKeys(accountName);
   }
   public static void updateSaveSecondAccount()
   {
   driver.findElement(EditAddAccountLocators.clickOnSave).click();
   }
   public static void closeSecondAccountWindow()
   {
   driver.findElement(EditAddAccountLocators.closeUpdateAccountWindow1).click();
   }
   public static void clickCreateThirdAccount()
   {
    driver.findElement(EditAddAccountLocators.newAccountClick).click();
   }
   public static void enterAccountThird(String accountName)
   {
    driver.findElement(EditAddAccountLocators.enterAccountName).sendKeys(accountName);
   }
   public static void updateSaveThirdAccount()
   {
    driver.findElement(EditAddAccountLocators.clickOnSave).click();
   }
   public static void closeThirdAccountWindow()
   {
   driver.findElement(EditAddAccountLocators.closeUpdateAccountWindow2).click();
   }
   public static void refreshBrowserAfterEditAddAccounts() throws InterruptedException
   {
   Thread.sleep(5000);
   driver.navigate().refresh();
   }
 public static void clickTaskUpdatedRecentRecords()
 {
  driver.findElement(ViewUpdatedRecentRecordsLocators.showNavigationMenu).click();
 }
 public static void clickHomeUpdatedRecentRecords()
 {
  driver.findElement(ViewUpdatedRecentRecordsLocators.homeNavigation).click();
 }
 public static void clickViewUpdatedRecords() throws InterruptedException
 {
  Thread.sleep(5000);
  driver.navigate().refresh();
  Thread.sleep(5000);
  driver.findElement(ViewUpdatedRecentRecordsLocators.viewAllRecentRecords).click();
 }
 public static void closeUpdatedRecordsWindow() throws InterruptedException
 {
  Thread.sleep(5000);
  driver.findElement(ViewUpdatedRecentRecordsLocators.closeRecentRecordsWindow).click();
 }

 public static void hoverOnAccountInRecentRecord() throws InterruptedException
 {
  element=driver.findElement(HoverAccountRecentRecordsLocators.hoverClickRecentRecord);
  Thread.sleep(5000);
  action=new Actions(driver);
  action.moveToElement(element).build().perform();
  Thread.sleep(5000);
 }
 public static void refreshBrowserAfterHoverRecentRecords()
 {
  driver.navigate().refresh();
 }

 public static void clickAccountInRecentRecord()
 {
  driver.findElement(ClickAccountRecentRecordsLocators.hoverClickRecentRecord).click();
 }
 public static void createNewContactRecentRecords()
 {
  driver.findElement(ClickAccountRecentRecordsLocators.createNewContact).click();
 }
public static void salutationContactRecentRecords()
{
 driver.findElement(ClickAccountRecentRecordsLocators.selectSalutation).click();
}
public static void enterLastNameContactRecentRecords()
{
  driver.findElement(ClickAccountRecentRecordsLocators.enterLastNameContact).sendKeys("Fahad");
}
public static void clickSaveContactRecentRecords()
{
 driver.findElement(ClickAccountRecentRecordsLocators.clickOnSave).click();
}
public static void clickDetailsTabRecentRecords()
{
driver.findElement(ClickAccountRecentRecordsLocators.detailTabContact).click();
}
public static void editMobileContactRecentRecords()
{
driver.findElement(ClickAccountRecentRecordsLocators.editMobileContact).click();
}
public static void enterMobileRecentRecords(String mobileNumber)
{
 driver.findElement(ClickAccountRecentRecordsLocators.enterMobileContact).sendKeys(mobileNumber);
}
public static void clickSaveContact1RecentRecords()
{
 driver.findElement(ClickAccountRecentRecordsLocators.clickOnSave).click();
}
public static void closeUpdatedContactRecentRecords() throws InterruptedException
{
Thread.sleep(5000);
driver.findElement(ClickAccountRecentRecordsLocators.closeUpdatedContactWindow).click();
}
public static void quitUpdatedContactRecentRecords() throws InterruptedException
{
Thread.sleep(5000);
driver.findElement(ClickAccountRecentRecordsLocators.quitUpdatedContactWindow).click();
}
public static void clickTaskMenuAccountSearch()
{
 driver.findElement(AccountSearchLocators.showNavigationMenu).click();
}
public static void selectAccountOptionAccountSearch()
{
 driver.findElement(AccountSearchLocators.selectAccountOption).click();
}
public static void firstAccountSearch(String searchFirstAccount)
{
 search1 = driver.findElement(AccountSearchLocators.AccountSearch);
 search1.sendKeys(searchFirstAccount);
 element = driver.findElement(AccountSearchLocators.enterPressEvent);
 action = new Actions(driver);
 action.doubleClick(element).build().perform();
}
public static void clearSearchFirstAccount()
{
search1.clear();
}
public static void secondAccountSearch(String searchSecondAccount)
{
search2= driver.findElement(AccountSearchLocators.AccountSearch);
search2.sendKeys(searchSecondAccount);
action=new Actions(driver);
action.doubleClick(element).build().perform();
}
public static void clearSearchSecondAccount()
{
search2.clear();
}
public static void refreshBrowserAfterAccountSearch()
{
driver.navigate().refresh();
}
public static void clickAccountCheckBox1()
{
driver.findElement(DeleteAccountLocators.clickOnAccountCheckBox).click();
}
public static void openAccountDeleteSection()
{
driver.findElement(DeleteAccountLocators.OpenAccountEditDelete).click();
}
public static void deleteAccountButton1()
{
driver.findElement(DeleteAccountLocators.deleteAccountContactButton1).click();
}
public static void deleteAccountButton2()
{
driver.findElement(DeleteAccountLocators.DeleteAccountButton).click();
}
public static void clickTaskMenuToSeeContact()
{
driver.findElement(NavigateContactLocators.showNavigationMenu).click();
}
public static void clickContactOption()
{
driver.findElement(NavigateContactLocators.clickOnContact).click();
}
public static void refreshBrowserContactsPage1()
{
driver.navigate().refresh();
}
public static void clickCreateContacts() throws InterruptedException
{
Thread.sleep(5000);
driver.findElement(CreateContactLocators.createNewContact).click();
}
public static void salutationContacts()
{
driver.findElement(CreateContactLocators.selectSalutation).click();
}
public static void enterLastNameContacts(String lName)
{
driver.findElement(CreateContactLocators.enterLastNameContact).sendKeys(lName);
}
public static void clickSaveContacts()
{
driver.findElement(CreateContactLocators.clickOnSave).click();
}
public static void closeUpdatedContactsWindow() throws InterruptedException
{
Thread.sleep(5000);
driver.findElement(CreateContactLocators.closeUpdatedContactWindow).click();
}
public static void refreshBrowserContactsPage2() throws InterruptedException
{
Thread.sleep(5000);
driver.navigate().refresh();
}
public static void clickListView() throws InterruptedException
{
Thread.sleep(5000);
driver.findElement(ListIntelligenceLocators.listView).click();
}
public static void clickIntelligenceView() throws InterruptedException
{
Thread.sleep(5000);
driver.findElement(ListIntelligenceLocators.intelligenceView).click();
}

public static void markContactsClick() throws InterruptedException
{
Thread.sleep(5000);
driver.findElement(MarkContactLocators.markContact).click();
}
public static void unmarkContactsClick() throws InterruptedException
{
Thread.sleep(5000);
driver.findElement(MarkContactLocators.markContact).click();
}
public static void editContacts()
{
driver.findElement(EditContactLocators.editContact).click();
}
public static void clickEditContacts()
{
driver.findElement(EditContactLocators.clickOnEdit).click();
}
public static void editContactsTitle(String contactTitle)
{
driver.findElement(EditContactLocators.editContactTitle).sendKeys(contactTitle);
}
public static void clickSaveContacts1()
{
driver.findElement(EditContactLocators.clickOnSave).click();
}
public static void openDeleteContactSection()
{
driver.findElement(DeleteContactLocators.editContact).click();
}
public static void deleteContactButton1()
{
driver.findElement(DeleteContactLocators.deleteContact).click();
}
public static void deleteContactButton2()
{
driver.findElement(DeleteContactLocators.deleteAccountContactButton).click();
}
public static void clickLogoutImageClassicView()
{
try
{
driver.findElement(SwitchToClassicViewLocators.logoutImage).click();
}
catch (StaleElementReferenceException e)
{
driver.findElement(SwitchToClassicViewLocators.logoutImage).click();
}
}
public static void switchToClassicView()
{
driver.findElement(SwitchToClassicViewLocators.switchToClassic).click();
}
public static void switchToLightView()
{
driver.findElement(SwitchToLightViewLocators.switchToLight).click();
}
    public static void getLogoutImage()throws InterruptedException
    {
        try
        {
            driver.findElement(LogoutLocators.logoutImage).click();
        }
        catch (StaleElementReferenceException ex1)
        {
            driver.findElement(LogoutLocators.logoutImage).click();
        }
    }
    public static void getLogoutLink() throws InterruptedException
    {
        try
        {
            Thread.sleep(3000);
            driver.findElement(LogoutLocators.logoutLink).click();
        }
        catch (StaleElementReferenceException ex3)
        {
            Thread.sleep(3000);
            driver.findElement(LogoutLocators.logoutLink).click();

        }
        }
        }
