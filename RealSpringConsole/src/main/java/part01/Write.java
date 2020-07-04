package part01;

public class Write {

    private String boardName;

    public Write() {
        this.init();
    }

    public void init() {
        this.setBoardName("Free Board");
    }

    public String getBoardName() {
        return boardName;
    }

    public void setBoardName(String boardName) {
        this.boardName = boardName;
    }

    public void doWrite() {
        System.out.println(this.getBoardName() + " Write down!!");
    }

}