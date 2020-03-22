package firstPack;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetData {

	@Test
	public void testResponse()
	{
		Response resp=RestAssured.get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
		int code=resp.statusCode();
		System.out.println("Status code is "+code);
		Assert.assertEquals(code, 200);
	}
	@Test
	public void testdata()
	{
		Response resp=RestAssured.get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
		String code=resp.asString();
		System.out.println("Data is "+code);
		
	}
	
}
