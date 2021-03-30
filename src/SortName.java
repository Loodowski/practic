import java.util.Comparator;

public class SortName implements Comparator<Contact> {
    @Override
    public int compare(Contact contact, Contact contact2){
        return contact.getFirstName().compareTo(contact2.getFirstName());
    }
}
