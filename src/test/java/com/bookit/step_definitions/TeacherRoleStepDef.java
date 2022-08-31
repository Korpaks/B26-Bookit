package com.bookit.step_definitions;

import com.bookit.utilities.ConfigurationReader;
import com.bookit.utilities.Environment;
import io.cucumber.java.en.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static io.restassured.RestAssured.*;
import static org.junit.Assert.*;

public class TeacherRoleStepDef {

    String url = Environment.BASE_URL;
    public static final Logger LOG = LogManager.getLogger();


    @Given("User logged in to Bookit api as teacher role")
    public void userLoggedInToBookitApiAsTeacherRole() {
        String userName = Environment.TEACHER_EMAIL;
        String password = Environment.TEACHER_PASSWORD;
        LOG.info("Authorization teacher user : \nemail = " + userName + "\npassword = " + password);
    }

    @And("User sends GET request to {string}")
    public void userSendsGETRequestTo(String request) {

    }

    @Then("status code should be {int}")
    public void statusCodeShouldBe(int expectedStatusCode) {
    }

    @And("content type is {string}")
    public void contentTypeIs(String expectedContentType) {
    }

    @And("role is {string}")
    public void roleIs(String expectedRole) {
    }
}
