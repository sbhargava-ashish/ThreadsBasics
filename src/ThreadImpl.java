import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadImpl extends Thread {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ThreadImpl imp = new ThreadImpl();
        RunnableImp runnableImp = new RunnableImp();
        CallableImp callableImp = new CallableImp();
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        System.out.println("Threads is going to Start");
        executorService.submit(imp);
        executorService.submit(runnableImp);
        Future<String> callableReturn = executorService.submit(callableImp);
        System.out.println(callableReturn.get());
        executorService.shutdown();
        Thread.sleep(2000);
        System.out.println("Threads Completed");

    }


    @Override
    public void run() {
        System.out.println("Thread Started");
    }
}
