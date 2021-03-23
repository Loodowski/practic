public class Students {
    private int id_studenta;
    private String fam;
    private String name;
    private int groupa;
    private String department;
    private String discipline;
    private int mark;
    private String nameTeacher;

    public Students(int id_studenta, String fam, String name, int groupa, String department) {
        this.id_studenta = id_studenta;
        this.fam = fam;
        this.name = name;
        this.groupa = groupa;
        this.department = department;
    }


    public int getId_studenta() {
        return id_studenta;
    }

    public void setId_studenta(int id_studenta) {
        this.id_studenta = id_studenta;
    }

    public String getFam() {
        return fam;
    }

    public void setFam(String fam) {
        this.fam = fam;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGroupa() {
        return groupa;
    }

    public void setGroupa(int groupa) {
        this.groupa = groupa;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public String getNameTeacher() {
        return nameTeacher;
    }

    public void setNameTeacher(String nameTeacher) {
        this.nameTeacher = nameTeacher;
    }

    @Override
    public String toString() {
        return "Students{" +
                "id_studenta=" + id_studenta +
                ", fam='" + fam + '\'' +
                ", name='" + name + '\'' +
                ", groupa=" + groupa +
                ", department='" + department + '\'' +
                ", discipline='" + discipline + '\'' +
                ", mark=" + mark +
                ", nameTeacher='" + nameTeacher + '\'' +
                '}';
    }
}
