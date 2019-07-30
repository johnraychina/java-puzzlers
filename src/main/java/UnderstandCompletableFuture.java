import java.util.concurrent.CompletableFuture;

/**
 * @author 张义 johnraychina@163.com
 */
public class UnderstandCompletableFuture {

    public static void main(String[] args) {

        //1. CompletableFuture + default executor
        /**
         * Default executor -- ForkJoinPool.commonPool() unless it cannot
         * support parallelism.
         *
         * private static final Executor ASYNC_POOL = USE_COMMON_POOL ?
         * ForkJoinPool.commonPool() : new ThreadPerTaskExecutor();
         */
        CompletableFuture.runAsync(() -> {
            System.out.println("Some business logic ...");
        });

        //CompletableFuture + executor

        //
    }
}
