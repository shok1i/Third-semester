package Work_11.Number_2;

public class Student {
    private String Name;
    private int GPA;

    public Student (String name, int gpa){ Name = name; GPA = gpa; }

    public int getGPA() { return GPA; }
    public String getName() { return Name; }
    public void setGPA(int gpa) { GPA = gpa; }
    public void setName(String name) { Name = name; }

    @Override
    public String toString() { return "Student{" + "name='" + Name + '\'' + ", GPA=" + GPA + '}'; }
}
