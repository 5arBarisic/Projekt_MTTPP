import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginForm extends PageObject{


    private final String email = "user@phptravels.com";
    private final String password = "demouser";

    public LoginForm(WebDriver driver) {
        super(driver);
    }


    @FindBy(name = "email")
    private WebElement emailTextBox;

    @FindBy(name = "password")
    private WebElement passTextBox;

    @FindBy(className = "ladda-label")
    private WebElement loginBtn;


    public void enterEmail(){
        this.emailTextBox.sendKeys(email);
    }

    public void enterPassword(){
        this.passTextBox.sendKeys(password);
    }

    public void pressLoginButton(){
        this.loginBtn.click();
    }
}
