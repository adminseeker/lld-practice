public class ConsoleGameEventListener implements GameEventListener{
    @Override
    public void onMoveMade(Player player,int diceRoll, Cell currentCell, Cell nextCell, Cell landingCell) {
        
        System.out.println("Player: "+player.getName() + " Dice Roll: "+ diceRoll+  ", From Cell "+(currentCell.getId()+1)+" to Cell: "+(nextCell.getId()+1));

        if(nextCell.getBoardItem()!=null){
            if(nextCell.getBoardItem() instanceof Snake){
                System.out.println(player.getName() + " Encountered Snake, Dropped From Cell "+(nextCell.getId()+1)+" to Cell: "+(landingCell.getId()+1));
            }else if(nextCell.getBoardItem() instanceof Ladder){
                System.out.println(player.getName() + " Encountered Ladder, Climbed From Cell "+(nextCell.getId()+1)+" to Cell: "+(landingCell.getId()+1));
            }
        }
    }

    @Override
    public void printStatus(GameStatus status) {
        System.out.println("Game Status: "+status);
    }

    @Override
    public void announceWin(Player player){
        System.out.println(player.getName()+" Won!");
    }
}
