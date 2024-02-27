package Concepts;

/*public class multithread extends Thread {
    public void run() {
        System.out.println("Thread Operational");
    }
    public static void main(String args[]){
        multithread Thread_a = new multithread();
        multithread Thread_b = new multithread();
        multithread Thread_c = new multithread();
        Thread_a.start();
        Thread_b.start();
        Thread_c.start();
    }
} */


//Second way to create threads in Java
public class multithread implements Runnable {

    public void run(){
        System.out.println("Thread Operational");
    }

    public static void main(String args[]) {
        Thread Thread_a = new Thread(new multithread());
        Thread Thread_b = new Thread(new multithread());
        Thread Thread_c = new Thread(new multithread());
        Thread_a.start();
        Thread_b.start();
        Thread_c.start();
    }
}
