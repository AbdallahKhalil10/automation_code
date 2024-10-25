import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;

public class productPage {
    WebDriver driver;

    //Constructor
    public productPage(WebDriver driver){
        this.driver = driver;
    }

    //Element Locators
    private By productTabButton = By.xpath("//a[@href=\"/products\"]");
    private By productSearchBar = By.xpath("//input[@id=\"search_product\"]");
    private By productSearchButton = By.xpath("//i[@class=\"fa fa-search\"]");
    private By addToCartButton = By.xpath("//div[@class=\"productinfo text-center\"]//a");
    private By cartFirstHeader = By.xpath("//h4[@class=\"modal-title w-100\"]");
    private By cartSecondHeader = By.xpath("//p[@class=\"text-center\"]");
    private By cartThirdHeader = By.xpath("//p[@class=\"text-center\"]//a");
    private By cartFourthHeader = By.xpath("//button[@class=\"btn btn-success close-modal btn-block\"]");
    private By addToCartPopUp = By.xpath("//div[@class=\"modal-content\"]");



    //Actions
    public void navigateToURL(String URL){
        driver.get(URL);
    }

    public void clickOnProductTabButton(){
        driver.findElement(productTabButton).click();
    }

    public void searchTheProduct(String productName){
        driver.findElement(productSearchBar).sendKeys(productName);
    }

    public void clickOnThSearchButton(){
        driver.findElement(productSearchButton).click();
    }

    public void addToCart(){
        driver.findElement(addToCartButton).click();
    }


    //Assertions
    public void assertOnProductPage(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement searchButton = wait.until(ExpectedConditions.visibilityOfElementLocated(productSearchButton));
        Assert.assertTrue(searchButton.isDisplayed());
    }

    public void assertOnPopUp(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement popUp = wait.until(ExpectedConditions.visibilityOfElementLocated(addToCartPopUp));
        Assert.assertTrue(popUp.isDisplayed());
    }

    public void assertOnAddedText(String expectedCartFirstHeader){
        String actualCartFirstHeader = driver.findElement(cartFirstHeader).getText();
        Assert.assertEquals(actualCartFirstHeader, expectedCartFirstHeader);
    }

    public void assertOnMessageText(String expectedCartSecondHeader){
        String actualCartSecondHeader = driver.findElement(cartSecondHeader).getText();
        Assert.assertEquals(actualCartSecondHeader, expectedCartSecondHeader);
    }

    public void assertOnViewCartText(String expectedCartThirdHeader){
        String actualCartThirdHeader = driver.findElement(cartThirdHeader).getText();
        Assert.assertEquals(actualCartThirdHeader, expectedCartThirdHeader);
    }

    public void assertOnContinueShoppingButtonText(String expectedCartFourthHeader){
        String actualCartFourthHeader = driver.findElement(cartFourthHeader).getText();
        Assert.assertEquals(actualCartFourthHeader, expectedCartFourthHeader);
    }

    public void assertOnContinueShoppingButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement continueShoppingButton = wait.until(ExpectedConditions.visibilityOfElementLocated(addToCartPopUp));
        Assert.assertTrue(continueShoppingButton.isDisplayed());
    }


}
