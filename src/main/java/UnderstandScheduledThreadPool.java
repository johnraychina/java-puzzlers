import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * 调度线程池，是基于DelayQueue实现按时间调度的：把执行时间封装在ScheduledFutureTask中，丢到DelayQueue
 * 然后ensurePrestart确保有工作线程（就算coreSize==0），如果没工作线程会addWorker添加。
 * <p>
 * 线程执行的时候runWorker ->> getTask从DelayQueue从队列中获取task，使用的是poll中按时间获取，这与普通的take不同。
 * <p>
 * <p>
 * scheduleWithFixedDelay -> delayedExecute
 *
 * @author Zhang Yi
 */
public class UnderstandScheduledThreadPool {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
        scheduledExecutorService.scheduleWithFixedDelay(() -> {
            System.out.println("compute something");
        }, 1, 1, TimeUnit.SECONDS); //jdk 8
        scheduledExecutorService.scheduleAtFixedRate(); //jdk8
    }
}
