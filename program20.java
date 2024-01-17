class Book {
    int Totalseats = 10;

    synchronized public void BookT(int seats) {
        if (Totalseats >= seats) {
            System.out.println(seats + " Seats Booked Succesfully");
            Totalseats = Totalseats - seats;
            System.out.println("Total seats" + Totalseats);
        } else {
            System.out.println("Seats Are not Booked");
            System.out.println("Total seats =" + Totalseats);

        }
    }
}

public class program20 extends Thread {
    static Book b;
    int seats;

    public void run() {
        b.BookT(seats);
    }

    public static void main(String arg[]) {
        b = new Book();
        program20 obj = new program20();
        obj.seats = 7;
        obj.start();
        program20 obj2 = new program20();
        obj2.seats = 6;
        obj2.start();
    }
}