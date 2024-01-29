package com.example.cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyStepdefs {
    private int res = 0;

    @Given("I have a Calculator")
    public void iHaveACalculator() {
    }

    @When("I add {int} and {int}")
    public void iAddAnd(int arg0, int arg1) {
        res += arg0 + arg1;
    }

    @Then("the sum should be {int}")
    public void theSumShouldBe(int arg0) {
        assertEquals(arg0, res);
    }
}
