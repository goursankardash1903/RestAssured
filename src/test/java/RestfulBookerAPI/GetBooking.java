package RestfulBookerAPI;

import io.restassured.RestAssured;

public class GetBooking
{

    public static void main(String[] args){

//Build Request
//RequestSpecifiction req=;
       String response= RestAssured
                .given()
                    //.log()
                   // .all()
                    .baseUri("https://restful-booker.herokuapp.com/")
                    .basePath("booking/{id}")
                    .pathParam("id",4)
     //hit request
                .when()
                    .get()

                .then()
               .log()
               .all()
               .statusCode(200)

                .extract().response().body().toString();

       System.out.println(response+"hello");









    }
}
