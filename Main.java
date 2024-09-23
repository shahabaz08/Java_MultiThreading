import java.util.Scanner;

class Earphone {
    int id;
    String name;
    String company;
    double price;
    Earphone next;
    String type;

    Earphone(int id, String name, String company, double price) {
        this.id = id;
        this.name = name;
        this.company = company;
        this.price = price;
        this.type = "Earphones";
        this.next = null;
    }
}

class Earphones {
    Earphone head;

    Earphones() {
        head = null;
    }

    public Earphone InsertLast(Earphone head, Earphone newn) {

        if (head == null) {
            head = newn; // If list is empty, make newEarphone the head
        } else {
            Earphone temp = head;
            while (temp.next != null) {
                temp = temp.next; // Traverse to the last node
            }
            temp.next = newn; // Link new earphone to the last node
        }
        return head;
    }

    public Earphone getEarphone() {
        return head;
    }

    public void insert() {
        head = new Earphone(101, "AirPods Pro 2", "Apple", 24900.00);

        Earphone newn = new Earphone(102, "AirPods 4", "Apple", 12900.00);
        head = InsertLast(head, newn);

        newn = new Earphone(103, "AirPods 4 With Active Noise Cancellation", "Apple", 17900.00);
        head = InsertLast(head, newn);

        newn = new Earphone(104, "EarPods (USB-C)", "Apple", 2000.00);
        head = InsertLast(head, newn);

        newn = new Earphone(105, "AirPods Pro 2 Ear Tips - 4 pairs", "Apple", 12000.00);
        head = InsertLast(head, newn);

        newn = new Earphone(106, "Beats Studio Pro - Kim Special Edition - Dune", "Apple", 37000.00);
        head = InsertLast(head, newn);

        // ----------------------------Bose Earphones---------------------------

        newn = new Earphone(107, "Bose new QuiteComfort", "Bose", 25899.00);
        head = InsertLast(head, newn);

        newn = new Earphone(108, "Bose Ultra Open Wireless", "Bose", 25900.00);
        head = InsertLast(head, newn);

        newn = new Earphone(109, "Bose Sound Support", "Bose", 6499.00);
        head = InsertLast(head, newn);

        newn = new Earphone(110, "Bose SoundSport Headphones - In-Ear", "Bose", 10863.00);
        head = InsertLast(head, newn);

        newn = new Earphone(111, "Bose SoundSport Free Wireless Earbuds - Midnight", "Bose", 16773.00);
        head = InsertLast(head, newn);

        newn = new Earphone(112, "Bose SoundSport In-Ear Headphones", "Bose", 16573.00);
        head = InsertLast(head, newn);

        // ----------------------------- Sony Earphones------------------------------

        newn = new Earphone(113, "WF-1000XM5 Wireless Noise Cancelling Headphones", "Sony", 29900.00);
        head = InsertLast(head, newn);

        newn = new Earphone(114, "WF-1000XM3 Wireless Noise Cancelling Headphones", "Sony", 29956.00);
        head = InsertLast(head, newn);

        newn = new Earphone(115, "LinkBuds S", "Sony", 24990.00);
        head = InsertLast(head, newn);

        newn = new Earphone(116, "WF-L900 Wireless", "Sony", 19990.00);
        head = InsertLast(head, newn);

        newn = new Earphone(117, "WF-C500 Truly Wireless Headphones", "Sony", 19990.00);
        head = InsertLast(head, newn);
        // ------------------------------ jbl Earphones--------------------------

        newn = new Earphone(118, "JBL Tune 125TWS", "JBL", 10990.00);
        head = InsertLast(head, newn);

        newn = new Earphone(119, "JBL Live 300TWS", "JBL", 18990.00);
        head = InsertLast(head, newn);

        newn = new Earphone(120, "JBL Endurance Dive", "JBL", 15990.00);
        head = InsertLast(head, newn);

        newn = new Earphone(121, "JBL Reflect Flow", "JBL", 18990.00);
        head = InsertLast(head, newn);

        newn = new Earphone(122, "JBL Quantum 800", "JBL", 19700.00);
        head = InsertLast(head, newn);
        newn = new Earphone(123, " Over-ear, Wireless Gaming Headset", "JBL", 16700.00);
        head = InsertLast(head, newn);

        // ------------------------ Audio Tecnica Earphones------------------

        newn = new Earphone(124, "Audio-Technica ATH-M50x", "Audio-Technica", 9990.00);
        head = InsertLast(head, newn);

        newn = new Earphone(125, "Audio-Technica ATH-CKS5TW", "Audio-Technica", 9000.00);
        head = InsertLast(head, newn);

        newn = new Earphone(126, "Audio-Technica ATH-ANC300TW", "Audio-Technica", 6990.00);
        head = InsertLast(head, newn);

        newn = new Earphone(127, "Audio-Technica ATH-IM50", "Audio-Technica", 6390.00);
        head = InsertLast(head, newn);

        newn = new Earphone(128, "Audio-Technica ATH-SR30BT", "Audio-Technica", 8900.00);
        head = InsertLast(head, newn);

        // ------------------------ BeatsEarphones-------------------

        newn = new Earphone(129, "Beats Studio Buds", "Beats", 14999);
        head = InsertLast(head, newn);

        newn = new Earphone(130, "Beats Powerbeats Pro", "Beats", 19999.00);
        head = InsertLast(head, newn);

        newn = new Earphone(131, "Beats Flex", "Beats", 8999.00);
        head = InsertLast(head, newn);

        newn = new Earphone(132, "Beats Fit Pro", "Beats", 20999.00);
        head = InsertLast(head, newn);

        newn = new Earphone(133, "Beats Solo Pro", "Beats", 24999.00);
        head = InsertLast(head, newn);

        // ------------------------ Sennheiser Earphones-------------------

        newn = new Earphone(134, "Sennheiser Momentum True Wireless 3", "Sennheiser", 20000);
        head = InsertLast(head, newn);

        newn = new Earphone(135, "Sennheiser IE 300", "Sennheiser", 24000.00);
        head = InsertLast(head, newn);

        newn = new Earphone(136, "Sennheiser HD 458BT", "Sennheiser", 20590.00);
        head = InsertLast(head, newn);

        newn = new Earphone(137, "Sennheiser CX 400BT", "Sennheiser", 16000.00);
        head = InsertLast(head, newn);

        newn = new Earphone(138, " Sennheiser HD 600", "Sennheiser", 32000.00);
        head = InsertLast(head, newn);

        // ------------------------ Jabra Earphones-------------------

        newn = new Earphone(139, "Jabra Elite 75t", "Jabra", 14999);
        head = InsertLast(head, newn);

        newn = new Earphone(140, "Jabra Elite Active 75t", "Jabra", 16999.00);
        head = InsertLast(head, newn);

        newn = new Earphone(141, "Jabra Elite 85h", "Jabra", 24990.00);
        head = InsertLast(head, newn);

        newn = new Earphone(142, "Jabra Talk 45", "Jabra", 5999.00);
        head = InsertLast(head, newn);

        newn = new Earphone(143, "Jabra Elite 65t", "Jabra", 12999.00);
        head = InsertLast(head, newn);
        // ------------------------ Anker Earphones-------------------

        newn = new Earphone(144, "Anker Soundcore Liberty Air 2", "Anker", 8999);
        head = InsertLast(head, newn);

        newn = new Earphone(145, "Anker Soundcore Life P2", "Anker", 5999.00);
        head = InsertLast(head, newn);

        newn = new Earphone(146, "Anker Soundcore R100", "Anker", 3999.00);
        head = InsertLast(head, newn);

        newn = new Earphone(147, "Anker Soundcore Spirit X2", "Anker", 6999.00);
        head = InsertLast(head, newn);

        newn = new Earphone(148, "Anker Soundcore Life Q30", "Anker", 12999.00);
        head = InsertLast(head, newn);

    }

    public void displayByCompany(String companyName) {
        Earphone temp = head;
        boolean found = false;
        System.out.println("==== Best Products We have By Your Choice===");
        System.out.println("-------Company Name:" + companyName + "-------");
        System.out
                .println("-------------------------------------------------------------------------------------------");
        while (temp != null) {
            if (temp.company.equalsIgnoreCase(companyName)) {
                System.out.println("{ |id: " + temp.id + "|  |Price: " + temp.price + "|  |Name: " + temp.name
                        + "|  |Company: " + temp.company + " |}");
                found = true;
            }
            temp = temp.next;
        }
        System.out
                .println("-------------------------------------------------------------------------------------------");

        if (!found) {
            System.out.println("No earphones found for the company: " + companyName);
        }
    }

    public void DisplayALL() {

        Earphone temp = head;
        System.out.println("---------------------------------------------");
        int iCnt = 1;
        while (temp != null) {
            System.out.println("{ |id: " + temp.id + "|  |Price: " + temp.price + "|  |Name: " + temp.name
                    + "|  |Company: " + temp.company + " |}");
            temp = temp.next;
            iCnt++;
        }

        System.out.println();

    }

    public void DisplayOnBudget() {
        System.out.println("---------------------------------------------");

        Earphone temp = head;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter your Budget: ");
        int budget = sobj.nextInt();

        while (temp != null) {
            if (temp.price < budget) {
                System.out.println("{ |id: " + temp.id + "|  |Price: " + temp.price + "|  |Company: " + temp.company
                        + "|  |Name: " + temp.name + " |}");
            }
            temp = temp.next;
        }
        System.out.println();

    }

    public void D() {
        insert();
        System.out.println("---------------------------------------------");
        Scanner sobj = new Scanner(System.in);
        System.out.println("1.See all products");
        System.out.println("2.Based On Company");
        System.out.println("3.Based On Budget");
        System.out.print("Enter Choice here :");
        int ino = sobj.nextInt();
        switch (ino) {
            case 1:
                DisplayALL();
                break;
            case 2:
                display();
                break;
            case 3:
                DisplayOnBudget();
                break;
            default:
                System.out.println("Invalid Choice");
                break;
        }

    }

    public void display() {
        Scanner sobj = new Scanner(System.in);
        System.out.println("---------------------------------------------");
        System.out.println("Select a company:");
        System.out.println("1. Apple");
        System.out.println("2. Bose");
        System.out.println("3. Sony");
        System.out.println("4. JBL");
        System.out.println("5. Audio-Technica");
        System.out.println("6. Sennheiser");
        System.out.println("7. Beats");
        System.out.println("8. Jabra");
        System.out.println("9. Anker");

        System.out.print("Enter your choice (1-9): ");
        int choice = sobj.nextInt();

        switch (choice) {
            case 1:
                displayByCompany("Apple");
                break;
            case 2:
                displayByCompany("Bose");
                break;
            case 3:
                displayByCompany("Sony");
                break;
            case 4:
                displayByCompany("JBL");
                break;
            case 5:
                displayByCompany("Audio-Technica");
                break;
            case 6:
                displayByCompany("Sennheiser");
                break;

            case 7:
                displayByCompany("Beats");
                break;
            case 8:
                displayByCompany("Jabra");
                break;
            case 9:
                displayByCompany("Anker");
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
    }
}

class emp {
    int id;
    String name;

    String Section;
    double Salary;
    int Sold;
    emp next;
    double Commision;

    emp(int id, String name, String Section, double Salary, Double Comission, int Sold) {
        this.id = id;
        this.name = name;
        this.Section = Section;
        this.Salary = Salary;
        this.Commision = Comission;
        this.next = null;
    }

}

class Employee {
    emp head;

    Employee() {
        head = null;
    }

    public emp InsertLast(emp head, emp newn) {

        if (head == null) {
            head = newn;
        } else {
            emp temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newn;
        }
        return head;
    }

    public void insert() {
        head = new emp(1001, "Rekha", "Receptionast", 15000, 0.0, 0);

        emp newn = new emp(1002, "Anil", "Refrigrator And Washing Machine", 12000, 0.0, 0);
        head = InsertLast(head, newn);

        newn = new emp(1002, "Suresh", "Mobile And Smart-Watches", 12000, 0.0, 0);
        head = InsertLast(head, newn);

        newn = new emp(1002, "Mulesh", "Laptops", 12000, 0.0, 0);
        head = InsertLast(head, newn);

        newn = new emp(1002, "Rajesh", "Earphones and Speakers", 12000, 0.0, 0);
        head = InsertLast(head, newn);
    }

    public void Display() {
        insert();
        System.out.println("Employess Details are : ");
        emp temp = head;
        while (temp != null) {
            System.out.println("-----------------------------------------------");
            System.out.println("id: " + temp.id + "| Name: " + temp.name);
            System.out.println("Section: " + temp.Section + "| Salary: " + temp.Salary);
            System.out.println("Items Sold: " + temp.Sold + "| Commition: " + temp.Commision);
            temp = temp.next;
        }
        System.out.println();
        System.out.println();
    }

}

class sCart {
    int id;
    String type;
    String Company;
    double Price;
    sCart next;

    sCart(int id, String type, String Companny, double price) {
        this.id = id;
        this.type = type;
        this.Company =Companny;
        this.Price = price;
        this.next = null;
    }
}

class Billing {
    sCart cartHead;

    // Insert a new item at the end of the cart
    public void InsertFirst(sCart newn) {
        if (cartHead == null) {
            cartHead = newn;
        } else {
            sCart temp = cartHead;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newn;
        }
    }
    public void insertcart() {
        System.out.println("Please Enter Product ID: ");
        Scanner sobj = new Scanner(System.in);
        int id = sobj.nextInt();
        sCart c = null;

        if (id > 99 && id < 200) {
            Earphones earphoneList = new Earphones();
            earphoneList.insert(); 
            Earphone temp = earphoneList.getEarphone();
            while (temp != null) {
                if (temp.id == id) {
                    c = new sCart(temp.id, temp.type, temp.company, temp.price);
                    System.out.println("Added to cart: " + temp.name + " | Price: " + temp.price);
                    InsertFirst(c);
                    return; 
                }
                temp = temp.next; 
            }

            System.out.println("Wrong ID: No item found with that ID.");
        } else {
            System.out.println("Invalid ID: ID should be between 100 and 199.");
        }
    }

    // Display the contents of the cart
    public void Cart() {
        sCart temp = cartHead;
        double total = 0;
        int count = 0;

        System.out.println("========================================================================");
        while (temp != null) {
            System.out.printf("{ ID: %d | Product: %s | Company: %s | Price: %.2f }\n",
                    temp.id, temp.type, temp.Company, temp.Price);
            total += temp.Price; 
            count++;
            temp = temp.next;
        }
        if (count > 0) {
            System.out.println("Total Items: " + count + " | Total Price: " + String.format("%.2f", total));
        } else {
            System.out.println("Your cart is empty.");
        }
        System.out.println("========================================================================");
    }

    // Placeholder for receipt functionality
    public void receipt() {
        // Implementation for receipt generation can be added here
    }
}


class Main {

    public static void main(String[] args) {
        Billing o = new Billing();
        System.out.println("=================================");
        System.out.println("Welcome to My Electronics Mall");
        System.out.println("=================================");
        System.out.println("1. Login for Owner");
        System.out.println("2. Login for Staff");
        System.out.println("3. Login for User");
        System.out.print("Please Enter your choice: ");
        Scanner sobj = new Scanner(System.in);
        int choice = sobj.nextInt();


        switch (choice) {
            case 1:
                System.out.println("Login as Owner");
                Employee emp = new Employee();
                emp.Display();
                break;
            case 2:
                System.out.println("Login as Staff");
                break;
            case 3:
                System.out.println("---------------------------------------------");
                while (true) {
                    
                System.out.println("| Please Show us Your Interests |");
                System.out.println("1.Laptop");
                System.out.println("2.Mobile");
                System.out.println("3.Earphones");
                System.out.println("4.Smart Watch");
                System.out.println("5.Speakers");
                System.out.println("6.Regigrator");
                System.out.println("7.Washing Mashine");
                System.out.println("8.Add to Cart");
                System.out.println("9.See Cart");
                System.out.println("10.Buy");
                
                System.out.print("Please Enter Your Choice : ");
                int Choice = sobj.nextInt();
                
                
                switch (Choice) {
                    case 1:
                        System.out.println("Incomplete Laptop");
                        break;

                    case 2:
                        System.out.println("Incomplete Mobile");
                        break;
                    case 3:
                        Earphones obj = new Earphones();
                        obj.D();
                        break;

                    case 4:
                        System.out.println("Incomplete Laptop");
                        break;

                    case 5:
                        System.out.println("Incomplete Laptop");
                        break;

                    case 6:
                        System.out.println("Incomplete Laptop");
                        break;

                    case 7:
                        System.out.println("Incomplete Laptop");
                        break;
                    case 8:
                        System.out.println("Please Enter Number of Items");
                        int ino=sobj.nextInt();
                        for(int i=1;i<=ino;i++){
                            o.insertcart();
                        }
                        // break;
                    case 9:
                        o.Cart();
                        break;

                    default:
                        System.out.println("Invalid Choice");
                        break;
                }
            }
            default:
                System.out.println("Invalid choice. Please enter a correct choice.");
                break;
        }
    }
}
