package tests;

import com.fraido.tests.responses.CatFactResponse;
import com.fraido.tests.responses.CatFactsResponse;
import org.junit.jupiter.api.Test;
import tests.base.BaseTest;
import static org.assertj.core.api.Assertions.*;

import static io.restassured.RestAssured.when;

public class CatFactsTest extends BaseTest {

    @Test
    public void getCatFactTest() {
    var catFactResponse= when().get("/fact")
                .then()
                .log().all()
                .statusCode(200)
                .extract()
                .as(CatFactResponse.class);

    assertThat(catFactResponse.getFact().length()).isGreaterThan(0);
    assertThat(catFactResponse.getLength()).isGreaterThan(0);
    }

    @Test
    public void getCatFactsTest() {
        var catFactsResponse= when().get("/facts")
                .then()
                .log().all()
                .statusCode(200)
                .extract()
                .as(CatFactsResponse.class);

        assertThat(catFactsResponse.getFirstPageUrl()).isEqualTo("https://catfact.ninja/facts?page=1");
        assertThat(catFactsResponse.getTotal()).isEqualTo(332);
        assertThat(catFactsResponse.getCatFacts().get(0).getFact().length()).isGreaterThan(0);
        assertThat(catFactsResponse.getCatFacts().get(0).getLength()).isGreaterThan(0);
    }
}
