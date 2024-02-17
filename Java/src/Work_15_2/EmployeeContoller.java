package Work_15_2;

public class EmployeeContoller {
    private Employee employee;
    private EmployeeView view;

    public EmployeeContoller(){
        employee = new Employee();
        view = new EmployeeView();
    }
    public double getSalary(){
        return employee.getSalary();
    }
    public void setSalary(double salary){
        employee.setSalary(salary);
    }
    public void updateView(){
        view.printSalary(employee);
    }
}
