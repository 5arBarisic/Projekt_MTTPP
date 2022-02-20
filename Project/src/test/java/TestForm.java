import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;


public class TestForm {

    public WebDriver driver;

    public String testURL = "https://www.phptravels.net/login";


    @BeforeMethod
    public void setupTest() {
//                       ----For Google Chrome----
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();

//                       ----For Mozilla Firefox----
        /*System.setProperty("webdriver.firefox.driver", "geckodriver.exe");
        driver= new FirefoxDriver();*/

//                       ----For Microsoft Edge----
        /*System.setProperty("webdriver.edge.driver", "msedgedriver.exe");
        driver= new EdgeDriver();*/

        driver.navigate().to(testURL);
    }
    @Test
    public void t1_loginTest() throws InterruptedException {
        driver.manage().window().maximize();
        WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("email")));
        LoginForm loginForm= new LoginForm(driver);
        loginForm.enterEmail();
        Thread.sleep(1000);
        loginForm.enterPassword();
        Thread.sleep(1000);
        loginForm.pressLoginButton();
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Logout")));

    }
    @Test
    public void t2_searchHotelTest() throws InterruptedException {
        driver.manage().window().maximize();
        t1_loginTest();
        WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(3));
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Hotels")));
        HotelForm hotelForm= new HotelForm(driver);
        hotelForm.pressHotelsButton();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("select2-hotels_city-container")));
        hotelForm.pressSearchByCity();
        Thread.sleep(1000);
        hotelForm.enterCityName();
        Thread.sleep(1000);
        hotelForm.acceptCity();
        Thread.sleep(1000);
        hotelForm.pressSearchButton();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("form-control")));
    }

    @Test
    public void t3_searchFlightTest() throws InterruptedException {
        t1_loginTest();
        WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(3));
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Flights")));
        FlightForm flightForm= new FlightForm(driver);
        flightForm.pressFlightsButton();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("from")));
        flightForm.enterCityFrom();
        Thread.sleep(1000);
        flightForm.enterCityTo();
        Thread.sleep(1000);
        flightForm.chooseRoundTrip();
        Thread.sleep(1000);
        flightForm.enterDepartDate();
        Thread.sleep(1000);
        flightForm.enterReturnDate();
        Thread.sleep(1000);
        flightForm.searchFlights();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("type")));
    }
    @Test
    public void t4_submitVisaTest() throws InterruptedException {
        t1_loginTest();
        WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(3));
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Visa")));
        VisaForm visaForm=new VisaForm(driver);
        visaForm.pressVisaButton();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("select2-selection__rendered")));
        visaForm.searchCountryFrom();
        Thread.sleep(1000);
        visaForm.chooseCountryFrom();
        Thread.sleep(1000);
        visaForm.searchCountryTo();
        Thread.sleep(1000);
        visaForm.chooseCountryTo();
        Thread.sleep(1000);
        visaForm.pressSubmit();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("first_name")));
        visaForm.enterFirstName();
        Thread.sleep(1000);
        visaForm.enterLastName();
        Thread.sleep(1000);
        visaForm.enterEmail();
        Thread.sleep(1000);
        visaForm.enterPhone();
        Thread.sleep(1000);
        visaForm.enterDate();
        Thread.sleep(1000);
        visaForm.pressSubmit();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"fadein\"]/div[1]/div/div/div/div/div/h2")));
    }

    @Test
    public void t5_bookTourTest() throws InterruptedException {
        t1_loginTest();
        WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(3));
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Home")));
        TourForm tourForm= new TourForm(driver);
        tourForm.pressHomeButton();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/header/div[1]/div/div/div[2]/div/div/div[2]/div/button")));
        tourForm.searchCurrency();
        Thread.sleep(1000);
        tourForm.chooseCurrency();
        Thread.sleep(1000);
        tourForm.pressToursButton();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/section[2]/div/div[2]/div[3]/a/div/div[1]/span")));
        tourForm.pressTourImage();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("date")));
        tourForm.enterDate();
        Thread.sleep(1000);
        tourForm.enterNumberOfAdults();
        Thread.sleep(1000);
        tourForm.enterNumberOfChildren();
        Thread.sleep(1000);
        tourForm.enterNumberOfInfants();
        Thread.sleep(1000);
        tourForm.pressSubmit();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"fadein\"]/div[2]/form/section/div/div/div[1]/div[3]/div[1]/h3")));

    }



    @AfterMethod
    public void teardownTest() {
        driver.quit();
    }
}

