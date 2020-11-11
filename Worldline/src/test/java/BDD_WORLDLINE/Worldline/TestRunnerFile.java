package BDD_WORLDLINE.Worldline;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class) 
@CucumberOptions (features= "C:/Users/Ganesh/eclipse-workspace/Worldline/test/feature/Login.feature",glue= {"BDD_WORLDLINE.Worldline"},
monochrome=true,
plugin={"pretty","html:TragetHtmlReports/HtmlReports"},
tags="@smoketest1"
//plugin={"pretty","JSON:JSONReports/Reports.JSON"}
)
public class TestRunnerFile {

}
