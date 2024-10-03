package com.testAcademy.Crud.GET;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class NONBBDStyle {
    public static void main(String[] args) {
        RequestSpecification req = RestAssured.given();
        req.baseUri("https://zippopotam.us");
        req.basePath("/IN/380051");
        req.when().get();
        req.then().log().all().statusCode(200);


    }
}
