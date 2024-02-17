package Work_8;

import java.awt.image.BufferedImage;
import javax.swing.*;
import java.awt.*;

public class Task_2 extends JPanel{
    private BufferedImage img;
    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        graphics.drawImage(img, 0, 0, null);
    }
    public static void main(String[] args) {
//        if (args.length == 0){
//            System.out.println("There's no path in the arguments");
//            return;
//        }
        String path;// = args[0];
        path = "src\\Work_8__InProgress\\img.jpg"; // Проверка работы
        JFrame frame = new JFrame("Img from path");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add( new JLabel(new ImageIcon(path)) );
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
