import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class testAdress {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("http://a.testaddressbook.com/");

        //logIn
        driver.findElement(By.id("sign-in")).click();
        driver.findElement(By.name("session[email]")).sendKeys("Testmail@gmail.com");
        driver.findElement(By.name("session[password]")).sendKeys("TestPassword");
        driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();

        //addAdress
        driver.findElement(By.xpath("//*[@id=\"navbar\"]/div[1]/a[2]")).click();
        driver.findElement(By.xpath("/html/body/div/a")).click();
        driver.findElement(By.name("address[first_name]")).sendKeys("Max");
        driver.findElement(By.name("address[last_name]")).sendKeys("Zax");
        driver.findElement(By.name("address[address1]")).sendKeys("Mazurska");
        driver.findElement(By.name("address[address2]")).sendKeys("31");
        driver.findElement(By.name("address[city]")).sendKeys("Szczecin");
        driver.findElement(By.id("address_zip_code")).sendKeys("71-030");
        driver.findElement(By.id("address_country_us")).click();
        driver.findElement(By.name("address[birthday]")).sendKeys("14121995");
        driver.findElement(By.name("address[age]")).sendKeys("25");
        driver.findElement(By.name("address[website]")).sendKeys("http://a.testaddressbook.com/addresses/new");
        driver.findElement(By.name("address[phone]")).sendKeys("9369992");
        driver.findElement(By.id("address_interest_read")).click();
        driver.findElement(By.name("address[note]")).sendKeys("MyTestAdress");
        driver.findElement(By.name("commit")).click();

        //edit
        driver.findElement(By.xpath("/html/body/div/div[2]/a[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"address_note\"]")).sendKeys("Edited adress");
        driver.findElement(By.name("commit")).click();

        //destroy
        driver.findElement(By.xpath("//*[@id=\"navbar\"]/div[1]/a[2]")).click();
        driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[7]/a")).click();
        driver.switchTo().alert().accept();

        //logout

        driver.findElement(By.xpath("//*[@id=\"navbar\"]/div[1]/a[3]")).click();

        //
        









        Thread.sleep(5000);
        driver.close();
        driver.quit();




    }
}
