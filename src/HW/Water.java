package HW;

import java.util.concurrent.CyclicBarrier;

public class Water {

    public static void main(String[] args) {
        CyclicBarrier cb = new CyclicBarrier(3);
        new ThreadHydrohen(cb).start();
        new ThreadHydrohen(cb).start();
        new ThreadOksyhen(cb).start();
    }
}
