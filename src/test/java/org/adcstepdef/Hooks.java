package org.adcstepdef;

import java.io.IOException;

import org.baseclass.PojoClass;
import org.baseclass.ReuseableMethods;
import org.openqa.selenium.By;

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
		String name = s.getName();
		String replace = name.replace(" ","_");
		takeSnap(replace);
		System.out.println("*****Scenario ends*****");
		toClose();
	}
}
