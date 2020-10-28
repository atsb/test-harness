package utilities;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

/***
 * TestBase class
 * @author Adam B
 * Contains methods for easily automating popular functions
 */
public class TestBase {
    protected WebDriver driver;

    /***
     * SelectDropDownMenuXPATH
     * DropDown Menu Select by XPATH
     * @param xpath String
     * @param value String
     */
    public void SelectDropDownMenuXPATH(String xpath,String value) {
        Select select = new Select(driver.findElement(By.xpath(xpath)));
        select.selectByVisibleText(value);
    }
    /***
     * SelectMultipleChoiceDropDownMenuXPATH
     * DropDown Menu Multiple Choice Select by XPATH
     * @param xpath String
     * @param value String
     */
    public void SelectMultipleChoiceDropDownMenuXPATH(String xpath,String value) {
        Select select = new Select(driver.findElement(By.xpath(xpath)));
        select.deselectAll();
        select.selectByVisibleText(value);
    }
    /***
     * FindAndClickByXPATH
     * Find and Click by XPATH
     * @param xpath String
     */
    public void FindAndClickByXPATH(String xpath) {
        driver.findElement(By.xpath(xpath)).click();
    }
    /***
     * FindAndSendKeysByXPATH
     * Find and SendKeys by XPATH
     * @param xpath String
     * @param value String
     */
    public void FindAndSendKeysByXPATH(String xpath, String value) {
        driver.findElement(By.xpath(xpath)).sendKeys(value);
    }
}
