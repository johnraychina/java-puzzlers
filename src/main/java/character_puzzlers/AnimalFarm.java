package character_puzzlers;

/**
 * When using the string concatenation operator, always parenthesize nontrivial operands.
 *
 * Arguably, the program is still broken. Your code should rarely, if ever, depend on the interning of string constants.
 *
 * @author 张义 reed.zy@alibaba-inc.com
 */
public class AnimalFarm {

    public static void main(String[] args) {

        final String pig = "length: 10";
        final String dog = "length: " + pig.length();

        System.out.println("Animals are equal: " + pig == dog); //wrong

        System.out.println("Animals are equal: " + (pig == dog)); //not so good

        System.out.println("Animals are equal: " + pig.equals(dog)); //good
    }
}
