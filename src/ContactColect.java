import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ContactColect {
    private ArrayList<Contact> cCol = new ArrayList<Contact>();

    public void addC() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter: name, lastName, adress, and id");
        Contact contacts = new Contact(in.nextLine(),in.nextLine(),in.nextLine());
        contacts.setId(Integer.parseInt(in.nextLine()));

        cCol.add(contacts);
    }

    public void sortName(){
        Collections.sort(cCol, new SortName());
    }

    public void sortID(){
        Collections.sort(cCol, new SortID());
    }

    public void sortAdress(){
        Collections.sort(cCol, new SortAdress());
    }

    @Override
    public String toString() {
        String text = new String("Contact collection :\n");
        for(Contact cnt : cCol){
            text +=cnt.toString()+"\n";
        }
        return text;
    }

    public ArrayList<Contact> getcCol(){
        return cCol;
    }
}
