package expressive_puzzlers;

/**
 * Casts are used to convert a value from one type to another. This program uses three casts in succession. What does
 * it print?
 *
 * The program’s behavior depends critically on the sign extension behavior of casts. Java uses two’s-complement binary
 * arithmetic, so the int value -1 has all 32 bits set. The cast from int to byte is straightforward. It performs a
 * narrowing primitive conversion [JLS 5.1.3], which simply lops off all but the low-order 8 bits. This leaves a byte
 * value with all 8 bits set, which (still) represents  1.
 *
 * The cast from byte to char is trickier because byte is a signed type and char unsigned. It is usually possible to
 * convert from one integral type to a wider one while preserving numerical value, but it is impossible to represent a
 * negative byte value as a char. Therefore, the conversion from byte to char is not considered a widening primitive
 * conversion [JLS 5.1.2], but a widening and narrowing primitive conversion [JLS 5.1.4]: The byte is converted to an
 * int and the int to a char.
 *
 *
 * There is a simple rule that describes the sign extension behavior when converting from narrower integral types to
 * wider: Sign extension is performed if the type of the original value is signed; zero extension if it is a char,
 * regardless of the type to which it is being converted.
 *
 * The lesson is simple: If you can’t tell what a program does by looking at it, it probably doesn’t do what you want.
 * Strive for clarity. Although a simple rule describes the sign extension behavior of widening conversions involving
 * signed and unsigned integral types, most programmers don’t know it. If your program depends on it, make your
 * intentions clear.
 *
 * @author 张义 johnraychina@163.com
 */
public class Multicast {

    public static void main(String[] args) {

        System.out.println((int)(char)(byte)-1);

        //1. int(-1, 0xffffffff) to byte(-1, 0xff)
        byte b = (byte)-1;

        //2. byte to char:
        //  2.1 byte(-1, 0xff)       to  int(-1, 0xffffffff): Sign extension
        //  2.2  int(-1, 0xffffffff) to  char(0xffff): Sign extension
        char c = (char) b;

        //3. char(0xffff) to int(65535, 0x0000ffff): zero extension
        int i = (int) c; // Sign extension is NOT performed

        System.out.println(i);

        //solution:
        // If you are converting from a char value c to a wider integral type and you want sign extension,
        // cast the char to a short, which is the same width as a char but signed.
        //char(0xffff) to short(0xffff, -1):
        short s = (short) c;
        i = s;

        System.out.println(i);

    }
}
