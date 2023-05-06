import adapter.Display.Display;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import katacombs.Game;

import static org.assertj.core.api.Assertions.assertThat;

public class KatacombsStepDefs {

	Game game;
	private Display display;


	@Given("a new game")
	public void a_new_game() {
		display = new SpyDisplay();
		game = new Game(display);
	}

	@When("the game starts")
	public void the_game_starts() {
		game.start();
	}

	@Then("the user is at the start location")
	public void theUserIsAtTheStartLocation() {
		assertThat(display.getLastPrompt()).isEqualTo("LOST IN SHOREDITCH.\n" +
			"YOU ARE STANDING AT THE END OF BRICK LANE BEFORE A SMALL BRICK BUILDING CALLED THE OLD TRUMAN BREWERY. \n" +
			"AROUND YOU IS A FOREST OF INDIAN RESTAURANTS. \n" +
			"A SMALL STREAM OF CRAFTED BEER FLOWS OUT OF THE BUILDING AND DOWN A GULLY.\n" +
			">");
	}
}
