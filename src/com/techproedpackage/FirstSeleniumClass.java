package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumClass {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:/Users/Home/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        Thread.sleep(5000);//bekleme süresi


        driver.close();//driver.quit de olur burada tarayiciyi kapatir.
        // close mevcut sayfayi kapatir, quit acilan tüm sayfalari kapatir. quit daha güclüdür

    }
}
