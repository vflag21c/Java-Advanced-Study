package thread.control;

import util.ThreadUtils;

public class CheckedExceptionMain {
    public static void main(String[] args) throws Exception {
        throw new Exception();
    }

    static class checkedRunnable implements Runnable {
        @Override
        public void run() {
//            throw new Exception(); //X
            ThreadUtils.sleep(1000);
        }
    }
}
