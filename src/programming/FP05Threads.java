package programming;

import java.util.stream.IntStream;

public class FP05Threads {
    public static void main(String[] args) {
//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                for (int i=0;i<1000;i++){
//                    System.out.println(Thread.currentThread().getId() + ":" + i);
//                }
//            }
//        };
        Runnable runnable = () -> {


                IntStream.range(0,1000).forEach(i->System.out.println(Thread.currentThread().getId() + ":" + i));

        };
        Thread thread = new Thread(runnable);
        thread.start();
        Thread thread2 = new Thread(runnable);
        thread2.start();
        Thread thread3 = new Thread(runnable);
        thread3.start();


    }
}

