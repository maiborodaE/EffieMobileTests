package tests;

import com.google.common.base.Predicate;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.SECONDS;

public class EffieTestLogin {
    public static void main(String[] args) throws InterruptedException {
        AppiumDriver<MobileElement> driver = null;
//        WebDriverWait wait = new WebDriverWait(driver, 3);


        //Set the Desired Capabilities
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "My Phone");
        caps.setCapability("udid", "310072c8b3d92300"); //Give Device ID of your mobile phone
//        caps.setCapability("udid", "10.8.168.41:4444"); //Give Device wifiAsnova of your mobile phone
//        caps.setCapability("udid", "192.168.43.40:4444"); //Give Device wifiMezu of your mobile phone
//        caps.setCapability("udid", "10.0.3.232:4444"); //Give Device wi seleniumcamp of your mobile phone


        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "5.1.1");
        caps.setCapability("appPackage", "effie.app.com.effie");
        caps.setCapability("appActivity", "effie.app.com.effie.main.activities.LoginActivity");
        caps.setCapability("noReset", false);

        //Instantiate Appium Driver
        try {
            driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);

        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        }
        //Added 5 seconds wait so that the app loads completely before starting with element identification
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


//        driver.manage().timeouts().implicitlyWait(60,  TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, 120);


        //Find element using ID property
        driver.findElement(By.id("effie.app.com.effie:id/input_login_la")).clear();
        driver.findElement(By.id("effie.app.com.effie:id/input_login_la")).sendKeys("u0mc1@ipland.com.ua");
        driver.findElement(By.id("effie.app.com.effie:id/input_password_la")).sendKeys("testPass");
        driver.findElement(By.id("effie.app.com.effie:id/btn_login_la")).click();
        Thread.sleep(2000);
//        WebElement fingerButton = wait.until(ExpectedConditions.visibilityOf(

//                fingerButton.click();
        driver.findElement(By.id("effie.app.com.effie:id/buttonStartDay")).click();
        driver.findElement(By.id("effie.app.com.effie:id/step_button")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("effie.app.com.effie:id/sync_receive_text")).click();


//        driver.findElement(By.id("effie.app.com.effie:id/btn_p")).click();
        driver.findElement(By.id("android:id/button1")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("effie.app.com.effie:id/btn_p")).click();
        Thread.sleep(20000);


//             driver.wait(ExpectedConditions.visibilityOf(driver.findElement(By.id("wdf"))));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("effie.app.com.effie:id/btn_p"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.View/android.widget.LinearLayout[2]/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.view.View/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.Button"))).click();
        driver.findElement(By.id("effie.app.com.effie:id/btn_p")).click();

        int i = 4;

while (i < 100) {
//finger:

    driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.View/android.widget.LinearLayout[2]/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.view.View/android.view.View/android.widget.ImageButton")).click();
    Thread.sleep(2000);
    driver.findElement(By.id("effie.app.com.effie:id/add_point_to_route")).click();
    driver.findElement(By.id("effie.app.com.effie:id/tt_layout_clicker")).click();
    driver.findElement(By.id("effie.app.com.effie:id/btn_p")).click();
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.View/android.widget.LinearLayout[2]/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.view.View/android.view.View/android.widget.ImageButton"))).click();
    driver.findElement(By.id("effie.app.com.effie:id/sync_additional_points")).click();
    driver.findElement(By.id("effie.app.com.effie:id/btn_p")).click();
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("effie.app.com.effie:id/btn_p"))).click();
    //Нужно дописать скролл вниз, чтобы потом находить ТТ внизу
    MobileElement element = driver.findElement(MobileBy.AndroidUIAutomator(
            "new UiScrollable(new UiSelector().resourceId(\"com.android.vending:id/data_view\")).scrollIntoView("
                    + "new UiSelector().textContains(\"You\").instance(2))"));
    //Возможно поиск по нумерации:
    driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/" +
            "android.support.v4.widget.DrawerLayout/android.view.View/android.widget.LinearLayout[2]/" +
            "android.widget.LinearLayout[2]/android.widget.FrameLayout/android.view.View/android.widget.LinearLayout/" +
            "android.support.v7.widget.RecyclerView/android.widget.LinearLayout["+i+"]/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout")).click();
    driver.sc

    //    driver.findElement(By.xpath("//android.widget.TextView[@text = 'г.Днепр,ул. Артема, 21-а']")).click();
    driver.findElement(By.id("effie.app.com.effie:id/btn_p")).click();
    driver.findElement(By.xpath("//android.widget.CheckedTextView[@text = 'Плановый визит']")).click();
    driver.findElement(By.id("effie.app.com.effie:id/btn_p")).click();
    driver.findElement(By.xpath("//android.widget.Button[@text = 'Анкета после релиза (отчетность)']")).click();
    driver.findElement(By.xpath("//android.widget.TextView[@text = 'флагтест']")).click();
    driver.findElement(By.id("effie.app.com.effie:id/drop_down_answer")).click();
    driver.findElement(By.xpath("//android.widget.TextView[@text = 'Да']")).click();
    driver.findElement(By.id("effie.app.com.effie:id/imagePhotoButton")).click();
    driver.findElement(By.id("MENUID_CAMERA_MODE")).click();
    Thread.sleep(2000);
    driver.findElement(By.id("MENUID_SHUTTER")).click();
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.sec.android.app.camera:id/okay"))).click();
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("effie.app.com.effie:id/action_preview_done"))).click();
    //okButton
    driver.findElement(By.id("effie.app.com.effie:id/btn_p")).click();
    driver.findElement(By.xpath("//android.widget.Button[@text = 'Завершение этапа']")).click();
    driver.findElement(By.id("effie.app.com.effie:id/btn_p")).click();
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("android:id/button1"))).click();
    i++;
}

    }





}
