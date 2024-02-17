package Work_8;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;



public class Task_3 extends JFrame{
    private Timer timer;
    private int curFrame;

    public Task_3(){
        setTitle("Animation");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        AnimationPanel animationPanel = new AnimationPanel();

        timer = new Timer(100, e ->{
            animationPanel.NextFrame();
            setSize(440, 465);
            repaint();
        });
        timer.start();
        add(animationPanel);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
    class AnimationPanel extends  JPanel{
        private BufferedImage currentImg;

        public AnimationPanel(){
            curFrame = 0;
            LoadCurrentImg();
        }
        public void NextFrame(){
            curFrame++;
            if ((curFrame) >= 6)
                curFrame = 0;
            LoadCurrentImg();
        }
        public void LoadCurrentImg() {
            try {
                currentImg = ImageIO.read(new File("src\\Work_8__InProgress\\Animation\\" + (curFrame + 1) + ".jpg"));
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }

        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            graphics.drawImage(currentImg, 0, 0, null);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Task_3::new);
    }

}
