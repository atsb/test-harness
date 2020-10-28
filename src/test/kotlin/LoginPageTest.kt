import org.openqa.selenium.By
import org.openqa.selenium.firefox.FirefoxDriver
import org.testng.Assert
import org.testng.annotations.AfterTest
import org.testng.annotations.BeforeTest
import org.testng.annotations.Test
import pages.LoginPageData


/***
 * LoginPageTest class
 * @author Adam B
 * All tests for a Login Page will begin in this class.
 */
class LoginPageTest : LoginPageData() {
    @BeforeTest
    fun setUpAssertLoginPage() {
        driver = FirefoxDriver()
        System.setProperty("webdriver.gecko.driver", "geckodriver")
        driver.navigate().to(WEB_URL)
    }
    @Test
    fun assertLoginPageDanish() {
        Assert.assertEquals("Wikipedia", driver.title, "Wikipedia")
        SelectDropDownMenuXPATH(LOGIN_PAGE_DROPDOWN_MENU, "Dansk")
        FindAndSendKeysByXPATH(LOGIN_PAGE_SEARCH_BAR, "København")
        FindAndClickByXPATH(LOGIN_PAGE_SEARCH_BUTTON)
        Assert.assertEquals("København", driver.findElement(By.xpath(LOGIN_PAGE_TEXT_HEADER)
        ).text, "København")
    }
    @Test
    fun assertLoginPageEnglish() {
        driver.navigate().to(WEB_URL)
        Assert.assertEquals("Wikipedia", driver.title, "Wikipedia")
        SelectDropDownMenuXPATH(LOGIN_PAGE_DROPDOWN_MENU, "English")
        FindAndSendKeysByXPATH(LOGIN_PAGE_SEARCH_BAR, "Copenhagen")
        FindAndClickByXPATH(LOGIN_PAGE_SEARCH_BUTTON)
        Assert.assertEquals("Copenhagen", driver.findElement(By.xpath(LOGIN_PAGE_TEXT_HEADER)
        ).text, "Copenhagen")
    }
    @AfterTest
    fun tearDownAssertLoginPage() {
        driver.close()
    }
}