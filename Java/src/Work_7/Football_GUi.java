package Work_7;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Football_GUi extends JFrame{

    private int AC_MILAN_score = 0, REAL_MADRID_score = 0;
    private JLabel ScoreResult = new JLabel ("Result:       0 X 0");
    private JLabel LastTeam = new JLabel    ("Last Scorer:  N/A");
    private JLabel Winner = new JLabel      ("Winner:       N/A");

    public Football_GUi(){
        setTitle("Match result");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(415, 240);

        AC_MILAN Button_1 = new AC_MILAN("AC_MILAN");
        Button_1.setBounds(0, 0, 160, 45);
        add(Button_1);

        REAL_MADRID Button_2 = new REAL_MADRID("REAL_MADRID");
        Button_2.setBounds(240, 0, 160, 45);
        add(Button_2);

        ScoreResult.setBounds(0, 100, 575, 90);
        LastTeam.setBounds(0, 140, 575, 90);
        Winner.setBounds(0, 100, 575, 90);

        add(ScoreResult);
        add(LastTeam);
        add(Winner);

        setLocationRelativeTo(null);
    }

    public class AC_MILAN extends JButton {
        public AC_MILAN(String text) {
            super(text);
            addActionListener(new AC_MILAN.PushActionListener());
        }

        private class PushActionListener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                AC_MILAN_score++;
                ScoreResult.setText("Result:       " + AC_MILAN_score + " X " + REAL_MADRID_score);
                LastTeam.setText("Last Scorer:  AC_MILAN");
                if (AC_MILAN_score > REAL_MADRID_score) Winner.setText("Winner:       AC_MILAN");
                else if (AC_MILAN_score == REAL_MADRID_score) Winner.setText("Winner:       DRAW");
            }
        }

    }

    public class REAL_MADRID extends JButton {
        public REAL_MADRID(String text) {
            super(text);
            addActionListener(new REAL_MADRID.PushActionListener());
        }

        private class PushActionListener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                REAL_MADRID_score++;
                ScoreResult.setText("Result:       " + AC_MILAN_score + " X " + REAL_MADRID_score);
                LastTeam.setText("Last Scorer:  REAL_MADRID");
                if (AC_MILAN_score < REAL_MADRID_score) Winner.setText("Winner:       REAL_MADRID");
                else if (AC_MILAN_score == REAL_MADRID_score) Winner.setText("Winner:       DRAW");
            }
        }

    }

    public static void main(String[]args){
        Football_GUi mainFrame = new Football_GUi();
        mainFrame.setVisible(true);
    }
}

