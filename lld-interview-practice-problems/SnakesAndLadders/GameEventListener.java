public interface GameEventListener {
    public void onMoveMade(Player player,int diceRoll, Cell currentCell, Cell nextCell, Cell landingCell);
    public void printStatus(GameStatus status);
    public void announceWin(Player player);
}
