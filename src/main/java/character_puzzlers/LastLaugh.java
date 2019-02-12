package character_puzzlers;

/**
 * The compiler evaluates the constant expression ’H’ + ’a’ by promoting each of the char-valued operands (’H’ and ’a’)
 * to int values through a process known as widening primitive conversion [JLS 5.1.2, 5.6.2].
 *
 * In summary, use the string concatenation operator with care. The + operator performs string concatenation if and only
 * if at least one of its operands is of type String; otherwise, it performs addition.
 *
 * @author 张义 reed.zy@alibaba-inc.com
 */
public class LastLaugh {
    public static void main(String args[]) {
        System.out.print("H" + "a" + "\n");
        System.out.print('H' + 'a' + "\n"); //169
        System.out.print("" + 'H' + 'a' + "\n");

        System.out.println("2 + 2 = " + 2 + 2); //22
        System.out.printf("%c%c", 'H', 'a');
    }
}
