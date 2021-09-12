package stepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjectModel.AddtoPage;

public class addBasket_Steps {


    AddtoPage addtoPage = new AddtoPage();

    @Given("Search for a district or a street")
    public void search_for_a_district_or_a_street() {
        addtoPage.clickSearch();
        System.out.println("Successfully searched district or a street");
    }

    @Given("type {string}")
    public void type(String city) {
        addtoPage.sendKeyscity(city);
        System.out.println("Successfully typed city");
    }

    @And("select {string}")
    public void select(String city) {
        addtoPage.selectFromCity();
        System.out.println("Successfully selected the city");
    }

    @And("select gift and flower arrangemnets for Birthdays")
    public void selectGiftAndFlowerArrangemnetsForBirthdays() {
        addtoPage.selectFlowers();
        System.out.println("Successfully selected gift and flower arrangemnets for Birthdays");
    }

    @And("select product")
    public void selectProduct() {
        addtoPage.selectProduct();
        System.out.println("Successfully selected product");
    }

    @And("select the calender")
    public void selectTheCalender() {
        addtoPage.selectCalender();
        System.out.println("Selected calender");
    }

    @When("Add to cart")
    public void addToCart() {
        addtoPage.clickAddToCart();
        System.out.println("Added to cart");
    }

    @Then("Product is added to cart")
    public void productIsAddedToCart() {
        addtoPage.assertMyMessage();
        System.out.println("Successfully add to cart");
    }
}
