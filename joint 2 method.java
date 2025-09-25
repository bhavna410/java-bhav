class MyThread extends Thread {
    String name;

    MyThread(String n) {
        name = n;
    }

    public void run() {
        for(int i = 1; i <= 3; i++) {
            System.out.println(name + " is running: " + i);
            try {
                Thread.sleep(500);  // sleep 0.5 second
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class ThreadJoinDemo {
    public static void main(String[] args) {

        MyThread t1 = new MyThread("Thread-1");
        MyThread t2 = new MyThread("Thread-2");

        t1.start();
        try {
            t1.join();  // main thread waits till t1 finishes
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        t2.start();  // t2 starts after t1 finishes
    }
}