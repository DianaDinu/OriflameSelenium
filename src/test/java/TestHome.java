import org.junit.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by ddinu on 8/18/2016.
 */
public class TestHome extends TestFirst {

    @Test
    public void testInitial() {

        homePage.okCookies.click();

        homePage.bodyCare.click();

        homePage.noOfProducts.getSize();

        homePage.noOfProducts.getText();



        System.out.println("Number of elements: " + homePage.noOfProducts.getText());

        homePage.filter.click();

        webDriver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);

        homePage.highestPrice.click();

        homePage.firstProductFullName.getText();

        homePage.firstProductPrice.getText();

        System.out.println("First product full name: " + homePage.firstProductFullName.getText()
                + " First product price: " + homePage.firstProductPrice.getText());

        //we suppose that the desired product is Trusă manichiură Giordani Gold
       if (homePage.firstProductFullName.getText().contains("Trusă manichiură Giordani Gold")){
           System.out.println("The clicked product is the desired one!");
       } else {
           System.out.println("The clicked product is NOT the desired one");
       }

        // click to enter into the first elelemnt
        homePage.firstProductFullName.click();

        homePage.backArrow.click();


        homePage.newInformation.click();

        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        assert homePage.noOfProducts2.isDisplayed();
        System.out.println("Number of new  elements: " + homePage.noOfProducts2.getText());

        homePage.secondProduct.click();
        assert homePage.addToCart.isDisplayed();
        homePage.addToCart.click();
        assert homePage.cartIcon.isDisplayed();

        homePage.cartIcon.click();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        cartPage.quantity.click();
        cartPage.quantity.click();

        assert cartPage.totalPrice.isDisplayed();
        assert cartPage.totalPoints.isDisplayed();

        System.out.println("Total Price: " +cartPage.totalPrice.getText()
                + " Total points earned: " + cartPage.totalPoints.getText());


        // Second part of the homework
        homePage.forHim.click();
        homePage.accessory.click();
        homePage.watches.click();

        webDriver.manage().timeouts().implicitlyWait(100, TimeUnit.MILLISECONDS);

        homePage.lastWatch.click();

        System.out.println("Watch Full Name: " + homePage.watchName.getText());
        System.out.println("Watch Rating: " + homePage.rating.toString());

        assert homePage.eMail.isDisplayed();
        homePage.eMail.click();
    }

}
