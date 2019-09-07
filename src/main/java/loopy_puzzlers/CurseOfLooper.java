package loopy_puzzlers;

/**
 * In summary, there is a fundamental difference in the way numerical com- parison operators and equality operators
 * behave when both operands are of boxed numeric types: Numerical comparison operators perform value com- parisons,
 * while equality operators perform reference identity comparisons.
 *
 * @author 张义 johnraychina@163.com
 */
public class CurseOfLooper {

    public static void main(String[] args) {
        //constant pool
        //Integer i = 127;
        //Integer j = 127;

        Integer i = 128;
        Integer j = 128;

        while (i <= j && j <= i && i != j) {
        }
    }
}
