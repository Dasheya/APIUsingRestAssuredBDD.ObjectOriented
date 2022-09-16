import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class BDDRestAssuredJSON {
    @Test
    public void getTest() {
        RestAssured.given()
                .get("http://localhost:3000/posts")
                .then().statusCode(200);
    }
    @Test
    public void postTest() {
        JSONObject json = new JSONObject();
        json.put("id", 3);
        json.put("title", "RestAssured-test");
        json.put("author", "Jack");
        RestAssured.given()
                .header("Content-Type", "application/json")
                .body(json.toJSONString())
                .when().post("http://localhost:3000/posts")
                .then().statusCode(201);
    }

        @Test
        public void putTest() {

            JSONObject jsonObject = new JSONObject();
            jsonObject.put("title", "json-server");
            jsonObject.put("author", "John");

            RestAssured.given()
                    .header("Content-Type", "application/json")
                    .body(jsonObject.toJSONString())
                    .when().put("http://localhost:3000/posts/1")
                    .then().statusCode(200);
    }
    @Test
    public void patchTest() {

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("title", "json-server");
        jsonObject.put("author", "John");

        RestAssured.given()
                .header("Content-Type", "application/json")
                .body(jsonObject.toJSONString())
                .when().patch("http://localhost:3000/posts/1")
                .then().statusCode(200);
    }
    @Test
    public void deleteTest() {
        RestAssured.given().delete("http://localhost:3000/posts/3")
                .then().statusCode(200);
    }

    @Test
    public void BasciAuthTest() {
        Response response = RestAssured.given().auth().preemptive()
                .basic("Testuser", "ASDF!@#234")
                .get("http://localhost:3000/posts/");
        System.out.println("status code: " + response.statusCode());
        System.out.println("Body: " + response.asPrettyString());
    }
}
