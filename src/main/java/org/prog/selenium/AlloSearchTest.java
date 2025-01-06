package org.prog.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlloSearchTest {
    public static void main(String[] args) {


        // Ініціалізація WebDriver
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            // Відкрити сайт ALLO
            driver.get("https://allo.ua/");

            // Пошук рядка пошуку
            WebElement searchBox = wait.until(ExpectedConditions.elementToBeClickable(By.name("search")));
            searchBox.sendKeys("iPhone");

            // Натиснути кнопку пошуку
            WebElement searchButton = driver.findElement(By.cssSelector("button[type='submit']"));
            searchButton.click();

            // Очікування результатів пошуку
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".product-card")));

            // Перевірка результатів
            WebElement firstProduct = driver.findElement(By.cssSelector(".product-card__title"));
            if (firstProduct.getText().toLowerCase().contains("iphone")) {
                System.out.println("Тест пройдено: Apple iPhone 16 Pro Max 256GB Desert Titanium (MYWX3)");
            } else {
                System.out.println("Тест провалено: iPhone не знайдено.");
            }

        } finally {
            // Закрити браузер
            driver.quit();
        }
    }
}


