public class Application{
    public static void main(String[] args) {
        SnakeAndLaddersGame snakeAndLaddersGame = new SnakeAndLaddersGame();
        snakeAndLaddersGame.setGameEventListener(new ConsoleGameEventListener());
        snakeAndLaddersGame.play();
    }
}