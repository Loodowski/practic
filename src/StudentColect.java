import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentColect {
    private ArrayList<Students> sCol = new ArrayList<Students>();

    public void addS(){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter: id, lastname, name, group, department, disciplin, mark and teacher name");
        Students student = new Students(Integer.parseInt(in.nextLine()),in.nextLine(),in.nextLine(),Integer.parseInt(in.nextLine()),in.nextLine());
        student.setDiscipline(in.nextLine());
        student.setMark((int) Double.parseDouble(in.nextLine()));
        student.setNameTeacher(in.nextLine());

        sCol.add(student);
    }

    public void sortName(){
        Collections.sort(sCol, new SortName());
    }

    public void sortID(){
        Collections.sort(sCol, new SortID());
    }

    @Override
    public String toString() {
        String text = new String("Students collection :\n");
        for(Students cnt : sCol){
            text +=cnt.toString()+"\n";
        }
        return text;
    }
    public ArrayList<Students> getcCol(){
        return sCol;
    }
}
