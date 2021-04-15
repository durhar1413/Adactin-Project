package org.baseclass;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class ReportClass {

	public static void reportGenerationJvm(String jasonReport) {

		File f = new File(System.getProperty("user.dir") + "\\target\\Report\\JvmReport");

		Configuration con = new Configuration(f, "Adaction Application");
		con.addClassifications("Platform Name", "Windows 10");
		con.addClassifications("Browser Name", "Chrome");
		con.addClassifications("Browser Version", "89.04");
		con.addClassifications("Sprint : ", "10");
		con.addClassifications("Batch Name", "Comrades");

		List<String> l = new ArrayList<String>();
		l.add(jasonReport);

		ReportBuilder r = new ReportBuilder(l, con);
		r.generateReports();

	}

}
