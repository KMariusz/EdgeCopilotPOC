package com.capgemini.edge.copilot.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class DemoQA_ButtonsPage {
    private final Page page;
    private final String clickMeText = "Click Me";
    
    public DemoQA_ButtonsPage(Page page) {
        this.page = page;
    }

    public boolean isOpened() {
        return isButtonVisible(clickMeText);
    }

    public boolean isButtonVisible(String text) {
        return getButtonWithTextLocator(text).isVisible();
    }

    private Locator getButtonWithTextLocator(String text) {
        return this.page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName(text));
    }
}