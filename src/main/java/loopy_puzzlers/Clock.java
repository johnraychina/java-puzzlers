package loopy_puzzlers;

/**
 * The expression ms % 60*1000 in the original program was laid out to fool you into thinking that multiplication has
 * higher precedence than remainder. The com- piler, however, ignores this white space, so never use spacing to express
 * group- ing; use parentheses. Spacing can be deceptive, but parentheses never lie.
 *
 * @author 张义 reed.zy@alibaba-inc.com
 */
public class Clock {
    public static void main(String[] args) {
        int minutes = 0;
        for (int ms = 0; ms < 60 * 60 * 1000; ms++) {
            if (ms % 60 * 1000 == 0) {
                minutes++;
            }
        }
        System.out.println(minutes);
    }
}
