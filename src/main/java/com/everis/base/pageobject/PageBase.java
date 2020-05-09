package com.everis.base.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author jovallep
 */
public class PageBase {

    @Autowired
    public PageBase(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }
}
