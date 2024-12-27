package org.prog.selenium.pages;

import org.openqa.selenium.WebDriver;

public class WikiPage extends AbstractPage {

    public WikiPage(WebDriver driver) {
        super(driver, "https://en.wikipedia.org/");
    }

    public boolean isPageLoaded() {
        return driver.getCurrentUrl().contains("wiki");
    }
}
