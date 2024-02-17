package Work_2.Number_1;

public class Author {
    private String Name, Inbox;
    private char Gender;

    public Author(String name, String inbox, char gender){
        this.Name = name;
        this.Inbox = inbox;
        this.Gender = gender;
    }

    public String getName(){
        return this.Name;
    }

    public String getInbox (){
        return this.Inbox;
    }

    public void setInbox (String inbox){
        Inbox = inbox;
    }

    public char getGender () {
        return this.Gender;
    }
    @Override
    public String toString(){
        return  "Имя автора\t\t:\t" + getName() + "\n" +
                "Почта автора\t:\t" + getInbox() + "\n" +
                "Пол автора\t\t:\t" + getGender();
    }

}

