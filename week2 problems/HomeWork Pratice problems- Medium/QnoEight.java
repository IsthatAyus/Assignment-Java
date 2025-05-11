/*8. Simple Contact Management
Create a class Contact with fields: name, phoneNumber, emailAddress.
Create 3 Contact objects.
Print the contact details only if the emailAddress is not empty (use if condition). */

class Contact {
    String name;
    long phoneNumber;
    String emailAddress;

    Contact(String name, long phoneNumber, String emailAddress) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }
    void printContactDetails() {
        if (!emailAddress.isEmpty()) {
            System.out.println("Name: " + name);
            System.out.println("Phone Number: " + phoneNumber);
            System.out.println("Email Address: " + emailAddress);
        }
    }
}
public class QnoEight {
    public static void main(String[] args) {
        Contact contact1 = new Contact("Alice", 1234567890L, "bKo6n@example.com");
        Contact contact2 = new Contact("Bob", 9876543210L, "");
        Contact contact3 = new Contact("Charlie", 5555555555L, "6jIY6@example.com");

        contact1.printContactDetails();
        contact2.printContactDetails();
        contact3.printContactDetails();
    }
}
