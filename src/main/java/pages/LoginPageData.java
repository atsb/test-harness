package pages;

import utilities.TestBase;

/***
 * Page data for individual pages, separate from test cases.
 * @author Adam B
 * Pages will extend the TestBase class and each testcase will import
 * it's required page data and thus also import the TestBase.
 */
public class LoginPageData extends TestBase {
        protected final String WEB_URL = "https://wikipedia.org";
        protected final String LOGIN_PAGE_DROPDOWN_MENU = "//*[@id=\"searchLanguage\"]";
        protected final String LOGIN_PAGE_SEARCH_BAR = "//*[@id=\"searchInput\"]";
        protected final String LOGIN_PAGE_SEARCH_BUTTON = "//*[@id=\"search-form\"]/fieldset/button/i";
        protected final String LOGIN_PAGE_TEXT_HEADER = "//*[@id=\"firstHeading\"]";
}
