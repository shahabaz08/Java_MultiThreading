public class program18 extends Thread {

    public void run() {

        System.out.println(Thread.currentThread().isInterrupted());
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(i);
                sleep(1000);
            }
        } catch (Exception e) {
            System.out.println("Excetion :" + e);
        }

    }

    public static void main(String[] args) {
        program18 obj = new program18();
        obj.start();
        obj.interrupt();

    }

}
//