import java.io.*;
import java.util.Scanner;

public class Test implements Serializable {
    public static void main(String[] args) throws Exception{

        ContactColect cCol = new ContactColect();
        OrderColect oCol = new OrderColect();
        StudentColect sCol = new StudentColect();

        Scanner in = new Scanner(System.in);

        int end = 0;
        int ch;
        int chCol;
        while(end == 0){
            System.out.println("Choose:\n"+
                    "1 - add a collections\n"+
                    "2 - sort a collections\n"+
                    "3 - display collections\n"+
                    "4 - write to file\n"+
                    "5 - get from file\n"+
                    "0 - end");
            ch = in.nextInt();
            switch (ch){
                case 1:
                    System.out.println("Choose a collection\n"+
                            "1 - Contact\n"+
                            "2 - Order\n"+
                            "3 - Student");
                    chCol = in.nextInt();
                    if (chCol == 1)  cCol.addC();
                    else if (chCol == 2) oCol.addO();
                    else if (chCol == 3) sCol.addS();
                    break;
                case 2:
                    System.out.println("Choose a collection to sort\n" +
                            "1 - Sort contact by adress\n"+
                            "2 - Sort order by ID\n"+
                            "3 - Sort student by name");
                    chCol = in.nextInt();
                    if (chCol == 1) {
                        cCol.sortAdress();
                        System.out.println(cCol);
                    }
                    else if (chCol == 2) {
                        oCol.sortID();
                        System.out.println(oCol);
                    }
                    else if (chCol == 3){
                        sCol.sortName();
                        System.out.println(sCol);
                    }
                    break;
                case 3:
                    System.out.println(cCol);
                    System.out.println(oCol);
                    System.out.println(sCol);
                    break;
                case 4:
                    try {
                        FileOutputStream fileOut = new FileOutputStream("FileWithText.bin");
                        ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);

                        objectOut.writeObject(cCol);
                        objectOut.writeObject(oCol);
                        objectOut.writeObject(sCol);

                        objectOut.close();
                    }catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 5:
                    try{
                        FileInputStream fileIn = new FileInputStream("FileWithText.bin");
                        ObjectInputStream objectIn = new ObjectInputStream(fileIn);

                        ContactColect contactColect1 = (ContactColect) objectIn.readObject();
                        OrderColect orderColect1 = (OrderColect) objectIn.readObject();
                        StudentColect studentColect1 = (StudentColect) objectIn.readObject();

                        System.out.println(contactColect1);
                        System.out.println(orderColect1);
                        System.out.println(studentColect1);

                        objectIn.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 0:
                    end = 1;
                    break;
            }
        }
    }
}

