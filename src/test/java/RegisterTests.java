import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegisterTests {

    WebDriver driver;
    signUpAndRegisterPage registerPage;

    String URL = "https://automationexercise.com/";
    String name = "Abdallah";
    String email = "khalilabdalla620@gmail.com";
    String password = "abc1013";
    String dayOfBirth = "29";
    String monthOfBirth = "September";
    String yearOfBirth = "1990";
    String firstName = "Abdallah";
    String lastName = "Khalil";
    String company = "Siemens";
    String firstAddress = "Zamalek";
    String country = "Canada";
    String state = "Cairo";
    String city = "Cairo";
    String zipCode = "11153";
    String mobileNumber = "01197654387";
    String expectedRegistrationHeader = "Password *";
    String expectedSignUpText = "New User Signup!";
    String expectedAccountCreationHeader = "Continue";

    @BeforeMethod
    public void setUp(){
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        registerPage = new signUpAndRegisterPage(driver);
        registerPage.navigateToURL(URL);
        registerPage.clickSignUpTabButton();
    }

    @Test
    public void signUpTC01(){
        registerPage.assertOnSignUpHeader(expectedSignUpText);
        registerPage.fillSignUpData(name,email);
        registerPage.clickSignUpButton();
        registerPage.assertOnRegistrationPage(expectedRegistrationHeader);
        registerPage.selectTheFemaleGender();
        registerPage.fillPasswordTextField(password);
        registerPage.selectDayOfBirth(dayOfBirth);
        registerPage.selectMonthOfBirth(monthOfBirth);
        registerPage.selectYearOfBirth(yearOfBirth);
        registerPage.fillFirstNameTextField(firstName);
        registerPage.fillLastNameTextField(lastName);
        registerPage.fillCompanyTextField(company);
        registerPage.fillFirstAddressTextField(firstAddress);
        registerPage.selectCountry(country);
        registerPage.fillStateTextField(state);
        registerPage.fillCityTextField(city);
        registerPage.fillZipCodeTextField(zipCode);
        registerPage.fillMobileNumberTextField(mobileNumber);
        registerPage.clickCreateAccountButton();
        registerPage.assertOnAccountCreationPage(expectedAccountCreationHeader);
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
