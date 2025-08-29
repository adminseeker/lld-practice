import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SnakeAndLaddersGame implements Game {
    private Board board;
    private Dice dice;
    private List<Player> players;
    private GameEventListener gameEventListener;
    private Cell[] cells;

    public SnakeAndLaddersGame(){
        board = Board.getInstance();
        dice = Dice.getInstance();
        cells=board.getCells();
        players=new ArrayList<>();
        players.add(new HumanPlayer("Aravind",cells[0]));
        players.add(new HumanPlayer("Dipak",cells[0]));
    }

    @Override
    public void play() {
       
        
        GameStatus status = GameStatus.ACTIVE;
        Scanner scanner = new Scanner(System.in);
        Move move = new PlayerMovement();
        if(gameEventListener!=null){
            gameEventListener.printStatus(status);
        }
        System.out.println("All Players At Cell: 1");
        while(status.equals(GameStatus.ACTIVE)){
            for(Player player: players){
                System.out.print(player.getName()+" Press Enter to Roll the Dice: ");
                scanner.nextLine();
                int diceRoll = dice.roll();
                Cell currentCell = player.getCurrentCell();
                Cell nextCell = player.getCurrentCell().getId() + diceRoll < cells.length ?  cells[player.getCurrentCell().getId() + diceRoll] : player.getCurrentCell();
                Cell landingCell = move.moveOnRoll(cells, currentCell, diceRoll);
                player.setCurrentCell(landingCell);
                
                if(gameEventListener!=null){
                    gameEventListener.onMoveMade(player, diceRoll, currentCell, nextCell, landingCell);
                    
                }
                if(isPlayerWin(player)){
                    status=GameStatus.PLAYER_WIN;
                    if(gameEventListener!=null){
                        gameEventListener.printStatus(status);
                        gameEventListener.announceWin(player);
                    } 
                    break;
                }
                
            }
           
        }
        scanner.close();
        
    }
    
    public boolean isPlayerWin(Player player){
        return player.getCurrentCell().getId()==99;
    }

    public void setGameEventListener(GameEventListener gameEventListener){
        this.gameEventListener=gameEventListener;
    }
}
