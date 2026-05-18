class DemoThread extends Thread {
    public void run() {
        for(int i=1; i<=5; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
        }
    }

    public static void main(String[] args) {
        DemoThread t1 = new DemoThread();
        DemoThread t2 = new DemoThread();

        t1.start();
        t2.start();
    }
}