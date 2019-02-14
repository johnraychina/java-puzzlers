package character_puzzlers;

/**
 * This is a bit of a trick question. The program doesn’t do anything special. It sim- ply prints iexplore::maximize.
 * The URL that appears in the middle of the pro- gram is a statement label [JLS 14.7] followed by an end-of-line
 * comment [JLS 3.7]. Labels are rarely needed in Java, which thankfully lacks a goto state- ment. The “little-known
 * feature of the Java programming language” to which the puzzle refers is that you are allowed to put a label on any
 * statement. This program labels an expression statement, which is legal but useless.
 *
 * The lesson of this puzzle is that misleading comments and extraneous code cause confusion. Write comments carefully
 * and keep them up to date. Excise dead code. Also, if something seems too strange to be true, it’s probably false.
 *
 * @author 张义 reed.zy@alibaba-inc.com
 */
public class BrowserTest {

    public static void main(String[] args) {
        System.out.print("iexplore:");
        http:
        //www.google.com;
        System.out.println(":maximize");
    }
}
