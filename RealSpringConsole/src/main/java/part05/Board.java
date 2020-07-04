package part05;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Setter;

public class Board {

    @Setter(onMethod_ = {@Autowired})
    private Write write;

    public void boardWrite() {
        write.doWrite();
    }

}
