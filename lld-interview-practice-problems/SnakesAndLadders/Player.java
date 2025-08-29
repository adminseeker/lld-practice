public class Player {
    private String name;
    private Cell currentCell;

    public Player(String name,Cell currentCell){
        this.name=name;
        this.currentCell=currentCell;
    }

    public String getName(){
        return name;
    }

    public Cell getCurrentCell(){
        return currentCell;
    }

    public void setCurrentCell(Cell cell){
        this.currentCell=cell;
    }

}
