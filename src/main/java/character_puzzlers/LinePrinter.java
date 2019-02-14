package character_puzzlers;

/**
 * The line separator is the name given to the character or characters used to separate lines of text, and varies from
 * platform to platform. On Windows, it is the CR char- acter (carriage return) followed by the LF character
 * (linefeed).
 * On UNIX, it is the LF character alone, often referred to as the newline character. The following pro- gram passes
 * this character to println. What does it print? Is its behavior platform dependent?
 *
 * Hopefully, the last three puzzles have convinced you that Unicode escapes can be thoroughly confusing. The lesson is
 * simple: Avoid Unicode escapes except where they are truly necessary. They are rarely necessary.
 *
 * @author 张义 reed.zy@alibaba-inc.com
 */
public class LinePrinter {
    public static void main(String[] args) {
        // Note: 000A is Unicode representation of linefeed (LF)
        char c = 0x000A;
        System.out.println(c);
    }
}
