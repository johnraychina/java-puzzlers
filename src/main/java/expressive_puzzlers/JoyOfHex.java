package expressive_puzzlers;

/**
 * Hex and octal literals are negative if their high-order bit is set.
 * In this program, the number 0xcafebabe is an int constant with its high-order bit set, so it is negative. It is
 * equivalent to the decimal value -889275714.
 *
 *
 * The addition performed by the program is a mixed-type computation: The left operand is of type long, and the right
 * operand is of type int. To perform the computation, Java promotes the int value to a long with a widening primitive
 * conversion [JLS 5.1.2] and adds the two long values. Because int is a signed integral type, the conversion performs
 * sign extension: It promotes the negative int value to a numerically equal long value.
 *
 *
 * The lesson of this puzzle is that mixed-type computations can be confusing, more so given that hex and octal literals
 * can take on negative values without an explicit minus sign. To avoid this sort of difficulty, it is generally best to
 * avoid mixed-type computations.
 *
 * @author 张义 johnraychina@163.com
 */
public class JoyOfHex {
    public static void main(String[] args) {
        System.out.println(Long.toHexString(0x100000000L + 0xcafebabe));

        //solution
        System.out.println(Long.toHexString(0x100000000L + 0xcafebabeL));
    }
}
