public class BoardItemFactory {
    public static BoardItem generateBoardItem(String itemType,Cell from, Cell to){
        if(itemType.equals("snake")){
            Snake snake = new Snake(to);
            from.setBoardItem(snake);
            return snake;
        }else if(itemType.equals("ladder")){
            Ladder ladder = new Ladder(to);
            from.setBoardItem(ladder);
            return ladder;
        }else throw new IllegalArgumentException("Invalid BoardItem!");
    }    
}
