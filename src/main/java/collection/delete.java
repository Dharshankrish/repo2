package collection;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class delete {
	@org.testng.annotations.Test

	public static void tc3() {
		RestAssured.baseURI = "http://localhost:3000";
		Response rs = given().delete("posts/5");
		assertEquals(rs.statusCode(), 200);
	}

}
