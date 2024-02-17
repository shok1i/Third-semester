package Work_11.Number_1;

public class Student {
    private String Name;
    private int IdNumber;

    public Student(String name, int idNumber){ Name = name; IdNumber = idNumber; }

    public String getName() { return Name; }
    public int getIdNumber() { return IdNumber; }

    @Override
    public String toString() { return "Name=" + Name + '\t' + "IdNumber=" + IdNumber; }
}
