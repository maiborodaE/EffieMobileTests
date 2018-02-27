package tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class EffieTestLogin {
    public static void main(String[] args) {

        //Set the Desired Capabilities
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "My Phone");
        caps.setCapability("udid", "310072c8b3d92300"); //Give Device ID of your mobile phone
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "5.1.1");
        caps.setCapability("appPackage", "effie.app.com.effie");
        caps.setCapability("appActivity", "com.main.activities.LoginActivity");
        caps.setCapability("noReset", "true");

        //Instantiate Appium Driver
        try {
            AppiumDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);

        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        }
    }
}
