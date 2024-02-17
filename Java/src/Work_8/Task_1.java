package Work_8;

import java.util.Random;
import javax.swing.*;
import java.awt.*;

abstract class Shape{
    protected Color Color;
    protected int X, Y;
    public Shape(Color color, int x, int y){
        Color = color; X = x; Y = y;
    }
    public abstract void draw(Graphics graphics);
}
class Rectangle extends Shape{
    private int Width, Height;
    public Rectangle(Color color, int x, int y, int width, int height){
        super(color, x, y); Width = width; Height = height;
    }
    @Override
    public void draw(Graphics graphics) {
        graphics.setColor(Color); graphics.fillRect(X, Y, Width, Height);
    }
}
class Circle extends Shape{
    int Rad;
    public Circle(Color color, int x, int y, int rad){
        super(color, x, y); Rad = rad;
    }
    @Override
    public void draw(Graphics graphics) {
        graphics.setColor(Color); graphics.fillOval(X - Rad, Y - Rad, 2 * Rad, 2 * Rad);
    }
}
public class Task_1 extends JPanel{
    private final int Width = 1280, Height = 720;
    private Shape[] shapes = new Shape[20];
    public Task_1(){
        Random random= new Random();
        for (int i = 0; i < shapes.length; i++) {
            int x = random.nextInt(Width), y = random.nextInt(Height);
            Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
            boolean type = random.nextBoolean();
            if (type)
                shapes[i] = new Rectangle(color, x, y, random.nextInt(50) + 5, random.nextInt(50) + 5);
            else
                shapes[i] = new Circle(color, x, y, random.nextInt(50) + 5);
        }
    }
    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        for (var shape : shapes)
            shape.draw(graphics);
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Random Shapes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1280, 720);
        frame.setLocationRelativeTo(null);
        Task_1 panel = new Task_1();
        frame.add(panel);
        frame.setVisible(true);
    }
}
