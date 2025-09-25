class MyThread extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running");

        try {
            System.out.println(Thread.currentThread().getName() + " will sleep for 2 seconds");
            Thread.sleep(2000);  // Sleep for 2 seconds
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println(Thread.currentThread().getName() + " finished execution");
    }
}

class ThreadFunctionsDemo {
    public static void main(String[] args) {

        // Create thread objects
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        // 1. setName() and 2. getName()
        t1.setName("Thread-A");
        t2.setName("Thread-B");

        // 3. setPriority() and 4. getPriority()
        t1.setPriority(Thread.MIN_PRIORITY);  // 1
        t2.setPriority(Thread.MAX_PRIORITY);  // 10

        // Print thread details
        System.out.println(t1.getName() + " Priority: " + t1.getPriority());
        System.out.println(t2.getName() + " Priority: " + t2.getPriority());

        // Start threads
        t1.start();
        t2.start();

        // 5. sleep() used inside run() method
    }
}