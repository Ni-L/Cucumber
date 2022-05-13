package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\Bridgelabz\\JAVA\\GherkinCucumber\\src\\test\\resources\\Feature",glue={"D:\\Bridgelabz\\JAVA\\GherkinCucumber\\src\\test\\java\\Gluecode"})	
public class Runner {

}
