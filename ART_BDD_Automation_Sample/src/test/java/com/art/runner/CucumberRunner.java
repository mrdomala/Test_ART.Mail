package com.art.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(features=".//Features",
glue= {"com.art.stepdefinitions"})



//public class CucumberRunner{
public class CucumberRunner extends AbstractTestNGCucumberTests{		

}
