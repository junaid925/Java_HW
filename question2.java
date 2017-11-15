import static java.lang.Thread.sleep;

public class question2 {
    public static void main(String[]args) {
        A myA = new A();
        B myB = new B();

        Thread myaT = new Thread(myA);
        Thread mybT = new Thread(myB);

        myaT.start();    // Run different threads using start method
        mybT.start();    // When start() is call, the run() method in those classes will be tricker
    }
}


class A implements Runnable {
    public void run() {
        try {
            for(int i = 0; i < 1000; i++) {    // If there is a problem, it will be catch and interrupt
                sleep(20);
                System.out.print("A");
            }
        } catch(InterruptedException ie) {
            System.out.println("Interrupted");
        }
    }
}


class B implements Runnable {
    Thread other;

    B() {

    }

    B(Thread other) {
        this.other = other;
    }

    public void run() {
        try {
            for(int i = 0; i < 1000; i++) {
                sleep(20);
                System.out.print("B");
            }
        } catch(Throwable t) {}
    }
}