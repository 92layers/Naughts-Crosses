/**
 * A simple naughts and crosses generator to practice JFrame
 * implementations with Images.
 *
 * @author Luke Ritchie
 * @version 0.1
 *
 */

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Game extends JFrame {

    public Game(){
        Random rand = new Random();
        int ranNum;
        ImageIcon naught = new ImageIcon("ExOhs\\Images\\Naught.JPG");
        ImageIcon cross = new ImageIcon("ExOhs\\Images\\Cross.JPG");

        ArrayList<JLabel> images = new ArrayList<JLabel>();
        for (int i = 0; i < 9; i++){
            images.add(new JLabel());
        }

        setLayout(new GridLayout(3, 3));

        for (JLabel j : images){
            ranNum = rand.nextInt(3);
            j.setBorder(new LineBorder(Color.BLACK, 2));
            j.setBackground(Color.WHITE);
            j.setOpaque(true);
            switch (ranNum){
                case 0:
                    j.setIcon(null);
                    break;
                case 1:
                    j.setIcon(naught);
                    break;
                case 2:
                    j.setIcon(cross);
                    break;
            }
            add(j);
        }
    }

    public static void main(String[] args) {
        Game frame = new Game();
        frame.setTitle("Naughts & Crosses");
        frame.setSize(1250, 1020);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

}