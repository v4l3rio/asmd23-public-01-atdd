package com.example.cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalculatorStepDefs {
    @Given("I have a Calculator")
    public void iHaveACalculator() {
    }

    @When("I add {int} and {int}")
    public void iAddAnd(int arg0, int arg1) {
    }

    @Then("the sum should be {int}")
    public void theSumShouldBe(int arg0) {

    }
}
