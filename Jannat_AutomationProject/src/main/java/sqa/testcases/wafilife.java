package sqa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import sqa.driver.driverSetup;

public class wafilife extends driverSetup {
    String url = "https://www.wafilife.com/";

    @Test
    public void automate(){
        driver.manage().window().maximize();
        driver.get(url);
        driver.findElement(By.cssSelector("li.menu-item-level0:nth-child(5) > a:nth-child(1) > span:nth-child(1)")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div[2]/div[2]/div/div/div/div/div/ul/li[20]/a[2]/h3")).click();
        sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[1]/div[2]/div[3]/div/div/div/div/article/div/div/div[1]/div[2]/div[3]/ul/li[10]/div/div[1]/a")).click();
        sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"product-87585\"]/div[2]/form/div[2]/button[2]")).click();
        sleep(3000);
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div[1]/div[2]/div/div[2]/a[2]")).click();
        sleep(1000);
        driver.findElement(By.id("billing_first_name")).sendKeys("jannat");
        driver.findElement(By.id("billing_phone")).sendKeys("0147258");
        driver.findElement(By.id("billing_email")).sendKeys("jannatenoor17@gmail.com");
        Select list = new Select(driver.findElement(By.id("billing_area")));
        list.selectByIndex(8);
        driver.findElement(By.id("billing_address_1")).sendKeys("Amar Bari, Uttara, Dhaka 1230.");
        driver.findElement(By.id("order_comments")).sendKeys("No comments.");
        sleep(10000);
    }

    public void sleep(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
