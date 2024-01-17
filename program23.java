class Earnings extends Thread {
    int total = 0;

    public void run() {
        for (int i = 0; i <= 10; i++) {
            total += 100;
        }
    }
}

public class program23 {
    public static void main(String[] args) {
        Earnings obj = new Earnings();
        obj.start();
        System.out.println(obj.total);
    }
}
