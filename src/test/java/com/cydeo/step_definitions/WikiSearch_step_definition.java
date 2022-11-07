package com.cydeo.step_definitions;

import com.cydeo.pages.WikiSearchPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class WikiSearch_step_definition {

    WikiSearchPage wikiSearchPage = new WikiSearchPage();

    @Given("User is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {
        Driver.getDriver().get("https://www.wikipedia.org/");
    }

    @When("User types Steve Jobs in the wiki search box")
    public void user_types_steve_jobs_in_the_wiki_search_box() {
        wikiSearchPage.searchBox.sendKeys("Steve Jobs");

    }

    @When("User clicks wiki search button")
    public void user_clicks_wiki_search_button() {
       wikiSearchPage.searchButton.click();
    }

    @Then("User sees Steve Jobs is in the wiki title")
    public void user_sees_steve_jobs_is_in_the_wiki_title() {
        String expectedTitle = "Steve Jobs - Wikipedia";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue(Driver.getDriver().getTitle().contains("Steve Jobs"));

    }

    @When("user types {string} in the wiki search box and clicks enter")
    public void userTypesInTheWikiSearchBoxAndClicksEnter(String searchKeyword) {
        wikiSearchPage.searchBox.sendKeys(searchKeyword);
    }

    @Then("user sees {string} is in the wiki title")
    public void userSeesIsInTheWikiTitle(String string) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(string));

    }
}
