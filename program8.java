
public class program8 extends Thread {
    public void run() {
        System.out.println("HElloe");
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String arg[]) {
        System.out.println("Hellow World");

        Thread.currentThread().getName();
        System.out.println(Thread.currentThread().getName());

        Thread.currentThread().setName("Shahabaz");
        // int iNo = 10 / 0;
        program8 obj = new program8();
        obj.start();
    }
}