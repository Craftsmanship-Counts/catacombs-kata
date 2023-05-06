package katacombs;

import adapter.Display.Display;

public class Game {
	private final Display display;

	public Game(Display display) {
		this.display = display;
	}

	public void start() {
		display.prompt("LOST IN SHOREDITCH.\n" +
			"YOU ARE STANDING AT THE END OF BRICK LANE BEFORE A SMALL BRICK BUILDING CALLED THE OLD TRUMAN BREWERY. \n" +
			"AROUND YOU IS A FOREST OF INDIAN RESTAURANTS. \n" +
			"A SMALL STREAM OF CRAFTED BEER FLOWS OUT OF THE BUILDING AND DOWN A GULLY.\n" +
			">");
	}
}
