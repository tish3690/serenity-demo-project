package com.cbt.page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://www.google.com")
public class HomePage extends PageObject {

	@FindBy(name = "q")
	public WebElementFacade searchField;

	public WebElementFacade link(String link) {
		return find(By.linkText(link));
	}

	public WebElementFacade submitButton() {
		return $("[name='q']");

	}

}
