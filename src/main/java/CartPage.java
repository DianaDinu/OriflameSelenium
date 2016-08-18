import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by ddinu on 8/18/2016.
 */

public class CartPage {
    @FindBy(xpath = "//span[@class='k-icon k-i-arrow-n']")
    WebElement quantity;

    @FindBy(xpath = "//span[@class='total-bp']")
    WebElement totalPoints;

    @FindBy(xpath = "//span[@class='price']/span[@class='value']")
    WebElement totalPrice;
}
