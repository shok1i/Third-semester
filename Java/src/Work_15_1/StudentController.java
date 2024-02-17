package Work_15_1;

public class StudentController {
    private Student model;
    private StudentView view;

    public StudentController(){
        model = new Student();
        view = new StudentView();
    }
    public void setStudentName(String name){
        model.setName(name);
    }
    public String getStudentName(){
        return model.getName();
    }
    public void setStudentRollNo(String rollNo){
        model.setRollNo(rollNo);
    }
    public String getStudentRollNo(){
        return model.getRollNo();
    }
    public void updateView(){
        view.printStudentDetails(model);
    }
}
