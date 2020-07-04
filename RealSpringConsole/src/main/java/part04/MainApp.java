package part04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import part03.Board;

public class MainApp {

    public static void main(String[] args) {
        ApplicationContext ac = new GenericXmlApplicationContext("spring/context04.xml");
        Board board = ac.getBean("board", Board.class);
        board.boardWrite();
    }

}
