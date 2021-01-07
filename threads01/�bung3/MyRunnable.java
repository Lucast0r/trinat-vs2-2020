package ch.trinat.edu.threads01.übung3;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        go();
    }
    private void go() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        doMore();
    }
    private void doMore() {
        System.out.println("Up on the Stack");
    }
}
