package selenium_AhmetHoca.day_02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_driverMethodlari {
    public static void main(String[] args) {

        // amazon sayfasına gidip kaynak kodlarında "spend less" yazdığını test edin

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com");
        String sayfaaranankodlari = driver.getPageSource();
        System.out.println(sayfaaranankodlari);
        String aranankelime = "Gateway";
        if( sayfaaranankodlari.contains(aranankelime)){
            System.out.println("aranan kelime testi PASSED");
        } else {
            System.out.println("aranan kelime testi FAILED");
        }
        driver.close();



    }
}
