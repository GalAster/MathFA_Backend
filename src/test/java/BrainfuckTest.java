import com.wolfram.exlang.BrainfuckEngine;


public class BrainfuckTest {

    public static String input = "++++++++++[>+++++++>++++++++++>+++>+<<<<-]>++.>+.+++++++..+++.>++.<<+++++++++++++++.>.+++.------.--------.>+.>.";

    public static void main(String[] args) throws Exception {

        BrainfuckEngine run = new BrainfuckEngine();

        run.interpret(input);

    }

}