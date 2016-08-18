import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by ddinu on 8/18/2016.
 */
public class HomePage {

    @FindBy(xpath = "//button[@class='k-button']")
    WebElement okCookies;

    @FindBy(xpath = "//a[@href='/bath-body']")
    WebElement bodyCare;

    @FindBy(xpath = "//span[@class='total-count']")
    WebElement noOfProducts;

    @FindBy(xpath = "//span[@class='k-input']")
    WebElement filter;

    @FindBy(xpath = "//li[@class='k-item' and @data-offset-index='2']")
    WebElement highestPrice;

    @FindBy(xpath= "//a[@href='/products/product?code=28281']")
    WebElement firstProductFullName;

    @FindBy(xpath = "//span[@class='price mainCurrency']")
    WebElement firstProductPrice;

    @FindBy(xpath = "//span[@class='v-icon-side-menu-arrow-left']")
    WebElement backArrow;

    @FindBy(xpath = "//a[@href='/bath-body/new']")
    WebElement newInformation;

    @FindBy(xpath = "//span[@class='total-count']")
    WebElement noOfProducts2;

    @FindBy(xpath = "//a[@href='/products/product?code=33010']")
    WebElement secondProduct;

    @FindBy(xpath = "//button[@id='addToBasketButton']")
    WebElement addToCart;

    @FindBy(xpath = "//span[@class='v-icon-mini-bag']")
    WebElement cartIcon;

    @FindBy(xpath = "//a[@data-category='men']")
    WebElement forHim;

    @FindBy(xpath = "//a[@href='/men/accessories']")
    WebElement accessory;

    @FindBy(xpath = "//a[@href='/men/accessories/watches']")
    WebElement watches;

    @FindBy(xpath = "//a[@href='/products/product?code=27386']")
    WebElement lastWatch;


    @FindBy(xpath = "//h1[@class='name']")
    WebElement watchName;

    @FindBy(xpath = "//img[@src='http://oriflame.ugc.bazaarvoice.com/4661-ro_ro/5_0/9/rating.gif']")
    WebElement rating;

    @FindBy(xpath = "//a[@title='Email']")
    WebElement eMail;

    public HomePage(WebDriver webDriver) {
        WebDriver webDriver1 = webDriver;
    }

}
