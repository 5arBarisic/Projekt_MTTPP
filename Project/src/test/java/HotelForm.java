import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HotelForm extends PageObject{

    private final String cityName = "Paris";

    public HotelForm(WebDriver driver) {
        super(driver);
    }

    @FindBy(linkText = "Hotels")
    private WebElement hotelsBtn;

    @FindBy(id = "select2-hotels_city-container")
    private WebElement searchByCity;

    @FindBy(xpath = "//*[@id=\"fadein\"]/span/span/span[1]/input")
    private WebElement searchCityTxt;

    @FindBy(xpath = "//*[@id=\"select2-hotels_city-results\"]/li")
    private WebElement acceptCityTxt;

    @FindBy(className = "ladda-label")
    private WebElement searchBtn;




    public void pressHotelsButton(){
        this.hotelsBtn.click();
    }
    public void pressSearchByCity(){
        this.searchByCity.click();
    }

    public void enterCityName(){
        this.searchCityTxt.sendKeys(cityName);
    }

    public void acceptCity(){
        this.acceptCityTxt.click();
    }

    public void pressSearchButton(){
        this.searchBtn.click();
    }
}
