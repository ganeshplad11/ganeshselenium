package TestRunnerBdd;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
 features= "C:\\Users\\Ganesh\\eclipse-workspace\\BDDFRAMEWORK\\src\\test\\java\\Feature1\\Radiobutton.feature"
 ,glue={"step1"}
 

 )
public class TestRunnerUnit {

	

}
