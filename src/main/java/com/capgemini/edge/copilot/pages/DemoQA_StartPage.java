package com.capgemini.edge.copilot.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class DemoQA_StartPage {
    private final Page page;
    private final String address = "https://demoqa.com/";
    private final String cardsSelector = "#app .card-body";


    public DemoQA_StartPage(Page page) {
        this.page = page;
    }

    public void open() {
        page.navigate(address);
    }

    private Locator getElementsCardLocator() {
        return this.page.locator(cardsSelector).first();
    }

    public boolean isOpened() {
        return getElementsCardLocator().isVisible();
    }

    public void clickElementsCard() {
        getElementsCardLocator().click();
    }
}