package selenium_AhmetHoca.day_02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_IlkTest {
    public static void main(String[] args) {
        /*
            1- http://www.roblox.com url sine gidin
            2- başlığın Roblox kelimesi içerip içermediğini test edin.
            3- Url in "http://www.roblox.com" a esit olduğunu test edin
            4- sayfayı kapatın
         */
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //1- http://www.roblox.com url sine gidin
        driver.get("http://www.roblox.com");

        //2- başlığın Roblox kelimesi içerip içermediğini test edin.
        String actualTitle = driver.getTitle();
        String arananKelime = "Roblok";
        if (actualTitle.contains(arananKelime)) {
            System.out.println("Title testi PASSED ");
        } else{
            System.out.println(arananKelime + " kelimesi title ile aynı değil. Title testi FAILED ");
        }

        //3- Url in "http://www.roblox.com" a esit olduğunu test edin
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl="https://www.roblox.com/";
        if (actualUrl.equals(expectedUrl)){
            System.out.println("Url testi PASSED ");
        }else{
            System.out.println("actuelUrl : " + actualUrl + " den farklı. Test FAILED. ");
        }

        //4- sayfayı kapatın

        driver.close();


    }
}