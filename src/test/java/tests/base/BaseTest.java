package tests.base;

import org.junit.jupiter.api.BeforeAll;

import static io.restassured.RestAssured.baseURI;

public class BaseTest {

    @BeforeAll
    public static void setup() {
        baseURI = "https://catfact.ninja";
    }
}
