import java.util.Comparator;

public class SortAdress implements Comparator<Contact> {
    @Override
    public int compare(Contact contact, Contact contact2){
        return contact.getAddress().compareTo(contact2.getAddress());
    }
}
