import java.util.Scanner;

public class Warehouse {
    public static void main(String[] args) {
        Inventory inv = new Inventory();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1 Add Item");
            System.out.println("2 Remove Item");
            System.out.println("3 Update Quantity");
            System.out.println("4 Search by ID");
            System.out.println("5 Search by Name");
            System.out.println("6 Display Items");
            System.out.println("0 Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    String id = sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Quantity: ");
                    int qty = sc.nextInt();
                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();

                    Item item = new Item(id, name, qty, price);
                    inv.addItem(item);
                    break;

                case 2:
                    System.out.print("Enter ID: ");
                    inv.removeItem(sc.nextLine());
                    break;

                case 3:
                    System.out.print("Enter ID: ");
                    String uid = sc.nextLine();
                    System.out.print("Enter new quantity: ");
                    int newQty = sc.nextInt();
                    inv.updateQuantity(uid, newQty);
                    break;

                case 4:
                    System.out.print("Enter ID: ");
                    inv.searchById(sc.nextLine());
                    break;

                case 5:
                    System.out.print("Enter Name: ");
                    inv.searchByName(sc.nextLine());
                    break;

                case 6:
                    inv.displayItems();
                    break;

                case 0:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Invalid");
            }

        } while (choice != 0);

        sc.close();
    }
}