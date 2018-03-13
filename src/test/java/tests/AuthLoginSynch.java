package tests;


import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import Credentials.AuthLoginSynchCreden;
import org.openqa.selenium.By;

public class AuthLoginSynch extends AuthLoginSynchCreden {

    public AndroidDriver driver;
    @BeforeTest
    public void AndroidSetup() throws MalformedURLException {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("platformVersion", "");
        dc.setCapability("deviceName", "Android");
        dc.setCapability("appPackage", "effie.app.com.effie");
        dc.setCapability("appActivity", "effie.app.com.effie.main.activities.LoginActivity");
        dc.setCapability("noReset", false);
        driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), dc);
    }
//    @AfterTest
//    public void tearDown(){
//        driver.quit();
//    }


    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);



    @Test
    public void addOperationTest() throws InterruptedException {


        //  driver.switchTo().alert().accept();
// логин
        driver.findElement(By.id("effie.app.com.effie:id/input_login_la")).clear();
        driver.findElement(By.id("effie.app.com.effie:id/input_login_la")).sendKeys("u0auto1@effie.ua");
        driver.findElement(By.id("effie.app.com.effie:id/input_password_la")).sendKeys("testPass");
        driver.findElement(By.id("effie.app.com.effie:id/btn_login_la")).click();
        Thread.sleep(2000);

//Начать рабочий день
        driver.findElement(By.id("effie.app.com.effie:id/buttonStartDay")).click();


//синхрон
        driver.findElement(By.xpath(synch)).click();
        Thread.sleep(2000);
        //принять текст данн
        driver.findElement(By.id(getText)).click();
        driver.findElement(By.id(getOk)).click();
        Thread.sleep(2000);
        driver.findElement(By.id(ok)).click();
        Thread.sleep(20000);
        driver.findElement(By.id(ok)).click();
        Thread.sleep(20000);
//баговый синхрон
        driver.findElement(By.xpath(synch)).click();
        driver.findElement(By.id(skip)).click();
//заверншение этапа подготовки
        driver.findElement(By.xpath(endPhase)).click();
    }

}
