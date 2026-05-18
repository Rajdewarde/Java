class Chat {
    boolean flag = false;

    synchronized void question(String msg) {
        if(flag) {
            try {
                wait();
            } catch(Exception e) {}
        }

        System.out.println(msg);
        flag = true;
        notify();
    }

    synchronized void answer(String msg) {
        if(!flag) {
            try {
                wait();
            } catch(Exception e) {}
        }

        System.out.println(msg);
        flag = false;
        notify();
    }
}

class QuestionThread extends Thread {
    Chat c;

    QuestionThread(Chat c) {
        this.c = c;
    }

    public void run() {
        c.question("Hi");
        c.question("How are you?");
    }
}

class AnswerThread extends Thread {
    Chat c;

    AnswerThread(Chat c) {
        this.c = c;
    }

    public void run() {
        c.answer("Hello");
        c.answer("I am Fine");
    }
}

public class Program10_ThreadCommunication {
    public static void main(String[] args) {
        Chat c = new Chat();

        QuestionThread t1 = new QuestionThread(c);
        AnswerThread t2 = new AnswerThread(c);

        t1.start();
        t2.start();
    }
}