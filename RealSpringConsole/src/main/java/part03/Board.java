package part03;

public class Board {

    private Write write;

    public Board() {
        this.setWrite(Factory.getQnaBoardWriteInstance());
    }

    public void setWrite(Write write) {
        this.write = write;
    }

    public void boardWrite() {
        write.doWrite();
    }

}
