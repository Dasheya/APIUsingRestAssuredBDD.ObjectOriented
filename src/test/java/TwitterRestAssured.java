import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class TwitterRestAssured {
    @Test
    public void tweetTest(){
        Response response = RestAssured.given().auth()
                .oauth("42KxOgzZw9XUZuHG70eF1ZNBL","G1woAa4cDnwzVq7yY0L4gOBOiTdQlCGiDV2bISAKZ5aGxdiHwH","4003503614-3PvhKAkJ3j6lS6mktFXtrevpvIiDQkl0fnzsmKS","aM8wi0nWg6fLuWfOv73i85WDR4OXgp40sylbvpxvp8QKb")
                .post("https://api.twitter.com/1.1/statuses/update.json?status=Hi Folks this is my first tweet using rest assured");
        System.out.println("Status code: "+response.getStatusCode());
        System.out.println("Body: "+response.asPrettyString());
    }
}
