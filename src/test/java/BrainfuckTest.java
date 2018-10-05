import com.wolfram.exlang.BrainfuckEngine;

import java.io.OutputStream;


public class BrainfuckTest {

    public static String input = "++++++++++[>+++++++>++++++++++>+++>+<<<<-]>++.>+.+++++++..+++.>++.<<+++++++++++++++.>.+++.------.--------.>+.>.";

    public static void main(String[] args) throws Exception {

        BrainfuckEngine run = new BrainfuckEngine(1048576); //2^10 Byte

        run.interpret(input);

    }

}