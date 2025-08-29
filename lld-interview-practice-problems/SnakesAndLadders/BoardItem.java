public abstract class BoardItem {
    protected Cell landingCell;

    public BoardItem(Cell landingCell){
        this.landingCell=landingCell;
    }

    public abstract Cell land();
}
