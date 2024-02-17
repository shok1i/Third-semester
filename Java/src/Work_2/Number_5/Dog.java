package Work_2.Number_5;

public class    Dog {
    private String Name;
    private int Age;

    Dog(String name, int age){
        Name = name;
        Age = age;
    }

    public void setAge(int age) { Age = age; }
    public void setName(String name) { Name = name; }

    public int getAge() { return Age; }
    public String getName() { return Name; }

    public int converting(){
        return getAge() * 7;
    }

    public String ToString(){
        return "Name " + getName() + "\tAge " + getAge() + "\tConvering age " + converting();
    }

}
