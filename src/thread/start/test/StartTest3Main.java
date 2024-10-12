package thread.start.test;

import static uitl.MyLogger.log;

public class StartTest3Main {
    public static void main(String[] args) {
        Thread thread = new Thread(()->{
            for (int i = 1; i <= 5; i++) {
                log("value : " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        thread.start();
    }
}
