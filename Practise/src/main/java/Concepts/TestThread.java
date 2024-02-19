package Concepts;

class RunnableMethod implements Runnable {
    private Thread Thread1;
    private String threadName;
    RunnableMethod(String name){
        threadName = name;
        System.out.println("Creating a new Thread" + threadName);
    }
    public void run(){
        System.out.println("Running the current Thread" + threadName);
        try {
            for(int i = 4; i >0; i--){
                System.out.println("Thread details: " + threadName + "," + i);
                Thread.sleep(50);
            }
        } catch(InterruptedException e){
            System.out.println("Thread details: " + threadName + "interrupt");
        }
        System.out.println("Thread details: " + threadName + " exiting.");
    }

    public void start(){
        System.out.println("Starting " + threadName);
        if(Thread1 == null) {
            Thread1 = new Thread (this, threadName);
            Thread1.start();
        }
    }
}

public class TestThread {
    public static void main(String[] args){
        RunnableMethod Run1 = new RunnableMethod(("Thread Number 1"));
        Run1.start();
        RunnableMethod Run2 = new RunnableMethod("Thread Number 2");
        Run2.start();
    }
}
