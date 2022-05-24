import java.util.*;

class PhoneBook {
    Map<String, List<Contact>> phoneBook = new HashMap<>();

    public void makeGroup(String groupName) {
        phoneBook.put(groupName, new ArrayList<>());
    }

    public void addContactToGroup(Contact contact, String groupname) {
        List<Contact> contacts = phoneBook.get(groupname);
        if(contacts.contains(contact)){
            System.out.println("Контакт с номером " + contact.getNumber() + " уже есть в группе " + groupname);
        }
        contacts.add(contact);
    }

    public  String searchGroupOfContact(String groupName) {
        List<Contact> contacts = phoneBook.get(groupName);
        StringBuilder list = new StringBuilder();
        list.append("Список контактов в группе ").append(groupName).append(":\n");
        if (contacts.isEmpty()) {
            list.append("Список пуст" + "\n");
            return list.toString();
        }
        for (Contact contact : contacts) {
            list.append(contact.toString()).append("\n");
        }
        return list.toString();

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