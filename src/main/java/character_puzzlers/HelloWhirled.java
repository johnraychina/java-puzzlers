package character_puzzlers;

/**
 * The following program is a minor variation on an old chestnut. What does it print?
 *
 * In summary, ensure that the characters \ with u do not occur outside the context
 * of a valid Unicode escape, even in comments.
 * Be particularly wary of this problem in machine-generated code.
 *
 * @author 张义 johnraychina@163.com
 */

public class HelloWhirled {
    public static void main(String[] args) {
        /*
         unit
         */
        System.out.println("Hello world");
    }
}
