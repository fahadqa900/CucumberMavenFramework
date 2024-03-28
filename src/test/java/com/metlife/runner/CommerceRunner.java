package com.metlife.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/com/metlife/features",glue = "com.metlife.stepsdefinition",
        tags = "@Main",plugin ={"html:target/TestReport.html"
        ,"json:target/TestReport.json","pretty:target/TestReport.txt","junit:target/TestReport.xml"} )
public class CommerceRunner
{

}
