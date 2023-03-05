package com.juaracoding.appium.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class LapKeuangan {
    AndroidDriver<MobileElement> driver;
    public LapKeuangan(AndroidDriver<MobileElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this); }

//    @AndroidFindBy(id = "android:id/button1")
//    private MobileElement Btn;
//    @AndroidFindBy(id = "android:id/button2")
//    private MobileElement BtnTutup;
    @AndroidBy(id = "com.chad.financialrecord:id/fabMenu") //add
    MobileElement  BtnAdd;
    @AndroidBy(id = "com.chad.financialrecord:id/btnIncome")//income
    MobileElement  BtnPemasukan;
    @AndroidFindBy (id = "com.chad.financialrecord:id/tvDate")//tanggal
    MobileElement  BtnTanggal;
    @AndroidFindBy(xpath = "\t\n" + "//android.view.View[@content-desc=\"03 Maret 2023\"]")//tanggal
    MobileElement  TglTigaMaret;
    @AndroidFindBy(id = "android:id/button1")//ok text
    MobileElement BtnOk;
    @AndroidFindBy(id = "com.chad.financialrecord:id/spCategory")//category- list
     MobileElement ListBtn;
    @AndroidFindBy(id = "com.chad.financialrecord:id/tvName")//framelayout - result list 2- deviden
    MobileElement ListOk;
    @AndroidFindBy(id = "com.chad.financialrecord:id/etAmount")//jumlah 500000 (500)- text
    MobileElement Amount;
    @AndroidFindBy(id = "com.chad.financialrecord:id/etNote")//notetambahan - text
    MobileElement  notes;
    @AndroidFindBy(id = "com.chad.financialrecord:id/btSave")//save
    MobileElement  BtnSave;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout")//home
    MobileElement  Layout;

       //pengeluaran
  //  @AndroidBy(id = "com.chad.financialrecord:id/fabMenu") //add
    //private MobileElement  BtnPemasukan;
    @AndroidFindBy(id = "com.chad.financialrecord:id/btnExpense") //pengeluaran
    MobileElement  AddExpense;
    @AndroidFindBy(xpath = "By(xpath = \"\\t\\n\" + \"//android.view.View[@content-desc=\\\"05 Maret 2023\\\"]\");//tanggal")//tanggal
    MobileElement  TglLimaMaret;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[8]/android.widget.LinearLayout/android.widget.TextView\"")//category- list
    MobileElement  pulsa;

//    @AndroidFindBy(id = "com.chad.financialrecord:id/etAmount")//jumlah 100000 (100)- text
//    @AndroidBy(id = "com.chad.financialrecord:id/calc_btn_22t")//btn 5 - clik
//    @AndroidBy(id = "com.chad.financialrecord:id/calc_btn_24t")//btn 0 - clik
//    @AndroidBy(id = "com.chad.financialrecord:id/calc_btn_13t")//btn 1 - clik
//    @AndroidBy(id = "com.chad.financialrecord:id/calc_btn_okt")//btn ok - clik
//    @AndroidBy(id = "com.chad.financialrecord:id/calc_txv_value")//hasil cals - Result must be positive
    @AndroidBy(id = "com.chad.financialrecord:id/etNote")//notekuota - text
    MobileElement  noteKuota;
    @AndroidFindBy(id = "com.chad.financialrecord:id/tvBalance")//balace = pemasukan - pengeluaran
    MobileElement  Balance;

    public void Income () {
        BtnAdd.click();
        BtnPemasukan.click();
        BtnTanggal.click();
        TglTigaMaret.click();
        BtnOk.click();
        ListBtn.click();
        ListOk.click();
        Amount.click();
        notes.click();
        BtnSave.click();
        Layout.click();
    }

    public void Expances (){
        BtnAdd.click();
        AddExpense.click();
        BtnTanggal.click();
        TglLimaMaret.click();
        BtnOk.click();
        ListBtn.click();
        ListOk.click();
        Amount.click();
        pulsa.click();
        noteKuota.click();
        BtnSave.click();
        Layout.click();
    }
    public String addSaldoMasuk(){
        return Amount.getText(); }
    public String addSaldoKeluar(){
        return Amount.getText(); }

    public String addBalance(){
        return Balance.getText(); }

    }

