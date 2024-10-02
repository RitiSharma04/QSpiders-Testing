package com.natwest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class QSpidersTesting {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Welcome\\Desktop\\Natwest\\QSpidersTesting\\src\\test\\java\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("//textarea[@name=\"q\"]")).sendKeys("QSpiders");
        Thread.sleep(1000);
        List<WebElement> listOfQspiders=driver.findElements(By.xpath("//span[contains(text(),'QSpiders')]"));
        Thread.sleep(1000);
        int count1=listOfQspiders.size();
        Thread.sleep(1000);
        System.out.println(count1);
        Thread.sleep(1000);
        for (int i=0;i<count1;i++){
            Thread.sleep(1000);
            WebElement element=listOfQspiders.get(i);
            Thread.sleep(1000);
            System.out.println(element.getText());
        }
        driver.manage().window().maximize();
//        driver.findElements(By.xpath("//"))


    }
}
