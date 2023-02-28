package org.example;
import java.util.Scanner;
import java.util.logging.Logger;

public class ContactList {
    public static void main(String[] args) {
        Logger l=Logger.getLogger("welcome");
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        LinkedList ll = new LinkedList();
        int ch=0;
        l.info("\n 1.To Add the contact.\n2.To Insert the contact.\n3.To Delete the contact.\n4.To Search the Contact.\n5.To Display the contact.\n6.To exit.");
        do {
            l.info("Enter your choice:");
            ch=s.nextInt();
            switch (ch) {
                case 1 -> {
                    l.info("Enter the number of contacts you want to add:");
                    int size = s.nextInt();
                    int i = 0;
                    while (i < size) {
                        l.info("Enter name,phonenumber,emailid to add:");
                        ll.addContact(s1.nextLine(), s.nextLong(), s1.nextLine());
                        i++;
                    }
                }
                case 2 -> {
                    l.info("Enter name,phonenumber,emailid,index to insert:");
                    ll.insertContact(s1.nextLine(), s.nextLong(), s1.nextLine(), s.nextInt());
                }
                case 3 -> {
                    l.info("Enter index to delete:");
                    ll.deleteContact(s.nextInt());
                }
                case 4 -> {
                    l.info("Enter contact name to search:");
                    ll.searchContact(s1.nextLine());
                }
                case 5 -> ll.displayContact();
                case 6 -> System.exit(0);
                default -> l.info("Invalid choice.");
            }
        }while(ch!=6);
    }
}