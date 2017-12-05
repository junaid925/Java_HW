class Show {
    int n = 1;

    synchronized void print(char c, int num) {
        while (n % 4 != num)
            try {
                wait();
            } catch (Throwable e) {
                System.out.println("Exception caught");
            }
        System.out.print(c);
        n++;
        notifyAll();
    }
}

class Thread1 implements Runnable {
    Thread t;
    Show show;
    char[] a = new char[]{'A', 'E', 'I', 'M', 'Q', 'U', 'Y'};

    Thread1(Show show) {
        this.show = show;
        t = new Thread(this);
        t.start();
    }

    public void run() {
        for (int i = 0; i < a.length; i++) {
            show.print(a[i], 1);
        }
    }
}

class Thread2 implements Runnable {
    Thread t;
    Show show;
    char[] a = new char[]{'B', 'F', 'J', 'N', 'R', 'V', 'Z'};

    Thread2(Show show) {
        t = new Thread(this);
        this.show = show;
        t.start();
    }

    public void run() {
        for (int i = 0; i < a.length; i++) {
            show.print(a[i], 2);
        }
    }
}

class Thread3 implements Runnable {
    Thread t;
    Show show;
    char[] a = new char[]{'C', 'G', 'K', 'O', 'S', 'W'};

    Thread3(Show show) {
        t = new Thread(this);
        this.show = show;
        t.start();
    }

    public void run() {
        for (int i = 0; i < a.length; i++) {
            show.print(a[i], 3);
        }
    }
}

class Thread4 implements Runnable {
    Thread t;
    Show show;
    char[] a = new char[]{'D', 'H', 'L', 'P', 'T', 'X'};

    Thread4(Show show) {
        t = new Thread(this);
        this.show = show;
        t.start();
    }

    public void run() {
        for (int i = 0; i < a.length; i++) {
            show.print(a[i], 0);
        }
    }
}
