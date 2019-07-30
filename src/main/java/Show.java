import java.util.EventListener;
import java.util.function.Function;

/**
 * @author 张义 johnraychina@163.com
 */
public class Show {

    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            showInnerClasses();
            System.out.println("-----------------------");
            showLambda();
            System.out.println("-----------------------");
        }
    }

    private static void showLambda() {
        Function<Integer, Integer> function1 = i -> i + 1;
        Function<Integer, Integer> function2 = i -> i * 2;
        System.out.println(function1 + "," + function1.getClass());
        System.out.println(function2 + "," + function2.getClass());

    }

    private static void showInnerClasses() {

        EventListener listener1 = new EventListener() {
            @Override
            public int hashCode() {
                return super.hashCode();
            }
        };

        EventListener listener2 = new EventListener() {
            @Override
            public int hashCode() {
                return super.hashCode();
            }
        };

        System.out.println(listener1 + "," + listener1.getClass());
        System.out.println(listener2 + "," + listener2.getClass());
    }
}
