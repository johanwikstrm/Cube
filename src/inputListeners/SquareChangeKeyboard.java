package inputListeners;

import game.GameController;
import cube.Direction;

/**
 * Used to listen for certain keyboard input and then changing the selected Square on the Cube accordingly.
 * @author Bj�rn Tegelund
 */
public class SquareChangeKeyboard extends AbstractKeyboardListener {
	private Direction dir;
	private GameController gc;
	private boolean sks;
	
	/**
	 * Creates a new SquareChangeKeyboard.
	 * @param gc The GameController used to change the Game's currently selected Square.
	 * @param keyCode The key code of the key that should trigger this listener.
	 * @param d The direction the selected Square should be moved when triggered.
	 */
	public SquareChangeKeyboard(GameController gc, int keyCode, Direction d, boolean secondaryKeySet) {
		super(keyCode);
		this.gc = gc;
		dir = d;
		this.sks = secondaryKeySet;
	}

	@Override
	public void pressed() {
		gc.directionKeyPressed(dir, sks);
	}

	@Override
	public void released() {
	}
}
