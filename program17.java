public class program17 extends Thread {

    public void run() {

        System.out.println(Thread.interrupted());
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
        program17 obj = new program17();
        obj.start();
        obj.interrupt();

    }

}
