package org.prog.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class IframeDemo {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        try {
            driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
            new WebDriverWait(driver, Duration.ofSeconds(30L))
                    .until(ExpectedConditions.presenceOfElementLocated(By.id("accept-choices")))
                    .click();

            WebElement runButtonOuter = driver.findElement(By.id("runbtn"));
            System.out.println(runButtonOuter.isDisplayed());
            // Here we are in base HTML
            WebElement iFrameOuter = driver.findElement(By.id("iframeResult"));
            driver.switchTo().frame(iFrameOuter);
            // Here we are in iframe
            WebElement headerElement = driver.findElement(By.tagName("h2"));
            System.out.println(headerElement.isDisplayed());

            WebElement iFrameInner = driver.findElement(By.tagName("iframe"));
            driver.switchTo().frame(iFrameInner);

            System.out.println(driver.findElement(By.tagName("h1")).getText());

//            driver.switchTo().parentFrame();
            driver.switchTo().defaultContent();

//            WebElement element = driver.findElement(By.tagName("video"));
//            SearchContext searchContext = element.getShadowRoot();
//            searchContext.findElement(By.xpath("//input[@type='button']"));

        } finally {
            driver.quit();
        }
    }
}
