package co.com.demoblaze.com.co.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/features/shopping.feature"},
        glue = "co.com.demoblaze.com.co.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class ShoppingRunner {
}
