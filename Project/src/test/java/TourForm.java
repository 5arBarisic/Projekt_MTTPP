import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TourForm extends PageObject{

    private final String currency = "EUR";
    private final String date = "20-10-2022";
    private final String numberOfAdults  = "2";
    private final String numberOfChildren  = "2";
    private final String numberOfInfants  = "1";


    public TourForm(WebDriver driver) {
        super(driver);
    }


    @FindBy(linkText = "Home")
    private WebElement homeBtn;

    @FindBy(xpath = "/html/body/header/div[1]/div/div/div[2]/div/div/div[2]/div/button")
    private WebElement currencyBtn;

    @FindBy(linkText = currency)
    private WebElement selectedCurrency;


    @FindBy(linkText = "Tours")
    private WebElement toursBtn;

    @FindBy(xpath = "/html/body/section[2]/div/div[2]/div[3]/a/div/div[1]/span")
    private WebElement tourImage;

    @FindBy(name = "date")
    private WebElement tourDate;

    @FindBy(name = "adults")
    private WebElement adults;


    @FindBy(name = "childs")
    private WebElement children;


    @FindBy(name = "infants")
    private WebElement infants;


    public void pressHomeButton(){
        homeBtn.click();;
    }
    public void searchCurrency(){
        this.currencyBtn.click();
    }

    public void chooseCurrency(){
        this.selectedCurrency.click();
    }

    public void pressToursButton(){
        toursBtn.click();;
    }

    public void pressTourImage(){
        this.tourImage.click();
    }

    public void enterDate(){
        this.tourDate.clear();
        this.tourDate.sendKeys(date);
        this.tourDate.click();
    }

    public void enterNumberOfAdults(){
        this.adults.sendKeys(numberOfAdults);
    }

    public void enterNumberOfChildren(){
        this.children.sendKeys(numberOfChildren);
    }
    public void enterNumberOfInfants(){
        this.infants.sendKeys(numberOfInfants);
    }

    public void pressSubmit(){
        this.tourDate.submit();
    }

}
