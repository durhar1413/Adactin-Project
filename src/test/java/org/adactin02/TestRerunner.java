package org.adactin02;

import org.baseclass.ReportClass;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="@src\\test\\resources\\Rerun\\failed2.txt",glue="StepDefinition02",monochrome=true,dryRun=false,strict=true,plugin={"pretty","html:target\\Report","json:target\\Report\\output.json","junit:target\\Report\\adac.xml","rerun:src\\test\\resources\\Rerun.failed2.txt"})
public class TestRerunner {
	
	@AfterClass
	public static void jvmReportGeneration() {
		ReportClass.reportGenerationJvm(System.getProperty("user.dir")+"\\target\\Report\\output.json");
	}
}
