import java.io.*;

public class Order implements Serializable{
    private int id;
    private String name;
    private String courier;
    private String dateTime;
    private int type;

    public Order(int id, String name, String courier) {
        this.id = id;
        this.name = name;
        this.courier = courier;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourier() {
        return courier;
    }

    public void setCourier(String courier) {
        this.courier = courier;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", courier='" + courier + '\'' +
                ", dateTime='" + dateTime + '\'' +
                ", type=" + type +
                '}';
    }
    class Orders extends Order{

        public Orders(int id, String name, String courier) {
            super(id, name, courier);
        }
    }

}
