package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\Admin\\eclipse-workspace\\com.cucumberdemo\\src\\test\\java\\FeatureFile"
		,glue={"C:\\Users\\Admin\\eclipse-workspace\\com.cucumberdemo\\src\\test\\java\\Stepdefinition"}
		)
public class TestRunner {

}
