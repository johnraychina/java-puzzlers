package loopy_puzzlers;

/**

 <pre>
 overflow test
 how it works: jvm get the left most 32bits of the result and put it into result integer
 Integer.max_value = hex(7fffffff) = bin(0111 1111 1111 1111 1111 1111 1111 1111)
 Integer.max_value + 1 = 1000 0000 0000 0000 0000 0000 0000 0000
 Integer.max_value * 2 = same as left shift 1 = 11111111111111111111111111111110
 *
 </pre>
 * @author 张义 johnraychina@163.com
 */
public class OverflowTest {
    public static void main(String[] args) {

        //toBinaryString() : Returns a string representation of the integer argument
        // as an unsigned integer in base 2.
        int int_value_1 = 1 + Integer.MAX_VALUE; //IDE overflow warning
        System.out.println(int_value_1);
        System.out.println(Integer.toBinaryString(int_value_1));

        int int_value_10 = 2 * Integer.MAX_VALUE; //IDE overflow warning
        System.out.println(int_value_10);
        System.out.println(Integer.toBinaryString(int_value_10));

        //solution:
        long long_value_1 = 1L + Integer.MAX_VALUE;
        System.out.println(long_value_1);
        System.out.println(Long.toBinaryString(long_value_1));

        long long_value_10 = 2L * Integer.MAX_VALUE;
        System.out.println(long_value_10);
        System.out.println(Long.toBinaryString(long_value_10));


    }
}