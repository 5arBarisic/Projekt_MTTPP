import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlightForm extends PageObject{

    private final String cityFrom = "DUB";
    private final String cityTo = "SAN";
    private final String departDate = "20-10-2022";
    private final String returnDate = "10-11-2022";


    public FlightForm(WebDriver driver) {
        super(driver);
    }

    @FindBy(linkText = "Flights")
    private WebElement flightsBtn;

    @FindBy(name = "from")
    private WebElement searchFrom;

    @FindBy(name = "to")
    private WebElement searchTo;

    @FindBy(id = "round-trip")
    private WebElement selectRound;

    @FindBy(name = "depart")
    private WebElement searchDepart;

    @FindBy(name = "returning")
    private WebElement searchReturn;

    @FindBy(id = "flights-search")
    private WebElement searchBtn;

    public void pressFlightsButton(){
        flightsBtn.click();;
    }
    public void enterCityFrom(){
        this.searchFrom.sendKeys(cityFrom);  ;
    }

    public void enterCityTo(){
        this.searchTo.sendKeys(cityTo);
    }

    public void chooseRoundTrip(){
        this.selectRound.click();
    }

    public void enterDepartDate(){
        this.searchDepart.clear();
        this.searchDepart.sendKeys(departDate);
    }

    public void enterReturnDate(){
        this.searchReturn.clear();
        this.searchReturn.sendKeys(returnDate);
    }

    public void searchFlights(){
        this.searchBtn.click();
    }

}
