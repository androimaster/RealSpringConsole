package part10;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component
public class Board {

    @Resource(name="qnaBoardWrite")
    private Write write;

    public void boardWrite() {
        write.doWrite();
    }

}
