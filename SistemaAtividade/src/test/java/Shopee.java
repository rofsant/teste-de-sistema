import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shopee {

    WebDriver webdriver;

    @BeforeEach
    public void criando(){
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
        webdriver = new ChromeDriver();
    }


    @Test
    public void shopeePaginaTeste (){

        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();

        webDriver.get("https://shopee.com.br");
        Assertions.assertEquals("https://shopee.com.br", webDriver.getCurrentUrl());
    }



//    @AfterEach
//    public void fechandoPaginas(){
//        web.close();
//    }
}
