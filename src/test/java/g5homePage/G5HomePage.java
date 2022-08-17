package g5homePage;
import static org.testng.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class G5HomePage {

@Test

public void buildingTestMethod() {

System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");

WebDriver driver = new ChromeDriver();

driver.navigate().to("https://g5.gov/g5/home/");

String verifyG5Title = driver.getTitle();

assertEquals("Welcome to G5 - Department of Education",verifyG5Title);

}

}
