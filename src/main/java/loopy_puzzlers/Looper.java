package loopy_puzzlers;

import java.util.stream.IntStream;

/**
 * @author 张义 johnraychina@163.com
 */
public class Looper {
    public static void main(String[] args) {

        int start = Integer.MAX_VALUE - 1;

        //for (int i = start; i <= start + 1; i++) {
        //}

        IntStream.rangeClosed(start, start+1).forEach(i -> System.out.println(i));

    }
}
