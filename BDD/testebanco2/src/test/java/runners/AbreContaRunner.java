package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/cenarioAbreConta.feature",
					"src/test/resources/cenarioAprovaEmprestimo.feature"},
		plugin = "pretty",
		snippets = SnippetType.CAMELCASE,
		dryRun = false,
		glue = "steps"
		)

public class AbreContaRunner {

}
