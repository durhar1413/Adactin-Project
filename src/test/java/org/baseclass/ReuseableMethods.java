package org.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.core.api.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ReuseableMethods {

	public static WebDriver driver;
	public static Actions a;
	public static TakesScreenshot ts;
	public static Alert a1;
	public static JavascriptExecutor js;
	public static Select s;

	public static void loadUrl() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	public static void launchBrowser(String Url) {
		driver.get(Url);
	}

	public static void toNavigate(String url) {
		driver.navigate().to(url);
	}

	public static void maximize() {
		driver.manage().window().maximize();

	}

	public static void currentUrl() {

		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

	}

	public static void toGetTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	public static void toQuit() {
		driver.quit();
	}

	public static void toClose() {
		driver.close();

	}

	public static void removeAllCookies() {
		driver.manage().deleteAllCookies();

	}

	public static void takeSnap(String filename) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File dest = new File("C:\\Eclipse-Workspace\\Cucumber\\Snap\\" + filename + ".png");

		File source = ts.getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(source, dest);
	}

	public static void toClick(WebElement ref) {
		ref.click();
	}

	public static void toSendKeys(WebElement ref, String values) {
		ref.sendKeys(values);
	}

	public static String enterdTxt(WebElement ref) {
		String attribute = ref.getAttribute("value");
		System.out.println(attribute);
		return attribute;
	}

	// screen shot
	public static void toTakeScreenSotN(String values) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File dest = new File("C:\\Eclipse-Workspace\\New\\Snap" + values + ".png");

		File source = ts.getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(source, dest);
	}

	public static void toTakeScreenSot(String values) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File dest = new File("C:\\Eclipse-Workspace\\MavenLearning\\picture\\" + values + ".png");

		File source = ts.getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(source, dest);
	}
	// actions classes

	public static void actionClass(WebElement element) {

		Actions a = new Actions(driver);
		a.moveToElement(element).perform();
	}

	public static void toDoubleClick(WebElement element) {
		Actions a = new Actions(driver);
		a.doubleClick(element);
	}

	public static void toContextClick(WebElement element) {
		Actions a = new Actions(driver);
		a.contextClick(element);

	}

	public static void toDragAndDrop(WebElement element, WebElement element1) {
		Actions a = new Actions(driver);
		a.dragAndDrop(element, element1);
	}

	// Alert
	public static void toAccept() {
		Alert a1 = driver.switchTo().alert();
		a1.accept();

	}

	public static void toDismiss() {
		Alert a1 = driver.switchTo().alert();
		a1.dismiss();

	}

	public static void toSendKeysA(String values) {
		Alert a1 = driver.switchTo().alert();
		a1.sendKeys(values);

	}

	public static void toGetText() {
		Alert a1 = driver.switchTo().alert();
		String text = a1.getText();
		System.out.println(text);

	}

	// type casting
	// scroll down
	public static void JavascriptScrollDown(WebElement ref) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", ref);

	}

	// scroll up
	public static void JavascriptScrollUp(WebElement ref) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(flase)", ref);
	}

	// replacement of send keys
	public static void JavascriptSendKeys(WebElement ref, String arg) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value'," + arg + ")", ref);
	}

	// to retrieve the text entered
	public static String JavascriptGetAttribute(WebElement ref) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String attribute = (String) js.executeScript("return arguments[0].getAttribute('value')", ref);
		System.out.println(attribute);
		return attribute;
	}

	public static String toGetAttribute(WebElement ref) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String attribute = (String) js.executeScript("return arguments[0].getAttribute('value')", ref);
		System.out.println(attribute);
		return attribute;
	}
	// to click

	public static void JavascriptClick(WebElement ref) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ref);
	}

	// windows handling
	// to get parent window id
	public static void toGetWindowHandle() {
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
	}

	// to get parent id plus child id
	public static void toGetWindowHandles() {
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		Set<String> alId = driver.getWindowHandles();

		for (String s : alId) {
			System.out.println(s);

			if (!windowHandle.equals(s)) {
				driver.switchTo().window(s);
			}
		}
	}

	// to switch multiple windows

	public static void toGetMultipleWindow(WebElement element, int i) {

		Set<String> multipleId = driver.getWindowHandles();
		List<String> listOfWindowId = new ArrayList();
		listOfWindowId.addAll(multipleId);
		driver.switchTo().window(listOfWindowId.get(i));

	}

	// drag and drop using select class
	public static void toSelectByIndex(WebElement ref, int i) {
		Select s = new Select(ref);
		s.selectByIndex(i);
	}

	public static void toSelectByValue(WebElement ref, String i) {
		Select s = new Select(ref);
		s.selectByValue(i);
	}

	public static void toSelectByVisibleText(WebElement ref, String i) {
		Select s = new Select(ref);
		s.selectByVisibleText(i);
	}

	public static void toIsMultiple(WebElement ref) {
		Select s = new Select(ref);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);

	}

	public static void toGetOptions(WebElement ref) {
		Select s = new Select(ref);
		List<WebElement> options = s.getOptions();
		for (WebElement o : options) {
			String text = o.getText();
			System.out.println(text);

		}
	}

	public static void toGetAllSelectedOptions(WebElement ref) {
		Select s = new Select(ref);
		List<WebElement> options = s.getAllSelectedOptions();
		for (WebElement o : options) {
			String text = o.getText();
			System.out.println(text);

		}

	}

	public static void toGetFirstSelectedOption(WebElement ref) {
		Select s = new Select(ref);
		WebElement first = s.getFirstSelectedOption();
		String text = first.getText();
		System.out.println(text);

	}

	public static void toDelectByIndex(WebElement ref, int i) {
		Select s = new Select(ref);
		s.deselectByIndex(i);
	}

	public static void toDelectByValue(WebElement ref, String i) {
		Select s = new Select(ref);
		s.deselectByValue(i);
	}

	public static void toDelectByVisibleIndex(WebElement ref, String i) {
		Select s = new Select(ref);
		s.deselectByVisibleText(i);
	}

	public static void toDelectAll(WebElement ref) {
		Select s = new Select(ref);
		s.deselectAll();
	}

	// webtable
	// to get no of rows
	public static void toGetTableRows(WebElement ref, String a, String b) {
		List<WebElement> r1 = ref.findElements(By.tagName(a));
		for (int i = 0; i < r1.size(); i++) {
			WebElement r2 = r1.get(i);
			// to print headings and data in single use
			List<WebElement> h1 = r2.findElements(By.tagName(b));
			for (int j = 0; j < h1.size(); j++) {
				WebElement h2 = h1.get(j);
				String text = h2.getText();
				System.out.println(text);
			}

			List<WebElement> d1 = r2.findElements(By.tagName(b));
			for (int j = 0; j < d1.size(); j++) {
				WebElement d2 = d1.get(j);
				String text = d2.getText();
				System.out.println(text);
			}
		}
	}

	public static void toGetTableRows2(WebElement ref, String a, String b) {
		List<WebElement> r1 = ref.findElements(By.tagName(a));
		for (int i = 0; i < r1.size(); i++) {
			WebElement r2 = r1.get(i);
			// to print data and headings separately
			List<WebElement> d1 = r2.findElements(By.tagName(b));
			for (int j = 0; j < d1.size(); j++) {
				WebElement d2 = d1.get(j);
				String text = d2.getText();
				System.out.println(text);
			}
		}
	}
	// navigation methods

	public static void toGoBackPage() {

		driver.navigate().back();
	}

	public static void toGoForward() {

		driver.navigate().forward();
	}

	public static void toDoRefresh() {

		driver.navigate().refresh();
	}

	// webelement methods
	public static void toIsDisplayed(WebElement ref) {
		boolean d = ref.isDisplayed();
		System.out.println(d);
	}

	public static void toIsEnabled(WebElement ref) {
		boolean d = ref.isEnabled();
		System.out.println(d);
	}

	public static void toIsSelected(WebElement ref) {
		boolean d = ref.isSelected();
		System.out.println(d);
	}

	// waits

	public static void toImplicitWait(int SECONDS) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public static String excelRead(String fileName, String sheetName, int rows, int column) throws IOException {
		File f1 = new File("C:\\Eclipse-Workspace\\MavenLearning\\exel\\" + fileName + ".xlsx");

		FileInputStream input = new FileInputStream(f1);
		Workbook w = new XSSFWorkbook(input);
		Sheet s = w.getSheet(sheetName);
		Row r = s.getRow(rows);
		Cell c = r.getCell(column);
		String value = c.getStringCellValue();
		return value;

	}

	public static String toMobToString(String fileName, String sheetName, int rows, int column) throws IOException {
		File f1 = new File("C:\\Eclipse-Workspace\\MavenLearning\\exel\\" + fileName + ".xlsx");

		FileInputStream input = new FileInputStream(f1);
		Workbook w = new XSSFWorkbook(input);
		Sheet s = w.getSheet(sheetName);
		Row r = s.getRow(rows);
		Cell c = r.getCell(column);

		double d = c.getNumericCellValue();
		long l = (long) d;
		String value = String.valueOf(l);

		return value;
	}

	public static String toDateFormat(String fileName, String sheetName, int rows, int column) throws IOException {
		File f1 = new File("C:\\Eclipse-Workspace\\MavenLearning\\exel\\" + fileName + ".xlsx");

		FileInputStream input = new FileInputStream(f1);
		Workbook w = new XSSFWorkbook(input);
		Sheet s = w.getSheet(sheetName);
		Row r = s.getRow(rows);
		Cell c = r.getCell(column);

		Date d = c.getDateCellValue();
		SimpleDateFormat sim = new SimpleDateFormat("dd-MM-yyyy");
		String value = sim.format(d);
		return value;
	}

	public static String toUpdateExcel(String fileName, String sheetName, int rows, int column, String s1, String s2)
			throws IOException {

		File f = new File("C:\\Eclipse-Workspace\\MavenLearning\\exel\\" + fileName + ".xlsx");
		FileInputStream input = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(input);
		Sheet s = w.getSheet(sheetName);
		Row r = s.getRow(rows);
		Cell c = r.getCell(column);
		String value = c.getStringCellValue();

		if (value.contains(s1)) {
			c.setCellValue(s2);
		}
		FileOutputStream output = new FileOutputStream(f);
		w.write(output);

		return value;

	}

	public static String toWriteExcel(String fileName, String sheetName, int rows, int column, String s1, String s2)
			throws IOException {

		File f = new File("C:\\Eclipse-Workspace\\MavenLearning\\exel\\" + fileName + ".xlsx");
		FileInputStream input = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(input);
		Sheet s = w.getSheet(sheetName);
		Row r = s.getRow(rows);
		Cell c = r.getCell(column);
		String value = c.getStringCellValue();

		if (value.contains(s1)) {
			c.setCellValue(s2);
		}
		FileOutputStream output = new FileOutputStream(f);
		w.write(output);

		return value;
	}

	public static Map<String, String> excelreadMap(String testCaseID) throws IOException {
		File f = new File("C:\\Eclipse-Workspace\\Cucumber\\Excel\\adactn.xlsx");
		FileInputStream input = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(input);
		Sheet s = w.getSheet("Sheet1");

		Map<String, String> map = new LinkedHashMap<String, String>();
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			Row row = s.getRow(i);
			Cell cell = row.getCell(0);
			String c1 = cell.getStringCellValue();
			if (c1.equals(testCaseID)) {
				Row r = s.getRow(0);
				Row r1 = s.getRow(i);
				for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
					Cell heading = r.getCell(j);
					Cell data = r1.getCell(j);
					if (data.getCellType() == data.CELL_TYPE_NUMERIC) {
						if (DateUtil.isCellDateFormatted(data)) {
							Date d = data.getDateCellValue();
							SimpleDateFormat sim = new SimpleDateFormat("dd-MM-yyyy");
							String value = sim.format(d);
							String txtheading = heading.getStringCellValue();
							map.put(txtheading, value);
						} else {
							double d = data.getNumericCellValue();
							long l = (long) d;
							String valueOf = String.valueOf(l);
							String txtheading = heading.getStringCellValue();
							map.put(txtheading, valueOf);
						}

					} else {
						String txtheading = heading.getStringCellValue();
						String txtdata = data.getStringCellValue();
						map.put(txtheading, txtdata);
					}
				}

			}

		}return map;
	}
}
