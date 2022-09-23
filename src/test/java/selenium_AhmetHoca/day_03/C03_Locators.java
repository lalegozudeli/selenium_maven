package selenium_AhmetHoca.day_03;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C03_Locators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        /*
        Main method oluşturun ve aşağıdaki görevi tamalayın.
        a. http://a.testaddressbook.com adresine gidiniz.
        b.Sign in butonuna basın
        c. email textbox , password textbox , and signin button elementlerini locate ediniz.
        d. kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in) butonunu tıklayınız:
            i. Username: testtechproed@gmail.com
            ii. Password : Test1234!
        e. Expected user id nin testtechproed@gmail.com olduğunu doğrulayınız (verify).
        f. " Addresses" ve "Sing Out" textlerinin görüntülendiğini (displayed) doğrulayın (verify).
        g. sayfada kaç tane link olduğunu bulun.
         */

       // a. http://a.testaddressbook.com adresine gidiniz.
        driver.get("http://a.testaddressbook.com");

        //b.Sign in butonuna basın
        driver.findElement(By.id("sign-in")).click();

        //c. email textbox , password textbox , and signin button elementlerini locate ediniz.
        //d. kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in) butonunu tıklayınız:
        WebElement email = driver.findElement(By.id("session_email"));
        email.sendKeys("testtechproed@gmail.com");

        WebElement passWord = driver.findElement(By.id("session_password"));
        passWord.sendKeys("Test1234!");

        WebElement signIn = driver.findElement(By.name("commit"));
        signIn.click();

        //e. Expected user id nin testtechproed@gmail.com olduğunu doğrulayınız (verify).
        WebElement actualUserElementi = driver.findElement(By.className("navbar-text"));
        System.out.println(actualUserElementi.getText());
        String expectedUserMail = "testtechproed@gmail.com";

        // bir webelementin üzerinde ne yazdığını görmek istersek webelementinIsmi.getText() kullanırız.

        if(expectedUserMail.equals(actualUserElementi.getText())){
            System.out.println("User testi PASSED");
        }else {
            System.out.println("User testi : FAILED");
        }

        //f. " Addresses" ve "Sing Out" textlerinin görüntülendiğini (displayed) doğrulayın (verify).

        WebElement adressesElementi = driver.findElement(By.linkText("Addresses"));
        WebElement singOutElementi = driver.findElement(By.linkText("Sign out"));

        if(adressesElementi.isDisplayed()){
            System.out.println("Adresses testi PASSED");
        }else {
            System.out.println("Adresses testi FAILED");

        }

        if(singOutElementi.isDisplayed()){
            System.out.println("SignOut testi PASSED");
        }else {
            System.out.println("SignOut testi FAILED");

        }

        //g. sayfada kaç tane link olduğunu bulun.

        List<WebElement> linkListesi = driver.findElements(By.tagName("a"));
        System.out.println("Sayfadaki link sayisi : " + linkListesi.size());

        // h. linkleri yazdıralım.

        // listemiz web elementlerden oluştuğu için direk yazdıramayız onun yerine
        // for-each loop yapıp her bir link elementinin üzerindeki yazıyı yazdırmalıyız.
        // element olduğu için getText() demeyi unutmamalıyız.
        for (WebElement each:linkListesi
             ) {
            System.out.println(each.getText());
        }

        driver.close();
















    }

}
