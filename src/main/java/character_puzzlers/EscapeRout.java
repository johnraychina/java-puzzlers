package character_puzzlers;

/**
 * The following program uses two Unicode escapes, which represent Unicode char- acters by their hexadecimal numeric
 * codes. What does the program print?
 *
 * The key to understanding this puzzle is that Java provides no special treat- ment for Unicode escapes within string
 * literals.
 *
 * In summary, prefer escape sequences to Unicode escapes in string and character literals. Unicode escapes can be
 * confusing because they are processed so early in the compilation sequence. Do not use Unicode escapes to represent
 * ASCII characters. Inside of string and character literals, use escape sequences; outside of these literals, insert
 * ASCII characters directly into the source file.
 *
 * @author 张义 johnraychina@163.com
 */
public class EscapeRout {
    public static void main(String[] args) {

        // \u0022 is the Unicode escape for double quote (")
        System.out.println("a\u0022.length() + \u0022b".length());
        System.out.println("a\u0022.length() + \u0022b");
        //won't compile: System.out.println("a\u0022.length()");
        System.out.println("a".length());
        System.out.println("a".length() + "b");

        System.out.println("a".length() + "b".length());

        System.out.println("a\".length() + \"b".length());
    }

}
