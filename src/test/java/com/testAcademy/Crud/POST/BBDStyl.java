package com.testAcademy.Crud.POST;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class BBDStyl {
    public static void main(String[] args) {
        String Payload = "{\n" +
                "  \"username\": \"admin\",\n" +
                "  \"password\": \"password123\"\n" +
                "}";
        RestAssured.
                given()
                    .baseUri("https://restful-booker.herokuapp.com")
                    .basePath("/auth")
                    .contentType(ContentType.JSON).log().all().body(Payload)
                .when()
                    .post()
                .then().log().all().statusCode(200);
    }
}
