package Credentials;

import Credentials.PersAssignCreden;
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
import Credentials.AuthLoginSynchCreden;
import org.openqa.selenium.By;

public class PersAssignCreden{


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


    @AfterTest
    public void tearDown(){
        driver.quit();
    }


    // login page
    public static String login = "effie.app.com.effie:id/input_login_la";
    public static String password = "effie.app.com.effie:id/input_password_la";
    public static String enter = "effie.app.com.effie:id/btn_login_la";

    //окошко сворачивать
    public static String hyde =  "effie.app.com.effie:id/action_show_panel";
    // ОК  -  Отмена
    public static String ok =  "effie.app.com.effie:id/btn_p";
    public static String cancel =  "effie.app.com.effie:id/btn_n";




    public static String startDay =  "effie.app.com.effie:id/buttonStartDay";
    // красная стрелочка на этапе Подготовка
    public static String nextStep =  "effie.app.com.effie:id/go_to_nextStep";
    //подготовка - шаг синронизации
    public static String synch =  "//android.widget.Button[@text = 'Синхронизация']";
    //подготовка - завершение этапа
    public static String endPhase =  "//android.widget.Button[@text = 'Синхронизация']";
    //Принять данные - чекбокс Все
    public static String getFull =  "effie.app.com.effie:id/sync_receive_full_option";
    //Принять данные - чекбокс Только текстовые
    public static String getText =  "effie.app.com.effie:id/sync_receive_text";
    //Принять данные - Принять \ Отмена
    public static String getOk =  "android:id/button1";
    public static String getCancel =  "android:id/button2";

    // Синхр. проводилась ХХХ мин назад, еще раз ? -Синхр.
    public static String synch2 =  "android:id/button2";
    // Пропустить
    public static String skip =  "android:id/button1";

//
//    public static String  =  "";
//    public static String  =  "";
//    public static String  =  "";
//    public static String  =  "";
//    public static String  =  "";
//    public static String  =  "";
//    public static String  =  "";
//    public static String  =  "";
//    public static String  =  "";
//    public static String  =  "";


}
