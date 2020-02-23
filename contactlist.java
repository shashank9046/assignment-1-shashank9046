import java.util.Scanner;

public class contactlist {
    public static void main(String [] args){
        execution object = new execution();
         Scanner sc = new Scanner(System.in);
        System.out.println("Hey there !! My name is Shashank. Welcome to my program ");
        int c = 0;
        while (c != 5) {
            System.out.println("<----------x------x---------->");
            System.out.println("Press 1 to add a new contact");
            System.out.println("Press 2 to view all contacts");
            System.out.println("Press 3 to search for a contact");
            System.out.println("Press 4 to delete a contact");
            System.out.println("Press 5 to exit program ");
            System.out.println("<-----------x------x---------->");
            int  choice = sc.nextInt();

            switch (choice) {
                case 1:
                    object.addcontacts();
                    break;
                case 2:
                    object.displaycontacts();
                    break;
                case 3:
                    object.search();
                    break;
                case 4:
                    object.delete();
                    break;
                case 5:
                    c = 5;
                    System.out.println("Thank you for using my Application..");
                    break;
                default:
                    System.out.println("Invalid choice!! Please select a valid choice.");
            }
        }
        sc.close();
    }
}
