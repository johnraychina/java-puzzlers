package thread_puzzlers;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;

/**
 * This program demonstrate the mis-usage of CompletableFuture with Executor.
 *
 * When it comes to parent-child CompletableFuture with same normal Executor,
 *
 * JVM won't exit as the main thread waiting:
 *
 *
 * <pre>
 * "pool-1-thread-1@872" prio=5 tid=0xf nid=NA waiting
 * java.lang.Thread.State: WAITING
 * at jdk.internal.misc.Unsafe.park(Unsafe.java:-1)
 * at java.util.concurrent.locks.LockSupport.park(LockSupport.java:194)
 * at java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.await(AbstractQueuedSynchronizer.java:2081)
 * at java.util.concurrent.LinkedBlockingQueue.take(LinkedBlockingQueue.java:433)
 * at java.util.concurrent.ThreadPoolExecutor.getTask(ThreadPoolExecutor.java:1054)
 * at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1114)
 * at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
 * at java.lang.Thread.run(Thread.java:834)
 *
 *
 *
 * "Reference Handler@920" daemon prio=10 tid=0x2 nid=NA runnable
 *   java.lang.Thread.State: RUNNABLE
 * 	  at java.lang.ref.Reference.waitForReferencePendingList(Reference.java:-1)
 * 	  at java.lang.ref.Reference.processPendingReferences(Reference.java:241)
 * 	  at java.lang.ref.Reference$ReferenceHandler.run(Reference.java:213)
 * </pre>
 *
 * @author 张义 johnraychina@163.com
 */
public class NonStopCompletableFuture {

    //static ExecutorService executorService = Executors.newFixedThreadPool(4);
    static ExecutorService executorService = ForkJoinPool.commonPool();

    public static String doSomething() {
        System.out.println(Thread.currentThread().getName() + ": Huh?");
        return Thread.currentThread().getName();
    }

    public static void main(String[] args) {

        CompletableFuture future = CompletableFuture.supplyAsync(() -> {

            CompletableFuture childFuture = CompletableFuture.supplyAsync(
                () -> doSomething(), executorService);

            childFuture.join();

            return doSomething();

        }, executorService);

        future.join();

        System.out.println(Thread.currentThread().getName() + ": Man, it's done!");
    }

}
