package base;

public class Game {

    Controller controller; //способ управления
    Player pl1;
    Player pl2;

    /**
     * Экземпляр класса Game - игровая сессия. В контроллер, который передаётся игре при создании, сразу же передаётся сама эта игра (циклическая связь)
     * @param controller конкретный способ упралвления
     * @param pl1 первый игрок
     * @param pl2 второй игрок
     */
    public Game(Controller controller, Player pl1, Player pl2) {
        this.controller = controller;
        this.pl1 = pl1;
        this.pl2 = pl2;

        controller.setGame(this);
    }

    public void startGame() {

    }


}
