package selenium_AhmetHoca.day_02;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C07_manageMethodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        System.out.println("pencere olculeri : "+driver.manage().window().getSize());
        System.out.println("pencere konumu : "+driver.manage().window().getPosition());
        Thread.sleep(1000);

        driver.manage().window().setSize(new Dimension(500,500));
        driver.manage().window().setPosition(new Point(500,100));
        Thread.sleep(1000);

        System.out.println("pencerenin yeni olculeri : " + driver.manage().window().getSize());
        System.out.println("pencerenin yeni konumu : " + driver.manage().window().getPosition());


        driver.close();


    }
}
