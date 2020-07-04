package part08;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Board {

    @Autowired
    @Qualifier("qnaWrite")
    private Write write;

    public void boardWrite() {
        write.doWrite();
    }

}
