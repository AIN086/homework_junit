public class Main {

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.makeGroup("Friends");
        phoneBook.makeGroup("Work");
        phoneBook.makeContact(phoneBook.searchGroupOfContact("Friends"), "Ramil", "89886526423");
        phoneBook.makeContact(phoneBook.searchGroupOfContact("Friends"), "Victor", "89125344800");
        phoneBook.makeContact(phoneBook.searchGroupOfContact("Work"), "Regina", "89506648843");
        phoneBook.makeContact(phoneBook.searchGroupOfContact("Work"), "Alexandr", "89643516648");
        phoneBook.makeContact(phoneBook.searchGroupOfContact("Work"), "Ramil", "89886526423");

        phoneBook.searchGroupOfContact("Friends").forEach(s -> System.out.print(s + " "));
        System.out.println();
        phoneBook.searchGroupOfContact("Work").forEach(s -> System.out.print(s + " "));
        System.out.println();

        System.out.println("Found: " + phoneBook.searchContactOfNumber("89506648843"));


    }
}