package com.juaracoding.appium;

import com.juaracoding.appium.pages.LapKeuangan;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class TestLapKeuangan {
    private static AndroidDriver<MobileElement> driver;
    private LapKeuangan lapKeuangan;

    @BeforeClass
    public void setUp () throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Pixel_2_API_30");
        capabilities.setCapability("udid", "emulator-5554");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "11.0");
        capabilities.setCapability("appPackage", "com.chad.financialrecord");
        capabilities.setCapability("appActivity", "com.rookie.catatankeuangan.feature.splash.SplashActivity");

        driver = new AndroidDriver<MobileElement> (new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }

    @BeforeMethod
    public void pageObject() {
        lapKeuangan = new LapKeuangan(driver);
    }


    @Test
    public void Test1 (){
        lapKeuangan.Income();
        System.out.println(" Saldo : "+ lapKeuangan.addSaldoMasuk());
        Assert.assertEquals(lapKeuangan.addSaldoMasuk(),"300000");
    }
    @Test
    public void Test2 () {
        lapKeuangan.Expances();
        System.out.println(" Jumlah Pengeluaran : " + lapKeuangan.addSaldoKeluar());
        System.out.println(" Sisa Saldo : " + lapKeuangan.addBalance());
        Assert.assertEquals(lapKeuangan.addSaldoKeluar(), "100000");
        Assert.assertEquals(lapKeuangan.addBalance(), "200000");
    }

    @AfterClass
    public void closeApp() {
        driver.quit();
    }
}
