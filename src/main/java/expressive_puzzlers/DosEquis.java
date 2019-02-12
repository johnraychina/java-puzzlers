package expressive_puzzlers;

/**
 * ought to print XX ??
 *
 * NO,it's X88
 *
 * This problem is caused by type problem of conditional operator.
 * Mixed-type computation can be confusing.
 * Nowhere is this more apparent than in conditional expressions.
 *
 * @author 张义 reed.zy@alibaba-inc.com
 */
public class DosEquis {

    public static void main(String[] args) {
        char x = 'X';
        int i = 0;
        System.out.print(true  ? x : 0);
        System.out.print(false ? i : x);
    }
}
