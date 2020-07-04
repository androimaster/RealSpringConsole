package part07;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Board {

    private Write write;

    public void boardWrite() {
        write.doWrite();
    }

}
