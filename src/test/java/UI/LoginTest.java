package UI;

import UI.Task.OpenChrome;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(SerenityRunner.class)
public class LoginTest {
    private static Actor quan;

    @BeforeClass
    public static void setUp() { quan = Actor.named("Quan"); }

    @Managed
    ChromeDriver qDriver;

    @Before
    public void OpenChromeWebBrowser(){
        quan.can(BrowseTheWeb.with(qDriver));
    }
    @Test
    public void EmailLoginTest(){
        quan.wasAbleTo(OpenChrome.theWeb());
    }
}
