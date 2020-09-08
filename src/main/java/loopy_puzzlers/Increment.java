package loopy_puzzlers;

/**
 * The lesson is this the same as in Puzzle 7: Do not assign to the same vari- able more than once in a single
 * expression.
 * <p>
 * When placed after a variable, the ++ operator functions as the postfix increment operator [JLS 15.14.2]: The value of
 * the expression j++ is the original value of j before it was incremented. Therefore, the preceding assignment first
 * saves the value of j, then sets j to its value plus 1, and, finally, resets j back to its original value. In other
 * words, the assignment is equivalent to this sequence of statements: int tmp = j; j = j + 1; j = tmp;
 * <p>
 * The lesson is this the same as in Puzzle 7: Do not assign to the same variable more than once in a single
 * expression.
 *
 * @author 张义 johnraychina@163.com
 */
public class Increment {
    public static void main(String[] args) {
        int j = 0;
        for (int i = 0; i < 100; i++) {
            j = j++; //wrong
            //j++; //correct
        }
        System.out.println(j);
    }
}
