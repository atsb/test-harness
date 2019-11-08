import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LoginPageData;

/***
 * LoginPageTest class
 * @author Adam B
 * All tests for a Login Page will begin in this class.
 */
public class LoginPageTest extends LoginPageData {

    @BeforeTest
    public void SetUpAssertLoginPage() {
        driver = new ChromeDriver();
        driver.navigate().to(WEB_URL);
    }

    @Test
    public void AssertLoginPageDanish() {
        Assert.assertEquals("Wikipedia", driver.getTitle(), "Wikipedia");
        SelectDropDownMenuXPATH(LOGIN_PAGE_DROPDOWN_MENU, "Dansk");
        FindAndSendKeysByXPATH(LOGIN_PAGE_SEARCH_BAR, "København");
        FindAndClickByXPATH(LOGIN_PAGE_SEARCH_BUTTON);
        Assert.assertEquals("København", driver.findElement(By.xpath(LOGIN_PAGE_TEXT_HEADER)
                ).getText(), "København");
    }

    @Test
    public void AssertLoginPageEnglish() {
        driver.navigate().to(WEB_URL);
        Assert.assertEquals("Wikipedia", driver.getTitle(), "Wikipedia");
        SelectDropDownMenuXPATH(LOGIN_PAGE_DROPDOWN_MENU , "English");
        FindAndSendKeysByXPATH(LOGIN_PAGE_SEARCH_BAR, "Copenhagen");
        FindAndClickByXPATH(LOGIN_PAGE_SEARCH_BUTTON);
        Assert.assertEquals("Copenhagen", driver.findElement(By.xpath(LOGIN_PAGE_TEXT_HEADER)
        ).getText(), "Copenhagen");
    }

    @AfterTest
    public void TearDownAssertLoginPage() {
        driver.close();
        driver.quit();
    }
}
