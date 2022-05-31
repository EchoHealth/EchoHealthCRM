package com.CRM.GenericLibrary;

public interface IAutoConstant {

	String CHROME_KEY = "webdriver.chrome.driver";
	String CHROME_VALUE = "./src/main/resources/chromedriver.exe";

	String GECKO_KEY = "webdriver.gecko.driver";
	String GECKO_VALUE = "./src/main/resources/geckodriver.exe";

	String PROPERTIES_FILE_PATH = "./src/test/resources/Config.properties";
	String EXCEL_DATA_FILE_PATH = "./src/test/resources/Data.xlsx";
	
	String CUSTOM_REPORT_PATH = "./CustomReport";
}
