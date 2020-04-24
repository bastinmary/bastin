package myRunner;




import org.junit.runner.RunWith;



import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features=".//Features/Postings.feature", 
					glue="stepDefn", 
						dryRun=false,
							monochrome=true, 
								plugin= {"pretty","html:target/cucumber-reports/report.html"})



public class TestRunner {
	/*@AfterClass
    public static void writeExtentReport() {
        Reporter.loadXMLConfig(new File("config/report.xml"));
}*/
}
