import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.lcwaikiki.com/tr-TR/TR");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.className("dropdown-label")).click(); //giris yap
        driver.findElement(By.cssSelector(".login-form__link")).click();  //üye kayıt

        driver.findElement(By.cssSelector("#RegisterFormView_RegisterEmail")).sendKeys("yanlismail@mail.com");
        driver.findElement(By.cssSelector("#RegisterFormView_Password")).sendKeys("1234");
        driver.findElement(By.cssSelector(".button.bc-blue.register-button-link.submit-button")).click();

        String Metin = driver.findElement (By.cssSelector("#RegisterFormView_Password-error")).getText();
        System.out.println(Metin);


    }
}
