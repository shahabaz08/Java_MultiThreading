public class program10 extends Thread {

    public void run() {
        System.out.println("Hellow");
        for (int i = 0; i < 10; i++) {

            try {
                sleep(500);
            } catch (Exception e) {
            }
        }
    }
}
