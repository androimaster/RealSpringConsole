package part08;

public class Factory {

    public static Write getFreeBoardWriteInstance() {
        return new FreeBoardWrite();
    }

    public static Write getQnaBoardWriteInstance() {
        return new QnaBoardWrite();
    }

}
