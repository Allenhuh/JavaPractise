package Concepts;

public class methodSleep extends Thread{
    public void run(){
        for(int i = 1; i < 5; i ++){
            try{
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args){
        methodSleep Thread1 = new methodSleep();
        methodSleep Thread2 = new methodSleep();
        Thread1.start();
        Thread2.start();
    }
}
