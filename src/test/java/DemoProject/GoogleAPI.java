package DemoProject;

import static io.restassured.RestAssured.*;

import java.util.ArrayList;
import java.util.List;

import io.restassured.RestAssured;
import newPOJO.Location;
import newPOJO.addPlace;

public class GoogleAPI {

	public static void main(String[] args) {

		addPlace p = new addPlace();
		p.setAccuracy(50);
		p.setName("Frontline house");
		p.setPhone_number("(+91) 983 893 3937");
		p.setAddress("29, side layout, cohen 09");
		p.setWebsite("http://google.com");
		p.setLanguage("French-IN");
		List<String> myList = new ArrayList<String>();
		myList.add("shoe park");
		myList.add("shop");
		p.setTypes(myList);
		Location l = new Location();
		l.setLat(-38.383494);
		l.setLng(33.427362);
		p.setLocation(l);

		String Response=RestAssured.baseURI = "https://rahulshettyacademy.com";
		given().queryParam("key", "qaclick123").header("Content-Type", "application/json").body(p)
		.when().post("/maps/api/place/add/json")
		.then().log().all().assertThat().statusCode(200).extract().response().asString();

		 System.out.println("Response   :"+Response);
		

	}

}
