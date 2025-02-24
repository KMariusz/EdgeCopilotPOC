package com.capgemini.edge.copilot;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import lombok.Getter;

@Getter
public class TestContext {
    private Playwright playwright;
    private Browser browser;
    private Page page;

    @Before
    public void setUp() {
        playwright = Playwright.create();
        BrowserType.LaunchOptions launchOptions = new BrowserType.LaunchOptions();
        boolean headless = Boolean.parseBoolean(System.getProperty("headless", "true"));
        launchOptions.setHeadless(headless).setChannel("msedge");
        browser = playwright.chromium().launch(launchOptions);
        page = browser.newPage();
    }

    @After
    public void tearDown() {
        playwright.close();
    }
}