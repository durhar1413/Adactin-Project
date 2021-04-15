package org.adcrun;

import org.junit.runner.RunWith;

import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\FeatureFileA",glue="org.adcstepdef",dryRun=false,tags= {"@login"})
public class AdactinRunner {
	
	
	 

}
 