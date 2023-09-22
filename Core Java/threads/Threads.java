class A implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                System.out.println("Hello");

                
                
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hi");
        }
    }
}

public class Threads {
    public static void main(String[] args) {
        A obj = new A();
        B obj2 = new B();

        // obj2.setPriority(Thread.MAX_PRIORITY);
        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        obj2.start();

        Runnable obj3 = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("Hi");
            }
        };

        Runnable obj4 = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("Hello");
            }
        };
    }
}


/*
 * Thread States
 *  New ----> Runnable    <---(notify)
 *              |               |
 *              |            Waiting 
 *              |               |
 *            Running ------>(sleep, wait)
 *              |
 *              |   (stop)
 *              ------------> Dead
 */