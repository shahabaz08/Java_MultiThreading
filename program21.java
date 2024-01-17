class Book {
    int Totalseats = 10;

    public void BookT(int seats) {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        synchronized (this) {

            if (Totalseats >= seats) {
                System.out.println(seats + " Seats Booked Succesfully");
                Totalseats = Totalseats - seats;
                System.out.println("Total seats" + Totalseats);
            } else {
                System.out.println("Seats Are not Booked");
                System.out.println("Total seats =" + Totalseats);

            }
            System.out.println(Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getName());
        }

    }
}

public class program21 extends Thread {
    static Book b;
    int seats;

    public void run() {
        b.BookT(seats);
    }

    public static void main(String arg[]) {
        b = new Book();
        program21 obj = new program21();
        obj.seats = 7;
        obj.start();
        program21 obj2 = new program21();
        obj2.seats = 6;
        obj2.start();
    }
}