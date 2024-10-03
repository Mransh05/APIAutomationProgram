package com.testAcademy.Crud.GET;

import io.restassured.RestAssured;

public class BBDstlyGet {
    public static void main(String[] args) {
        RestAssured
                .given()
                    .baseUri("https://zippopotam.us")
                    .basePath("/IN/380051")
                .when().log().all()
                .get()
                .then().log().all().statusCode(200);
    }
}
