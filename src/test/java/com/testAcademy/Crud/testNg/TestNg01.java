package com.testAcademy.Crud.testNg;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class TestNg01 {

    @Test
    public void test_Get()
    {
        RestAssured
                .given()
                .baseUri("https://zippopotam.us")
                .basePath("/IN/380051")
                .when().log().all()
                .get()
                .then().log().all().statusCode(200);
    }
}
