package character_puzzlers;

import java.io.UnsupportedEncodingException;

/**
 * you might expect the program to print the integers from 0 to 255 in order.
 *
 * If you ran the program, maybe you saw this sequence. Then again, maybe you didn’t. We ran it on four machines and
 * saw
 * four different sequences, including the one described previously. This program isn’t even guaranteed to terminate
 * normally, much less to print any particular sequence. Its behavior is completely unspecified.
 *
 * The culprit here is the String(byte[]) constructor. Its specification says: “Constructs a new String by decoding the
 * specified byte array using the plat- form’s default charset. The length of the new String is a function of the
 * charset, and hence may not be equal to the length of the byte array. The behavior of this constructor when the given
 * bytes are not valid in the default charset is unspeci- fied” [Java-API].
 *
 * The lesson of this puzzle is that every time you translate a byte sequence to a String, you are using a charset,
 * whether you specify it explicitly or not.
 *
 * @author 张义 johnraychina@163.com
 */
public class StringCheese {
    public static void main(String[] args) throws UnsupportedEncodingException {
        byte[] bytes = new byte[256];
        for (int i = 0; i < 256; i++) {
            bytes[i] = (byte)i;
        }

        //bad
        String str = new String(bytes);

        //good
        str = new String(bytes, "ISO-8859-1");

        for (int i = 0, n = str.length(); i < n; i++) {
            System.out.print(str.charAt(i));
        }
    }
}

