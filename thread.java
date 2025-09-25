// Thread by extending Thread class
class MyThread extends Thread {
    public void run() {
        // Code that will run in thread
        System.out.println("Thread is running...");
    }
}

class ThreadDemo1 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread(); // create thread object
        t1.start(); // start thread (calls run())
    }
}