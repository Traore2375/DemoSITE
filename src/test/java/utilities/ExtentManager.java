package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {
    private static ExtentReports extent;

    public static ExtentReports getInstance() {
        if (extent == null) {
            ExtentSparkReporter spark = new ExtentSparkReporter("target/ExtentReport.html");
            spark.config().setDocumentTitle("Automation Report");
            spark.config().setReportName("Selenium Test Report");
            spark.config().setTheme(Theme.STANDARD);


            extent = new ExtentReports();
            extent.attachReporter(spark);
            extent.setSystemInfo("Tester", "Oumarou Traoré");
            extent.setSystemInfo("Environment", "QA");
            extent.setSystemInfo("OS", "Windows 11");
            extent.setSystemInfo("Browser", "Chrome 139");


        }
        return extent;
    }
}