package loopy_puzzlers;

/**
 * Puzzle 27: Shifty i’s
 * Like the program in the Puzzle 26, this one contains a loop that keeps track of how many iterations it takes to
 * terminate. Unlike that program, this one uses the left- shift operator (<<). As usual, your job is to figure out
 * what the program prints. When you read it, remember that Java uses two’s-complement binary arithmetic, so the
 * representation of  1 in any signed integral type (byte, short, int, or long) has all its bits set:
 *
 *
 * The problem is that (-1 << 32) is equal to  1 rather than 0, because shift operators use only the five low-order
 * bits
 * of their right operand as the shift distance, or six bits if the left operand is a long [JLS 15.19].
 *
 * The fixed program illustrates a general principle: Shift distances should, if possible, be constants. If the shift
 * distance is staring you in the face, you are much less likely to exceed 31 or, if the left operand is a long, 63.
 *
 *
 * In summary, shift distances are calculated mod 32 or, if the left operand is a long, mod 64. It is therefore
 * impossible to shift away an entire value by using any shift operator or distance. Also, it is impossible to perform a
 * left shift with a right- shift operator or vice-versa. Use a constant shift distance if possible, and exercise care
 * if the shift distance can’t be made constant.
 *
 * @author 张义 johnraychina@163.com
 */
public class Shifty {
    public static void main(String[] args) {
        //int i = 0;
        //while (-1 << i != 0) { i++; }
        //System.out.println(i);

        //solution
        int distance = 0;
        for (int val = -1; val != 0; val <<= 1) { distance++; }
        System.out.println(distance);
    }
}
