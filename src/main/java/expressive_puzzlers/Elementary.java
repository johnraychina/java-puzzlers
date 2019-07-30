package expressive_puzzlers;

/**
 * Always use a capital el (L) in long literals, never a lowercase el (l).
 * Lower case el(l) looks almost the same as one(1) in many font types.
 * @author 张义 johnraychina@163.com
 */
public class Elementary {
    public static void main(String[] args) {
        System.out.println(12345 + 5432l);
        System.out.println(12345 + 5432L);
    }
}
