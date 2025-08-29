public class Snake extends BoardItem {
    public Snake(Cell landingCell){
        super(landingCell);
    }

    public Cell land(){
        return landingCell;
    }
}
