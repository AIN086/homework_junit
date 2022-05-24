public class Main {

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.makeGroup("Friends");
        phoneBook.addContactToGroup(new Contact("Ramil", "89886526423"), "Friends");
        phoneBook.addContactToGroup(new Contact("Alexandr", "8-999-888-99-88"), "Friends");
        phoneBook.addContactToGroup(new Contact("Victor", "89506648843"), "Friends");

        System.out.println("");

        System.out.println(phoneBook.searchGroupOfContact("Friends"));
        System.out.println();

        System.out.println("Found: " + phoneBook.searchContactOfNumber("89506648843"));


    }
}