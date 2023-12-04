import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.reflect.*;

public class Main extends JFrame {
    Main() {
        JFrame jfrm = new JFrame("Game Arcade");

        JButton b1 = new JButton("Pong");
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Class<?> pongClass = Class.forName("PongGame");
                    String[] args = {};
                    pongClass.getDeclaredMethod("main", String[].class).invoke(null, (Object) args);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        jfrm.add(b1);

        JButton b2 = new JButton("Snake");
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Class<?> snakeClass = Class.forName("SnakeGame");
                    String[] args = {};
                    snakeClass.getDeclaredMethod("main", String[].class).invoke(null, (Object) args);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        jfrm.add(b2);

        JButton b3 = new JButton("Tic-Tac-Toe");
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Class<?> ticTacToeClass = Class.forName("TMain");
                    String[] args = {};
                    ticTacToeClass.getDeclaredMethod("main", String[].class).invoke(null, (Object) args);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        jfrm.add(b3); 
        JButton b4 = new JButton("Sudoku");
        JButton b5 = new JButton("Minesweeper");
        JButton b6 = new JButton("Memory Game");
        jfrm.add(b4);
        jfrm.add(b5);
        jfrm.add(b6);


        jfrm.setSize(500, 500);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.setLayout(new GridLayout(2, 3));
        jfrm.setResizable(false);
        jfrm.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Main();
            }
        });
    }
}
