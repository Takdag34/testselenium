package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Home/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Chrome driver olusturun
        driver.get("https://www.google.com");

       // driver.get("https://www.amazon.com/");

        //1. Aynı class ta, Navigate to amazon home page  https://www.amazon.com/

        driver.navigate().to("https://www.amazon.com/");
        //2. Navigate back to google

        driver.navigate().back();
        //3. Navigate forward to amazon

        driver.navigate().forward();
        //4. Refresh(yenile) the web page

        driver.navigate().refresh();
        //5. Maximize the window

        driver.manage().window().maximize();
        //6. Close/Quit the browser

        driver.close();



    }
}
