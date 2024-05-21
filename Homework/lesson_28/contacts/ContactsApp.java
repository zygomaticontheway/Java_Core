package lesson_28.contacts;

public class ContactsApp {
    public static void main(String[] args) {
        Contacts contacts = new Contacts();
        contacts.addContact(new Contact("Neo", "+4915110009900"));
        contacts.addContact(new Contact("Morphius", "+4915110009901"));
        contacts.addContact(new Contact("Trinity", "+4915110009902"));
    }

}
