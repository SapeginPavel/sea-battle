import base.Game;
import base.Player;
import contollers.ControllerConsole;

public class Main {
    public static void main(String[] args) {
        Game newGame = new Game(new ControllerConsole(), new Player(), new Player());

    }
}
