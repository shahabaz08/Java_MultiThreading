public class program16 extends Thread {

    public void run() {
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
        program16 obj = new program16();
        obj.start();
        obj.interrupt();
    }

}
