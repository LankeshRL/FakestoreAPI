package fakestoreapi;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class APItests extends Basetest {

	@BeforeClass
	public void baseURL() {
		System.out.println("Lauch URI");
		RestAssured.baseURI="https://fakestoreapi.com";
	}
	@Test(enabled = false)
	public void getproducts() {
		RequestSpecification requestSpecification  = RestAssured.given();
		Response response= requestSpecification.request(Method.GET,"/products");
		System.out.println(response.asPrettyString());
		System.out.println(response.statusLine());
	}

	@Test
	public void putproduct() {
		Response response = RestAssured
		.given()
		.header("Content-Type", "application/json")
		.body("{\r\n"
				+ "  \"id\": 0,\r\n"
				+ "  \"title\": \"Takemyticket\",\r\n"
				+ "  \"price\": 199,\r\n"
				+ "  \"description\": \"Buy or sell tickets\",\r\n"
				+ "  \"category\": \"Tickets platform\",\r\n"
				+ "  \"image\": \"http://example.com\"\r\n"
				+ "}")
		.when()
		.post("/products")
		.then().extract().response();
		
		System.out.println("Response body : " + response.asPrettyString());
		System.out.println("Ststus : " + response.statusLine());
	}
}
