package thread_puzzlers;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * This program demonstrate the mis-usage of CompletableFuture with Executor.
 *
 * When it comes to parent-child CompletableFuture with same normal Executor,
 *
 * JVM won't exit as the ReferenceHandler just keep running.
 *
 * @author 张义 johnraychina@163.com
 */
public class NonStopCompletableFuture {

    static ExecutorService executorService = Executors.newFixedThreadPool(4);
    //static ExecutorService executorService = ForkJoinPool.commonPool();

    public static String doSomething() {
        System.out.println(Thread.currentThread().getName() + ": Huh?");
        return Thread.currentThread().getName();
    }

    public static void main(String[] args) {

        CompletableFuture future = CompletableFuture.supplyAsync(() -> {

            CompletableFuture childFuture = CompletableFuture.supplyAsync(() -> {
                return doSomething();
            }, executorService);

            childFuture.join();

            return doSomething();

        }, executorService);

        future.join();

        System.out.println(Thread.currentThread().getName() + ": Man, it's done!");
    }

}
