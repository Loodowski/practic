import java.util.Comparator;

public class SortName implements Comparator<Students> {
    @Override
    public int compare(Students students, Students students2){
        return students.getName().compareTo(students2.getName());
    }
}
