import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by ddinu on 8/18/2016.
 */
public class TestFirst {

    public static WebDriver webDriver;
    protected HomePage homePage;
    protected CartPage cartPage;

    @BeforeClass
    public static void setUp(){
        webDriver = new FirefoxDriver();
        webDriver.manage().window().maximize();
        webDriver.get("http://oriflame.ro");
    }
    @Before
    public void initPageObjects(){
        homePage = PageFactory.initElements(webDriver, HomePage.class);
        cartPage = PageFactory.initElements(webDriver,CartPage.class);
    }
}
