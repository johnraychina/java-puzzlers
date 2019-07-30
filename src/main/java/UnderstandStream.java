import java.util.Optional;
import java.util.stream.Stream;

/**
 * @author 张义 johnraychina@163.com
 */
public class UnderstandStream {

    public static void main(String[] args) {

        Optional<Long> oddSum = Stream.of(50L, 2L, 23L, 14L).map(i -> i + 1)
            .filter(i -> i % 2 == 0)
            .sorted()
            .reduce((a, b) -> a + b);

        System.out.println(oddSum);

        //how Spliterator works and how it support parallel streaming
    }
}
