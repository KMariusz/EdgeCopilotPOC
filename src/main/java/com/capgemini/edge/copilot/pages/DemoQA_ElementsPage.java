package com.capgemini.edge.copilot.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class DemoQA_ElementsPage {
    private final Page page;
    private final String listItemsSelector = "#app .element-list .menu-list li";


    public DemoQA_ElementsPage(Page page) {
        this.page = page;
    }

    private Locator getButtonsListItemLocator() {
        return this.page.locator(listItemsSelector).nth(5);
    }

    public boolean isOpened() {
        return getButtonsListItemLocator().isVisible();
    }

    public void clickButtonsListItem() {
        getButtonsListItemLocator().click();
    }
}