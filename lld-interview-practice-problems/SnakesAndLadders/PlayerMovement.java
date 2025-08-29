public class PlayerMovement implements Move {
    public boolean isValidMove(Cell[] cells,Cell currentCell, int x) {
        return (currentCell.getId()+ x <cells.length);
    }

    @Override
    public Cell moveOnRoll(Cell[] cells, Cell currentCell, int x) {
        if(isValidMove(cells,currentCell, x)){
            Cell nextCell = cells[currentCell.getId()+x];
            if(nextCell.getBoardItem() instanceof Snake){
                return nextCell.getBoardItem().land();
            }else if(nextCell.getBoardItem() instanceof Ladder){
                return nextCell.getBoardItem().land();
            }
            return nextCell;
        }
        return currentCell;
    }
}
