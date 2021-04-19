import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.ForkJoinWorkerThread;
import java.util.concurrent.ScheduledExecutorService;

/**
 * 重复使用、等待结束、异常处理、线程工作模式
 *
 * 什么场景用fork/join pool
 * 什么场景用普通线程池
 *
 * 什么场景应该用completable future
 *
 * @author 张义 johnraychina@163.com
 */
public class UnderstandForkJoinPool {

    public static void main(String[] args) {
        //for/join framework purposes

        //how fork/join works

        // difference between fork/join thread pool and normal thread pool
        Executors.newFixedThreadPool(10);
        Executors.newWorkStealingPool(4);
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool();
        scheduledExecutorService.scheduleWithFixedDelay(); //jdk 8
        scheduledExecutorService.scheduleAtFixedRate(); //jdk8

        ForkJoinWorkerThread fjThread;
        ForkJoinTask fjTask;
        ForkJoinPool fjPool;
    }
}
