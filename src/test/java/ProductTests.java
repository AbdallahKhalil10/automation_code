import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProductTests {
    WebDriver driver;
    productPage productPage;

    String URL = "https://automationexercise.com/";
    String productName = "blue top";
    String expectedAddedText = "Added!";
    String expectedText = "Your product has been added to cart.";
    String expectedViewCartText = "View Cart";
    String expectedContinueShoppingButtonText = "Continue Shopping";

    @BeforeMethod
    public void setUp(){
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        productPage = new productPage(driver);
        productPage.navigateToURL(URL);
        productPage.clickOnProductTabButton();
    }

    @Test
    public void productTC01(){
        productPage.assertOnProductPage();
        productPage.searchTheProduct(productName);
        productPage.clickOnThSearchButton();
        productPage.addToCart();
        productPage.assertOnPopUp();
        productPage.assertOnAddedText(expectedAddedText);
        productPage.assertOnMessageText(expectedText);
        productPage.assertOnViewCartText(expectedViewCartText);
        productPage.assertOnContinueShoppingButtonText(expectedContinueShoppingButtonText);
        productPage.assertOnContinueShoppingButton();

    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
