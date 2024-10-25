import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.time.Duration;

public class signUpAndRegisterPage {

        WebDriver driver;

        //Constructor
        public signUpAndRegisterPage(WebDriver driver){
            this.driver = driver;
        }



//------------------------------------------------------------------------------------------------------
        //Element Locators
        private By loginTabButton = By.xpath("//a[@href=\"/login\"]");
        private By signUpHeader = By.xpath("//div[@class=\"signup-form\"]//h2");
        private By signUpNameTextField = By.xpath("//input[@data-qa=\"signup-name\"]");
        private By signUpEmailTextField = By.xpath("//input[@data-qa=\"signup-email\"]");
        private By signUpButton = By.xpath("//button[@data-qa=\"signup-button\"]");
        private By maleRadioButton = By.xpath("//div[@id=\"uniform-id_gender1\"]");
        private By femaleRadioButton = By.xpath("//div[@id=\"uniform-id_gender2\"]");
        private By passwordHeader = By.xpath("//label[@for=\"password\"]");
        private By regiterPasswordTextField = By.xpath("//input[@id=\"password\"]");
        private By dayOfBirthDragAndDropMenu = By.xpath("//select[@id=\"days\"]");
        private By monthOfBirthDragAndDropMenu = By.xpath("//select[@id=\"months\"]");
        private By yearOfBirthDragAndDropMenu = By.xpath("//select[@id=\"years\"]");
        private By regiterFirstNameTextField = By.xpath("//input[@id=\"first_name\"]");
        private By regiterLastNameTextField = By.xpath("//input[@id=\"last_name\"]");
        private By companyTextField = By.xpath("//input[@id=\"company\"]");
        private By firstAddressTextField = By.xpath("//input[@id=\"address1\"]");
        private By secondAddressTextField = By.xpath("//input[@id=\"address2\"]");
        private By countryDragAndDropMenu = By.xpath("//select[@id=\"country\"]");
        private By stateTextField = By.xpath("//input[@id=\"state\"]");
        private By cityTextField = By.xpath("//input[@id=\"city\"]");
        private By zipCodeTextField = By.xpath("//input[@data-qa=\"zipcode\"]");
        private By mobileNumberTextField= By.xpath("//input[@id=\"mobile_number\"]");
        private By createAccountButton = By.xpath("//button[@data-qa=\"create-account\"]");
        private By accountCreationHeader = By.xpath("//a[@data-qa=\"continue-button\"]");



//------------------------------------------------------------------------------------------------------
    //Actions
        public void navigateToURL(String URL){
            driver.get(URL);
        }

        public void clickSignUpTabButton(){
            driver.findElement(loginTabButton).click();
        }

        public void fillNameTextField(String name){
            driver.findElement(signUpNameTextField).sendKeys(name);
        }

        public void fillEmailTextField(String email){
            driver.findElement(signUpEmailTextField).sendKeys(email);
        }

        public void fillSignUpData(String name, String email){
            fillNameTextField(name);
            fillEmailTextField(email);
        }

        public void clickSignUpButton(){
            driver.findElement(signUpButton).click();
        }

        public void selectTheMaleGender(){
            driver.findElement(maleRadioButton).click();
        }

        public void selectTheFemaleGender(){
            driver.findElement(femaleRadioButton).click();
        }

         public void fillPasswordTextField(String password){
             driver.findElement(regiterPasswordTextField).sendKeys(password);
        }

        public void selectDayOfBirth(String dayOfBirth){
            WebElement dropdownElement = driver.findElement(dayOfBirthDragAndDropMenu);
            Select dropdown = new Select(dropdownElement);
            dropdown.selectByVisibleText(dayOfBirth);
        }

        public void selectMonthOfBirth(String monthOfBirth){
            WebElement dropdownElement = driver.findElement(monthOfBirthDragAndDropMenu);
            Select dropdown = new Select(dropdownElement);
            dropdown.selectByVisibleText(monthOfBirth);
        }

        public void selectYearOfBirth(String yearOfBirth){
            WebElement dropdownElement = driver.findElement(yearOfBirthDragAndDropMenu);
            Select dropdown = new Select(dropdownElement);
            dropdown.selectByVisibleText(yearOfBirth);
        }

        public void fillFirstNameTextField(String firstName){
            driver.findElement(regiterFirstNameTextField).sendKeys(firstName);
        }

        public void fillLastNameTextField(String lastName){
            driver.findElement(regiterLastNameTextField).sendKeys(lastName);
        }

        public void fillCompanyTextField(String company){
            driver.findElement(companyTextField).sendKeys(company);
        }

        public void fillFirstAddressTextField(String firstAddress){
            driver.findElement(firstAddressTextField).sendKeys(firstAddress);
        }

        public void fillSecondAddressTextField(String secondAddress){
            driver.findElement(secondAddressTextField).sendKeys(secondAddress);
        }

        public void selectCountry(String country){
            WebElement dropdownElement = driver.findElement(countryDragAndDropMenu);
            Select dropdown = new Select(dropdownElement);
            dropdown.selectByVisibleText(country);
        }

        public void fillStateTextField(String state){
            driver.findElement(stateTextField).sendKeys(state);
        }

        public void fillCityTextField(String city){
            driver.findElement(cityTextField).sendKeys(city);
        }

        public void fillZipCodeTextField(String zipCode){
            driver.findElement(zipCodeTextField).sendKeys(zipCode);
        }

        public void fillMobileNumberTextField(String mobileNumber){
            driver.findElement(mobileNumberTextField).sendKeys(mobileNumber);
        }

        public void clickCreateAccountButton(){
            driver.findElement(createAccountButton).click();
//            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//            WebElement accountCreatedHeader = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[@data-qa='account-created']")));

        }




//-----------------------------------------------------------------------------------------------
        //Assertions
        public void assertOnSignUpHeader(String expectedSignUpText){
            String actualSignUpText =  driver.findElement(signUpHeader).getText();
            Assert.assertEquals(actualSignUpText,expectedSignUpText);
        }

        public void assertOnRegistrationPage(String expectedText){
            String actualText =  driver.findElement(passwordHeader).getText();
            Assert.assertEquals(actualText,expectedText);
        }

        public void assertOnAccountCreationPage(String expectedAccountCreationHeader){
            String actualAccountCreationHeader =  driver.findElement(accountCreationHeader).getText();
            Assert.assertEquals(actualAccountCreationHeader,expectedAccountCreationHeader);
        }
    }


//private By registerHeader = By.xpath("//b[contains (text(), ‘ENTER ACCOUNT INFORMATION\n’)]");
//private By nameHeader = By.xpath("//label[@for=\"name\"]");
//private By regiterNameTextField = By.xpath("//input[@id=\"name\"]");
//private By emailHeader = By.xpath("//label[@for=\"email\"]");
//private By regiterEmailTextField = By.xpath("//input[@id=\"email\"]");
//private By titleHeader = By.xpath("//label[contains (text(), ‘Title’)]");
//private By dateOfBirthHeader = By.xpath("//div[@class=\"form-group\"]//label");
//private By secondRegisterHeader = By.xpath("//b[contains (text(), ‘ADDRESS INFORMATION’)]");
//private By firstNameHeader = By.xpath("//label[@for=\"first_name\"]");
//private By lastNameHeader = By.xpath("//label[@for=\"last_name\"]");
//private By companyHeader = By.xpath("//label[@for=\"company\"]");
//private By firstAddressHeader = By.xpath("//label[@for=\"address1\"]");
//private By secondAddressHeader = By.xpath("//label[@for=\"address2\"]");
//private By countryHeader = By.xpath("//label[@for=\"country\"]");
//private By stateHeader = By.xpath("//label[@for=\"state\"]");
//private By cityHeader = By.xpath("//label[@for=\"city\"]");
//private By zipCodeHeader = By.xpath("//label[@for=\"zipcode\"]");
//private By mobileNumberHeader = By.xpath("//label[@for=\"mobile_number\"]");



//        public void ValidateSecondRegisterText(String expectedRegisterText){
//            String actualSignUpText =  driver.findElement(secondRegisterHeader).getText();
//            Assert.assertEquals(actualSignUpText,expectedRegisterText);
//        }
//
//        public void ValidateTitleHeader(String expectedTitleText){
//            String actualTitleText =  driver.findElement(titleHeader).getText();
//            Assert.assertEquals(actualTitleText,expectedTitleText);
//        }
//
//        public void ValidateMaleHeader(String expectedMaleText){
//            String actualMaleText =  driver.findElement(maleRadioButton).getText();
//            Assert.assertEquals(actualMaleText,expectedMaleText);
//        }
//
//        public void ValidateFemaleHeader(String expectedFemaleText){
//            String actualFemaleText =  driver.findElement(femaleRadioButton).getText();
//            Assert.assertEquals(actualFemaleText,expectedFemaleText);
//        }
//
//        public void ValidateNameHeader(String expectedNameHeader){
//            String actualNameHeader =  driver.findElement(nameHeader).getText();
//            Assert.assertEquals(actualNameHeader,expectedNameHeader);
//        }
//
//        public void ValidateEmailHeader(String expectedEmailHeader){
//            String actualEmailHeader =  driver.findElement(emailHeader).getText();
//            Assert.assertEquals(actualEmailHeader,expectedEmailHeader);
//        }
//
//        public void ValidatePasswordHeader(String expectedPasswordHeader){
//            String actualPasswordHeader =  driver.findElement(passwordHeader).getText();
//            Assert.assertEquals(actualPasswordHeader,expectedPasswordHeader);
//        }
//
//        public void ValidateDateOfBirthHeader(String expectedDateOfBirthHeader){
//            String actualDateOfBirthHeader =  driver.findElement(dateOfBirthHeader).getText();
//            Assert.assertEquals(actualDateOfBirthHeader,expectedDateOfBirthHeader);
//        }
//
//        public void ValidateDayOfBirthHeader(String expectedDayOfBirthHeader){
//            String actualDayOfBirthHeader =  driver.findElement(dayOfBirthDragAndDropMenu).getText();
//            Assert.assertEquals(actualDayOfBirthHeader,expectedDayOfBirthHeader);
//        }
//
//        public void ValidateMonthOfBirthHeader(String expectedMonthOfBirthHeader){
//            String actualMonthOfBirthHeader =  driver.findElement(monthOfBirthDragAndDropMenu).getText();
//            Assert.assertEquals(actualMonthOfBirthHeader,expectedMonthOfBirthHeader);
//        }
//
//        public void ValidateYearOfBirthHeader(String expectedYearOfBirthHeader){
//            String actualYearOfBirthHeader =  driver.findElement(yearOfBirthDragAndDropMenu).getText();
//            Assert.assertEquals(actualYearOfBirthHeader,expectedYearOfBirthHeader);
//        }
//
//        public void ValidateFirstNameHeaderHeader(String expectedFirstNameHeader){
//            String actualFirstNameHeader =  driver.findElement(firstNameHeader).getText();
//            Assert.assertEquals(actualFirstNameHeader,expectedFirstNameHeader);
//        }


