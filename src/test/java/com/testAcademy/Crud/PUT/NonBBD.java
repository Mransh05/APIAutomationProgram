package com.testAcademy.Crud.PUT;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class NonBBD {
    /*
    Booking id
    Token
    Payload

     */
    RequestSpecification Specfication;
    ValidatableResponse validateresponse;
    Response response;

    public void token()
    {

    }
    public void bookingId()
    {


    }
    @Test
    public void test_put_positive() {
        //String Payload = "{\n" + "  \"firstname\": \"James\",\n" + "  \"lastname\": \"Brown\"\n" + "}";

        String token = "9fa3ae4d70455bf";
        String bookingID = "4259";
        String Payload = "{\n" +
                "    \"firstname\" : \"Ansh\",\n" +
                "    \"lastname\" : \"Singh\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2018-01-01\",\n" +
                "        \"checkout\" : \"2019-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast\"\n" +
                "}'";

        Specfication = RestAssured.given();
        Specfication.baseUri("https://restful-booker.herokuapp.com");
        Specfication.basePath("/booking/" + bookingID);
        Specfication.contentType(ContentType.JSON);
        Specfication.cookie("Token",token);
        Specfication.body(Payload).log().all();

        Response response = Specfication.when().put();
        validateresponse = response.then().log().all();
        validateresponse.statusCode(200);



    }

}
