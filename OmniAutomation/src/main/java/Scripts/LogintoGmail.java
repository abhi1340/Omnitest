package Scripts;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.junit.Assert;
import org.junit.Test;

import static ObjectRepository.LoginPage.*;
import static com.omnitest.omni.Actions.*;
import static com.omnitest.omni.DriverFactory.getDriver;
import static com.omnitest.omni.DriverFactory.initChromeDriver;

/**
 * Created by vchilukuri on 8/28/17.
 */
public class LogintoGmail  {

    ExtentReports extent;
    ExtentTest test;

    @Test
    public void logintest() throws Exception {

            initChromeDriver(System.getProperty("os.name").toLowerCase());
            openapplication("https://www.gmail.com");
            type(email_text, "omnitestautomation");
            Assert.assertEquals(email_text, "New One");
            click(next_btn);
            Thread.sleep(1000);
            type(pass_text, "framework");
            Thread.sleep(1000);
            click(sign_btn);
            Thread.sleep(1000);
            click(sign_header_btn);
            Thread.sleep(1000);
            click(logout_btn);
            getDriver().quit();

    }
}