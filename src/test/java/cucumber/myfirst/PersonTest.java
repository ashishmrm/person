package cucumber.myfirst;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {
        "classpath:features/"
        },
        glue = "cucumber.myfirst",
        monochrome = true,
        //format = {"pretty", "html:build/cucumber", "rerun:target/rerun.txt"},
        format={"pretty", "json:build/cucumber/person.json"})
public class PersonTest {
}
