package com.capgemini.edge.copilot;

import com.capgemini.edge.copilot.pages.DemoQA_StartPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static org.assertj.core.api.Assertions.assertThat;

public class StepDefinitions_DemoQAStart {
    private final TestContext testContext;

    public StepDefinitions_DemoQAStart(TestContext testContext) {
        this.testContext = testContext;
    }

    @Given("DemoQA start page is opened")
    public void openStartPage() {
        DemoQA_StartPage startPage = new DemoQA_StartPage(testContext.getPage());
        startPage.open();
        assertThat(startPage.isOpened()).withFailMessage(() -> "DemoQA start page is not opened").isTrue();
    }

    @Then("User click on Elements card")
    public void clickElementsCard() {
        DemoQA_StartPage startPage = new DemoQA_StartPage(testContext.getPage());
        startPage.clickElementsCard();
    }
}