import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OrderColect implements Serializable {
    private ArrayList<Order> oCol = new ArrayList<Order>();

    public void addO(){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter: id, name of order, courier's name, date and type");
        Order orders = new Order(Integer.parseInt(in.nextLine()), in.nextLine(), in.nextLine());
        orders.setDateTime(in.nextLine());
        orders.setType(Integer.parseInt(in.nextLine()));

        oCol.add(orders);
    }

    public void sortID(){
        Collections.sort(oCol, new SortID());
    }

    @Override
    public String toString() {
        String text = new String("Order collection :\n");
        for(Order cnt : oCol){
            text +=cnt.toString()+"\n";
        }
        return text;
    }

    public ArrayList<Order> getoCol(){
        return oCol;
    }
}
