package Zopa_homePage;


import static org.junit.Assert.*;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.Test;

public class Check_title {
	

@Test public void site_header_is_on_home_page() {   

WebDriver browser;   

//Firefox's geckodriver requires you to specify its location.    

System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.20.1-win64\\geckodriver.exe");   

browser = new FirefoxDriver();   


browser.get("http://www.zopa.com");   

WebElement header = browser.findElement(By.id("header"));   

assertTrue((header.isDisplayed()));   

browser.close();

}

}
	