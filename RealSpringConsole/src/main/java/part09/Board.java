package part09;

import javax.annotation.Resource;

public class Board {

    @Resource(name="qnaWrite")
    private Write write;

    public void boardWrite() {
        write.doWrite();
    }

}
