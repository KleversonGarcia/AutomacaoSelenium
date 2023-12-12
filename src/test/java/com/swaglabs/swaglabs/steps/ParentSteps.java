package com.swaglabs.swaglabs.steps;

import com.swaglabs.swaglabs.spring.CucumberContext;
import com.swaglabs.swaglabs.spring.PropertiesContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

@ContextConfiguration(classes={CucumberContext.class, PropertiesContext.class})
public class ParentSteps {

	@Autowired
	protected WebDriver webdriver;

	@Autowired
	protected WebDriverWait wait;

	@Autowired
	protected boolean screenshotOnFailure;

	@Autowired
	protected String screenshotDestinationFolder;
}
