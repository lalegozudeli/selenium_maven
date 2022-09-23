package selenium_AhmetHoca.day_03;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_WebElementMethodlari {
    public static void main(String[] args) {
        /*
        1- amazon.com a gidip arama kutusunu locate edin
        2- arama kutusunun tagName inin input olduğunu test edin
        3- arama kutusunun name attribute nun değerlerinin field-keywords olduğunu test edin
         */

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1- amazon.com a gidip arama kutusunu locate edin
        driver.get("http://www.amazon.com");
       // WebElement aramaKutusu = driver.findElement(By)

    }
}
