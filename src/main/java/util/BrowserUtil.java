package util;

import aquality.selenium.browser.AqualityServices;

public class BrowserUtil {
    public static void goTo(String url) {
        AqualityServices.getBrowser().goTo(url);
    }
}
