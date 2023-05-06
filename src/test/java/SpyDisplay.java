import adapter.Display.Display;

public class SpyDisplay implements Display {

	private String lastPrompt;

	@Override
	public String getLastPrompt() {
		return lastPrompt;
	}

	@Override
	public void prompt(String text) {
		this.lastPrompt = text;
	}

}
