package Work_15_3;

public class PersonContoller {
    private Person model;
    private PersonView view;

    public PersonContoller(){
        model = new Person();
        view = new PersonView();
    }
    public double getDebt(){
        return model.getDebt();
    }
    public void setDebt(double debt){
        model.setDebt(debt);
    }
    public void updateView(){
        view.printDebt(model);
    }
}
