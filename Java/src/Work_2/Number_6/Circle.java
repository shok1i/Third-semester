package Work_2.Number_6;

public class Circle {
    private double Radius;

    Circle(double radius){
        Radius = radius;
    }

    public void setRadius(double radius) { Radius = radius; }
    public double getRadius() { return Radius; }

    public double circleLength () { return 2 * Math.PI * getRadius(); }
    public double circleArea () { return Math.PI * Math.pow(getRadius(), 2); }
    public double circlePerimeter () { return 2 * Math.PI * getRadius(); }

    public String circleCheck (Circle second){
        if (this.getRadius() == second.getRadius()) return "Окружности равны";
        else if (this.getRadius() > second.getRadius()) return "Первая окружность больше";
        else return "Вторая окружность больше";
    }
}
