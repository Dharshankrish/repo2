package collection;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class post {
@Test
	public static void tc2() {
		RestAssured.baseURI="http://localhost:3000";

		Response res=given().contentType(ContentType.JSON).body("   {\n"
				+ "        \"id\": 3,\n"
				+ "        \"title\": \"sample1\",\n"
				+ "        \"author\": \"akah1\"\n"
				+ "    }").when().post("/posts");
		assertEquals(res.statusCode(),201);
	}
}

