public class Board {
    private static Board instance;
    private static Cell[] cells;

    private Board(){}

    public static Board getInstance(){
        if(instance==null){
            setUpGrid();
            instance=new Board();
        }
        return instance;
    }

    private static void setUpGrid(){
        cells=new Cell[10*10];
        for(int i=0;i<cells.length;i++){
            cells[i]=new Cell(i);
        }
        createSnakes();
        createLadders();
    }

    private static void createSnakes(){
        cells[97].setBoardItem(BoardItemFactory.generateBoardItem("snake", cells[97],cells[3]));
        cells[92].setBoardItem(BoardItemFactory.generateBoardItem("snake",cells[92],cells[13]));
        cells[75].setBoardItem(BoardItemFactory.generateBoardItem("snake", cells[75],cells[24]));
        cells[54].setBoardItem(BoardItemFactory.generateBoardItem("snake", cells[54],cells[33]));
        cells[22].setBoardItem(BoardItemFactory.generateBoardItem("snake", cells[22],cells[12]));
        cells[15].setBoardItem(BoardItemFactory.generateBoardItem("snake", cells[15],cells[8]));
    }

    private static void createLadders(){
        cells[6].setBoardItem(BoardItemFactory.generateBoardItem("ladder",cells[6], cells[31]));
        cells[24].setBoardItem(BoardItemFactory.generateBoardItem("ladder", cells[24],cells[45]));
        cells[28].setBoardItem(BoardItemFactory.generateBoardItem("ladder", cells[28],cells[52]));
        cells[45].setBoardItem(BoardItemFactory.generateBoardItem("ladder", cells[45],cells[74]));
        cells[68].setBoardItem(BoardItemFactory.generateBoardItem("ladder", cells[68],cells[93]));
        cells[76].setBoardItem(BoardItemFactory.generateBoardItem("ladder", cells[76],cells[98]));
    }

    public Cell[] getCells(){
        return cells;
    }
}
