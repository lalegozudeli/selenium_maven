package selenium_AhmetHoca.day_02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C06_navigate {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://www.amazon.com");
        Thread.sleep(2000);

        driver.navigate().to("https://www.roblox.com");
        Thread.sleep(2000);

        // amazon a geri dönmek için bir daha adresi yazmamıza gerek yok.
        driver.navigate().back();
        Thread.sleep(2000);

        // yeniden roblox a dönelim
        driver.navigate().forward();
        Thread.sleep(2000);

        // refresh yapalım
        driver.navigate().refresh();
        Thread.sleep(2000);

        driver.close();


    }
}
