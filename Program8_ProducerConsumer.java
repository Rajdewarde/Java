class Shared {
    int data;
    boolean available = false;

    synchronized void put(int value) {
        while(available) {
            try {
                wait();
            } catch(Exception e) {}
        }

        data = value;
        available = true;
        System.out.println("Produced: " + value);
        notify();
    }

    synchronized void get() {
        while(!available) {
            try {
                wait();
            } catch(Exception e) {}
        }

        System.out.println("Consumed: " + data);
        available = false;
        notify();
    }
}

class Producer extends Thread {
    Shared s;

    Producer(Shared s) {
        this.s = s;
    }

    public void run() {
        for(int i=1; i<=5; i++) {
            s.put(i);
        }
    }
}

class Consumer extends Thread {
    Shared s;

    Consumer(Shared s) {
        this.s = s;
    }

    public void run() {
        for(int i=1; i<=5; i++) {
            s.get();
        }
    }
}

public class Program8_ProducerConsumer {
    public static void main(String[] args) {
        Shared s = new Shared();

        Producer p = new Producer(s);
        Consumer c = new Consumer(s);

        p.start();
        c.start();
    }
}