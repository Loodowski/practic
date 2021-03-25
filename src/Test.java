import java.io.*;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter: name, lastName, adress, and id");
        Contact contacts = new Contact(in.nextLine(),in.nextLine(),in.nextLine());
        contacts.setId(Integer.parseInt(in.nextLine()));
        System.out.println(contacts);

        System.out.println("Enter: id, name of order, courier's name, date and type");
        Order orders = new Order(Integer.parseInt(in.nextLine()), in.nextLine(), in.nextLine());
        orders.setDateTime(in.nextLine());
        orders.setType(Integer.parseInt(in.nextLine()));
        System.out.println(orders);

        System.out.println("Enter: id, lastname, name, group and department, disciplin, mark and teacher name");
        Students student = new Students(Integer.parseInt(in.nextLine()),in.nextLine(),in.nextLine(),Integer.parseInt(in.nextLine()),in.nextLine());
        student.setDiscipline(in.nextLine());
        student.setMark((int) Double.parseDouble(in.nextLine()));
        student.setNameTeacher(in.nextLine());
        System.out.println(student);
        in.close();

        try {
            FileOutputStream fos = new FileOutputStream("FileWithText.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(contacts);
            oos.writeObject(orders);
            oos.writeObject(student);

            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

