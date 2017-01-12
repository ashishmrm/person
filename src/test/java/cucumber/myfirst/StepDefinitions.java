package cucumber.myfirst;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class StepDefinitions {
    private static final String NOT = "not ";

    private Person person;
    private boolean isWeekend;

    @Given("^There is a person named (.*)$")
    public void There_is_a_person(String person) throws Throwable {
        this.person = new Person(person);
    }

    @And("^it is (.*)weekend$")
    public void it_is_weekend(String isOrIsNotWeekend) throws Throwable {
        this.isWeekend = !(NOT.equals(isOrIsNotWeekend));
    }

    @When("^the alarm rings$")
    public void the_alarm_rings() throws Throwable {
        Thread.sleep(5000);
        person.wakeUp();
    }

    @Then("^the person should (.*)get up and go to work$")
    public void the_person_should_get_up_and_go_to_work(String isOrIsNotWeekend) throws Throwable {
        final String expectedMessage;
        if (NOT.equals(isOrIsNotWeekend)) {
            expectedMessage = person.getName() + " does not go to work!";
        } else {
            expectedMessage = person.getName() + " goes to work!";
        }
        String actualMessage = this.person.goToWork(this.isWeekend);
        Assert.assertEquals(actualMessage, expectedMessage);
    }
}
