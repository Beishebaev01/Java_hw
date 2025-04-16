import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lab5B2_3 extends JPanel {
    private int x1 = 200, x2 = 200, y1 = 25, y2 = 375;

    public Lab5B2_3() {
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (x1 <= 375) {
                    repaint();
                    x1 += 25;
                    x2 -= 25;
                } else {
                    ((Timer) e.getSource()).stop();
                }
            }
        });
        timer.start();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.BLACK);
        int tempX1 = 200, tempX2 = 200;
        while (tempX1 <= x1) {
            g.drawLine(tempX1, y1, tempX2, y2);
            tempX1 += 25;
            tempX2 -= 25;
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(500, 500);
        frame.setBackground(Color.WHITE);
        frame.add(new Lab5B2_3());
        frame.setVisible(true);
    }
}