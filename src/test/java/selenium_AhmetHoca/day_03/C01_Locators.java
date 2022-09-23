package selenium_AhmetHoca.day_03;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Locators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        // Amazon a gidip nutella aratalım.
        driver.get("https://www.amazon.com");

        // findelement istediğimiz web elementini bize döndürür. bizde o web elementi kullanmak
        // için bir objeye assign ederiz.

        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));

        //herhangi bir web elementine istediğimiz yazıyı göndermek için
        aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);

        //WebElement aramaKutusu = driver.findElement(By)


    }
}
