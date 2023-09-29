import api.User;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;



public class CreateUserTest {

    @BeforeEach
    public void setUp() {
        RestAssured.baseURI = "https://reqres.in";
        RestAssured.basePath = "/api/users"; 
    }

    @Test
    public void testCreateUser() {
        User newUser = new User();
        newUser.setNome("Lucas");
        newUser.setJob("QA");

        given()
        .contentType(ContentType.JSON)
        .body(newUser)
        .when()
            .post()
        .then()
            .statusCode(201)
            .body("id", not(empty())) 
            .body("nome", equalTo(newUser.getNome())) 
            .body("job", equalTo(newUser.getJob())); 
    }
}
