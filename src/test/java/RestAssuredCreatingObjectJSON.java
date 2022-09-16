import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class RestAssuredCreatingObjectJSON {

    //posts{ "id": 1, "title": "json-server", "author": "typicode" }
    @Test
    public void getCallJsonserverTestposts() {
        Response response = RestAssured.get("http://localhost:3000/posts");
        System.out.println("Json Body: " + response.asPrettyString());
        System.out.println("Status code: " + response.getStatusCode());
        System.out.println("Response time: " + response.getTime());

    }

    @Test
    public void postCallTestposts() {
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json");
        JSONObject json = new JSONObject();
        json.put("id", 3);
        json.put("title", "RestAssured-test");
        json.put("author", "John");
        request.body(json.toJSONString());
        Response response = request.post("http://localhost:3000/posts/");
        System.out.println("Status code: " + response.getStatusCode());
        System.out.println("Response body: " + response.asPrettyString());
    }

    @Test
    public void putCallTestposts() {
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json");
        JSONObject json = new JSONObject();

        json.put("title", "RestAssured-test");
        json.put("author", "Darshan");
        request.body(json.toJSONString());
        Response response = request.put("http://localhost:3000/posts/1");
        System.out.println("Status code: " + response.getStatusCode());
        System.out.println("Response body: " + response.asPrettyString());
    }

    @Test
    public void patchCallTestposts() {
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json");
        JSONObject json = new JSONObject();

        json.put("title", "Athlete");

        request.body(json.toJSONString());
        Response response = request.patch("http://localhost:3000/posts/1");
        System.out.println("Status code: " + response.getStatusCode());
        System.out.println("Response body: " + response.asPrettyString());
    }
    @Test
    public void deleteTestposts() {
        RequestSpecification request = RestAssured.given();
        Response response =request.delete("http://localhost:3000/posts/2");
        System.out.println("Status code: " + response.getStatusCode());
    }

    //comments{ "id": 1, "body": "some comment", "postId": 1 }
    @Test
    public void getCallJsonserverTestcomments() {


        Response response = RestAssured.get("http://localhost:3000/comments");
        System.out.println("Json Body: " + response.asPrettyString());
        System.out.println("Status code: " + response.getStatusCode());
        System.out.println("Response time: " + response.getTime());

    }

    @Test
    public void postCallTestcomments() {
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json");
        JSONObject json = new JSONObject();
        json.put("id", 2);
        json.put("body", "Legend");
        json.put("postId", 1);
        request.body(json.toJSONString());
        Response response = request.post("http://localhost:3000/comments");
        System.out.println("Status code: " + response.getStatusCode());
        System.out.println("Response body: " + response.asPrettyString());
    }

    @Test
    public void putCallTestcomments() {
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json");
        JSONObject json = new JSONObject();

        json.put("body", "Athletic");
        json.put("postId", 1);
        request.body(json.toJSONString());
        Response response = request.put("http://localhost:3000/comments/1");
        System.out.println("Status code: " + response.getStatusCode());
        System.out.println("Response body: " + response.asPrettyString());
    }

    @Test
    public void patchCallTestcomments() {
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json");
        JSONObject json = new JSONObject();

        json.put("body", "Gamer");

        request.body(json.toJSONString());
        Response response = request.patch("http://localhost:3000/comments/1");
        System.out.println("Status code: " + response.getStatusCode());
        System.out.println("Response body: " + response.asPrettyString());
    }
    @Test
    public void deleteTestcomments() {
        RequestSpecification request = RestAssured.given();
        Response response =request.delete("http://localhost:3000/comments/1");
        System.out.println("Status code: " + response.getStatusCode());
    }

    //profile{ "name": "typicode" }
    @Test
    public void getCallJsonserverTestprofile() {

        Response response = RestAssured.get("http://localhost:3000/profile");
        System.out.println("Json Body: " + response.asPrettyString());
        System.out.println("Status code: " + response.getStatusCode());
        System.out.println("Response time: " + response.getTime());

    }

    @Test
    public void postCallTestprofile() {
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json");
        JSONObject json = new JSONObject();
        json.put("name", "Thorat");
        request.body(json.toJSONString());
        Response response = request.post("http://localhost:3000/profile");
        System.out.println("Status code: " + response.getStatusCode());
        System.out.println("Response body: " + response.asPrettyString());
    }

    @Test
    public void putCallTestprofile() {
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json");
        JSONObject json = new JSONObject();

        json.put("name", "DarshanK");

        request.body(json.toJSONString());
        Response response = request.put("http://localhost:3000/profile");
        System.out.println("Status code: " + response.getStatusCode());
        System.out.println("Response body: " + response.asPrettyString());
    }

    @Test
    public void patchCallTestprofile() {
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json");
        JSONObject json = new JSONObject();

        json.put("name", "Athlete");

        request.body(json.toJSONString());
        Response response = request.patch("http://localhost:3000/profile");
        System.out.println("Status code: " + response.getStatusCode());
        System.out.println("Response body: " + response.asPrettyString());
    }
    @Test
    public void deleteTestprofile() {
        RequestSpecification request = RestAssured.given();
        Response response =request.delete("http://localhost:3000/profile");
        System.out.println("Status code: " + response.getStatusCode());
    }

}
