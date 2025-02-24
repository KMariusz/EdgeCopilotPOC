package com.capgemini.edge.copilot;

import com.capgemini.edge.copilot.pages.DemoQA_ElementsPage;
import io.cucumber.java.en.Then;

import static org.assertj.core.api.Assertions.assertThat;

public class StepDefinitions_DemoQAElements {
    private final TestContext testContext;

    public StepDefinitions_DemoQAElements(TestContext testContext) {
        this.testContext = testContext;
    }

    @Then("DemoQA Elements page is opened")
    public void elementsPageIsOpened() {
        DemoQA_ElementsPage elementsPage = new DemoQA_ElementsPage(testContext.getPage());
        assertThat(elementsPage.isOpened()).withFailMessage(() -> "DemoQA elements page is not opened").isTrue();
    }

    @Then("User click on Buttons list item")
    public void clickButtonsListItem() {
        DemoQA_ElementsPage elementsPage = new DemoQA_ElementsPage(testContext.getPage());
        elementsPage.clickButtonsListItem();
    }
}