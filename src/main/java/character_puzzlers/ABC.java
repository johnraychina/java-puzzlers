package character_puzzlers;

/**
 * To summarize, char arrays are not strings. To convert a char array to a string, invoke String.valueOf(char[]).
 *
 * @author 张义 reed.zy@alibaba-inc.com
 */
public class ABC {

    public static void main(String[] args) {
        String letters = "ABC";
        char[] numbers = {'1', '2', '3'};

        System.out.println(letters + " easy as " + numbers); //hash code of char array

        System.out.println(letters + " easy as " + String.valueOf(numbers));

    }
}
