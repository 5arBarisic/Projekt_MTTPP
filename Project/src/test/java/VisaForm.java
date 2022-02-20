import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VisaForm extends PageObject{

    private final String firstName = "Petar";
    private final String lastName = "Barisic";
    private final String email  = "PetarBarisic@gmail.com";
    private final String phone  = "031031031";
    private final String dateForVisa = "20-10-2022";


    public VisaForm(WebDriver driver) {
        super(driver);
    }

    @FindBy(linkText = "Visa")
    private WebElement visaBtn;

    @FindBy(className = "select2-selection__rendered")
    private WebElement countryFrom;

    @FindBy(xpath = "/html/body/span/span/span[2]/ul/li[3]")
    private WebElement selectCountryFrom;

    @FindBy(id = "select2-to_country-container")
    private WebElement countryTo;

    @FindBy(xpath = "/html/body/span/span/span[2]/ul/li[34]")
    private WebElement selectCountryTo;

    @FindBy(className = "ladda-label")
    private WebElement submitBtn;

    @FindBy(name = "first_name")
    private WebElement firstNameTxt;

    @FindBy(name = "last_name")
    private WebElement lastNameTxt;

    @FindBy(name = "email")
    private WebElement emailTxt;

    @FindBy(name = "phone")
    private WebElement phoneTxt;

    @FindBy(name = "date")
    private WebElement dateTxt;

    public void pressVisaButton(){
        visaBtn.click();;
    }
    public void searchCountryFrom(){
        this.countryFrom.click();
    }

    public void chooseCountryFrom(){
        this.selectCountryFrom.click();
    }

    public void searchCountryTo(){
        this.countryTo.click();
    }

    public void chooseCountryTo(){
        this.selectCountryTo.click();
    }

    public void pressSubmit(){
        this.submitBtn.click();
    }

    public void enterFirstName(){
        this.firstNameTxt.sendKeys(firstName);
    }
    public void enterLastName(){
        this.lastNameTxt.sendKeys(lastName);
    }

    public void enterEmail(){
        this.emailTxt.sendKeys(email);
    }
    public void enterPhone(){
        this.phoneTxt.sendKeys(phone);
    }

    public void enterDate(){
        this.dateTxt.clear();
        this.dateTxt.sendKeys(dateForVisa);
    }

}
