public class Cell {
    private int id;
    private BoardItem boardItem;

    public Cell(int id){
        this.id=id;
    }

    public int getId(){
        return id;
    }

    public void setBoardItem(BoardItem boardItem){
        this.boardItem=boardItem;
    }

    public BoardItem getBoardItem(){
        return boardItem;
    }

}
