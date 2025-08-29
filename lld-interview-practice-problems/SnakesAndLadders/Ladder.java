public class Ladder extends BoardItem {
    public Ladder(Cell landingCell){
        super(landingCell);
    }

    public Cell land(){
        return landingCell;
    }
}
