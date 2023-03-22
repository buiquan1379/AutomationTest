package UI.Task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

public class OpenChrome implements Task {
    private SmdHomePage homePage;
    @Override
    @Step("{0} open the Chrome Web browser")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn().the(homePage)
        );
    }

    public static Performable theWeb(){
        return Tasks.instrumented(OpenChrome.class);
    }
}
