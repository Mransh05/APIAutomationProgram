package com.testAcademy;

import io.restassured.RestAssured;

public class Test002 {
    public static void main(String[] args) {
        System.out.println("Rest Assured test cases");
        System.out.println("Demo");

        //This is the URL : https://restful-booker.herokuapp.com/booking/1
        //log all is see the all actions
        RestAssured
                .given()
                    .baseUri("https://restful-booker.herokuapp.com/")
                    .basePath("/booking/1").log().all()
                .when()
                    .get()
                .then().log().all()
                    .statusCode(200);


    }
}
