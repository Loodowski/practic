import java.util.Comparator;

public class SortID implements Comparator<Order> {
    @Override
    public int compare(Order order, Order order2){
        return new Integer(order.getId()).compareTo(new Integer(order2.getId()));
    }
}
