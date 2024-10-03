package com.testAcademy.Crud.POST;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class NONBDD {
    public static void main(String[] args) {
        String Payload = "{\n" +
                "  \"username\": \"admin\",\n" +
                "  \"password\": \"password123\"\n" +
                "}";

        // This is request Preparation
        RequestSpecification req = RestAssured.given();
        req.baseUri("https://restful-booker.herokuapp.com");
        req.basePath("/auth");
        req.contentType(ContentType.JSON).log().all().body(Payload);

        // Make the request
        Response response = req.when().post();

        // this is Then part : Validate the response
        // Verification the response
        ValidatableResponse validatableResponse = response.then().log().all();
        validatableResponse.statusCode(200);


    }
}
