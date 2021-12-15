package HW;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class ThreadOksyhen extends Thread {
    CyclicBarrier barrier;

    ThreadOksyhen(CyclicBarrier barrier) {
        this.barrier = barrier;
    }

    public void releiseHydrohen() {
        System.out.print("O");
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                barrier.await();
                releiseHydrohen();
                if (barrier.await() == 0) {
                    System.out.println();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }


        }
    }


}
