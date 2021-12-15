package HW;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class ThreadHydrohen extends Thread {
    CyclicBarrier barrier;

    ThreadHydrohen(CyclicBarrier barrier) {
        this.barrier = barrier;
    }

    public void releiseHydrohen() {
        System.out.print("H");
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


            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
