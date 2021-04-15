package org.stepdefinition;

import java.io.IOException;

import org.baseclass.ReuseableMethods;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends ReuseableMethods{
	
	@Before
	public void beforeScenario() {
		System.out.println("Scenario Starts*****");
	}
	
	@After
	public void afterScenario(Scenario s) throws IOException {
		
		if (s.isFailed()) {
			TakesScreenshot ts=(TakesScreenshot)driver;
			byte[] snap = ts.getScreenshotAs(OutputType.BYTES);
			s.embed(snap, "image.png");
//		}else {
//		String name = s.getName();
//		String replace = name.replace(" ","_");
//		takeSnap(replace);
//		System.out.println("*****Scenario ends*****");
//		toClose();
//	}}
}}}

