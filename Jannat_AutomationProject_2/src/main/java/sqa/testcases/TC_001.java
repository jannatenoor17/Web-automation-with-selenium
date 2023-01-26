package sqa.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import sqa.driver.driverSetup;
@Test
public class TC_001 extends driverSetup {
    String url = "https://rahulshettyacademy.com/locatorspractice/";
    public void locatorLearning() throws InterruptedException {
        driver.get(url);
        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.findElement(By.id("inputUsername")).sendKeys("kitty");
        Thread.sleep(2000);
        driver.findElement(By.name("inputPassword")).sendKeys("123");
        Thread.sleep(2000);
        driver.findElement(By.className("signInBtn")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("jerry");
        //tagname[@attribute='value']
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("kittyjerry@gmail.com");
//        driver.findElement(By.xpath("//input[@type='text'][3]")).sendKeys("123456");
        driver.findElement(By.xpath("//input [@type = 'text']")).sendKeys("1234");
//        Thread.sleep(6000);

    }
}
