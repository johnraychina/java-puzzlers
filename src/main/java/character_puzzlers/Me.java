package character_puzzlers;

import java.util.regex.Pattern;

/**
 * This program was designed to print the name of its class file. In case you aren’t familiar with class literals,
 * Me.class.getName() returns the fully qualified name of the class Me, or "com.javapuzzlers.Me". What does the program
 * print?
 *
 * The problem is that String.replaceAll takes a regular expression as its first parameter, not a literal sequence of
 * characters. (Regular expressions were added to the Java platform in release 1.4.) The regular expression "." matches
 * any single character, and so every character of the class name is replaced by a slash, producing the output we saw.
 *
 * The main lesson of this puzzle and the previous one is: Be careful when using unfamiliar library methods. When in
 * doubt, consult the Javadoc. Also, regular expressions are tricky: Problems tend to show up at run time rather than
 * compile time.
 *
 * @author 张义 reed.zy@alibaba-inc.com
 */
public class Me {
    public static void main(String[] args) {

        //unexpected: replace all with slash
        System.out.println(
            Me.class.getName().replaceAll(".", "/") + ".class");

        //expected: replace dot with slash
        System.out.println(
            Me.class.getName().replaceAll("\\.", "/") + ".class");

        System.out.println(
            Me.class.getName().replaceAll(Pattern.quote("."), "/") + ".class");
    }
}
