package collection;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;


public class get {

	@Test
	public static void tc1() {
		RestAssured.baseURI="http://localhost:3000";
		//given().get("/post").then().statusCode(200).log().all();
		Response res =given().get("/posts/2").then().statusCode(200).extract().response();
	String src=res.asString();
	
	assertEquals(res.getStatusCode(),200);
	assertEquals(res.jsonPath().getString("id"),("2"));
	System.out.println(src);
	}
}
