package Questions;

import io.restassured.specification.RequestSpecification;
import net.serenitybdd.screenplay.Question;
import org.codehaus.groovy.util.ListHashMap;

import java.util.ArrayList;

import static net.serenitybdd.rest.SerenityRest.given;

public class TestQst {

    public static Question<ListHashMap<String, Object>> fromApi(){
        return Question.about("get data from api").answeredBy(actor -> {
            RequestSpecification requestSpecification = given().baseUri("");
            return new ListHashMap<>();
        });
    }

}
