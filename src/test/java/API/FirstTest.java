package API;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class FirstTest {

    private static Actor actor;

    @BeforeClass
    public static void setUp(){
        actor = Actor.named("Test");
    }

    @Test
    public void test(){
        Assert.assertEquals(1, 1);
    }

}
