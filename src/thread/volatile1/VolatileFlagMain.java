package thread.volatile1;

import static uitl.MyLogger.log;
import static uitl.ThreadUtils.sleep;

public class VolatileFlagMain {
    public static void main(String[] args) {
        MyTask task = new MyTask();
        Thread t = new Thread(task, "work");
        log("runFlag = " + task.runFlag );
        t.start();

        sleep(1000);
        log("runFlag를 false로 변경 시도");
        task.runFlag = false;
        log("runFlag = " + task.runFlag);
        log("main 종료");
    }

    static class MyTask implements Runnable {

//        boolean runFlag = true;
        volatile boolean runFlag = true; // 캐시메모리 사용 하지 않고, 메인 메모리 변수 접근

        @Override
        public void run() {
            log("task 시작");

            while (runFlag) {

            }

            log("task 종료");
        }
    }
}
