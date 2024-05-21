package lesson_28.contacts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Contacts {
    private Map<String,String> contacts;

    public Contacts() {
        this.contacts = new HashMap<>();
    }

    public Map<String, String> getContacts() {
        return contacts;
    }
    public void addContact (Contact contact){
        contacts.put(contact.getName(), contact.getPhone());
        printContacts();
    }
    public void printContacts(){
        System.out.println("==========CONTACTS==========");
        for (int i = 0; i < contacts.size(); i++) {
            List<String> keys = new ArrayList<String>(contacts.keySet());
            System.out.println(keys.get(i) + "  " + contacts.get(keys.get(i)));
        }
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "contacts=" + contacts +
                '}';
    }
}
