package initialSanityTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class HomeLogIn {

@Test

public void errorLoginTest() {

System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");

WebDriver driver = new ChromeDriver();

String baseUrl = "https://g5.gov/g5/home/";
String expectedTitle = "Welcome to G5 - Department of Education";
String actualTitle = "";

driver.get(baseUrl);
actualTitle = driver.getTitle();

//driver.findElement(By.id("ContinuetoG5")).click();
driver.findElement(By.id("userid")).click();
driver.findElement(By.id("userid")).clear();
driver.findElement(By.id("userid")).sendKeys("test@email.com");
driver.findElement(By.id("password")).click();
driver.findElement(By.id("password")).clear();
driver.findElement(By.id("password")).sendKeys("password");
driver.findElement(By.id("loginButton")).click();

if (actualTitle.contentEquals(expectedTitle)){
    System.out.println("Test Passed!");
} else {
    System.out.println("Test Failed");
}

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//close Chrome
driver.close();
}

}
