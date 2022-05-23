import java.util.*;

class PhoneBook {
    Map<String, List<Contact>> phoneBook = new HashMap<>();

    public void makeGroup(String groupName) {
        List<Contact> list = new ArrayList<>();
        phoneBook.put(groupName, list);
    }

    public void makeContact(List<Contact> list, String name, String number) {
        list.add(new Contact(name, number));
    }

    public List<Contact> searchGroupOfContact(String groupName) {
        return phoneBook.get(groupName);
    }

    public Contact searchContactOfNumber(String number) {
        for (String s : phoneBook.keySet()) {
            List<Contact> contacts = phoneBook.get(s);
            for (Contact contact : contacts) {
                if (contact.getNumber().equals(number)) {
                    return contact;
                }
            }
        }
        return null;
    }
}