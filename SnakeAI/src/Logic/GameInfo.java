/*
 * Informations which are accessible by snakes
 * Author: Thomas Stüber
 * */

package Logic;
import java.util.ArrayList;


public class GameInfo {
	private Game game;
	
	public GameInfo(Game game) {
		this.game = game;
	}
	
	public Field field() {
		return game.getField();
	}
	
	public ArrayList<Snake> snakes() {
		return game.getSnakes();
	}

}
