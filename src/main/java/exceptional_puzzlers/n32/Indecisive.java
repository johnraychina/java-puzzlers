package exceptional_puzzlers.n32;

/**
 * @author 张义 reed.zy@alibaba-inc.com
 */
public class Indecisive {
    public static void main(String[] args) {
        System.out.println(decision());
    }

    static boolean decision() {
        try {
            return true;
        } finally {
            return false;
        }
    }
}