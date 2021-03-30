import java.util.Comparator;

public class SortID implements Comparator<Contact> {
    @Override
    public int compare(Contact contact, Contact contact2){
        return new Integer(contact.getId()).compareTo(new Integer(contact2.getId()));
    }
}
