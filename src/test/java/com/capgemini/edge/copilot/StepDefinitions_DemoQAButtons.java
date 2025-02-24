package com.capgemini.edge.copilot;

import com.capgemini.edge.copilot.pages.DemoQA_ButtonsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static org.assertj.core.api.Assertions.assertThat;

public class StepDefinitions_DemoQAButtons {
    private final TestContext testContext;

    public StepDefinitions_DemoQAButtons(TestContext testContext) {
        this.testContext = testContext;
    }

    @Given("DemoQA Buttons page is opened")
    public void buttonsPageIsVisible() {
        DemoQA_ButtonsPage buttonsPage = new DemoQA_ButtonsPage(testContext.getPage());
        assertThat(buttonsPage.isOpened()).withFailMessage(() -> "DemoQA buttons page is not opened").isTrue();
    }

    @Then("{string} button is visible")
    public void buttonWithTextIsVisible(String buttonText) {
        DemoQA_ButtonsPage buttonsPage = new DemoQA_ButtonsPage(testContext.getPage());
        assertThat(buttonsPage.isButtonVisible(buttonText)).withFailMessage(String.format("Button [%s] is not visible", buttonText)).isTrue();
    }
}