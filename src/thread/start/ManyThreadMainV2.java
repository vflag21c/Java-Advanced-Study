package thread.start;

import static uitl.MyLogger.log;

public class ManyThreadMainV2 {
    public static void main(String[] args) {
        log("main() start");

        HelloRunnable runnable = new HelloRunnable();

        for (int i = 0; i < 100; i++) { //순서보장 X
            Thread thread1 = new Thread(runnable);
            thread1.start();
        }

        log("main() start");
    }
}
