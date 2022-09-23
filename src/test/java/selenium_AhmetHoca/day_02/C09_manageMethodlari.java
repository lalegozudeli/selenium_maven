package selenium_AhmetHoca.day_02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C09_manageMethodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); // sayfanın yüklenmesi bitene kadar bekler.
        // girilen sürede sayfa tam olarak yüklenmezse hata verir.
        /*
        ilerde wait konusunu daha geniş alacağız.
        Bir sayfa acılırken , ilk başta sayfanın içersinde bulunan elementlere göre bir yüklenme süresine ihtiyaç vardır.
        veya bir web elementinin kullanılabilmesi için bir zamana ihtiyaç var. implicityWait bize sayfanın yüklenmesi
        ve sayfadaki elementlerin ulaşım için beklenecek maximum süreyi belirleme olanağı tanır.
         */
        Thread.sleep(15000); // yazılan süre bitene kadar bekler.
        driver.close();

    }
}
