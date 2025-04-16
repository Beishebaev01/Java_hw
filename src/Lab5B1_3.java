import javax.swing.*;
import java.awt.*;

public class Lab5B1_3 extends JPanel {
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        drawGrid(g);

        // Корпус гитары
        g.setColor(new Color(144, 16, 16));
        int[] x1 = {225, 50, 150, 150, 250};
        int[] y1 = {150, 250, 250, 350, 175};
        g.drawPolygon(x1, y1, 5);
        g.fillPolygon(x1, y1, 5);

        // Гриф гитары
        g.setColor(Color.BLACK);
        int[] x2 = {200, 225, 350, 325};
        int[] y2 = {175, 200, 75, 50};
        g.drawPolygon(x2, y2, 4);
        g.fillPolygon(x2, y2, 4);

        // Голова гитары
        g.setColor(new Color(182, 22, 22));
        int[] x3 = {320, 355, 370, 355};
        int[] y3 = {45, 80, 45, 30};
        g.drawPolygon(x3, y3, 4);
        g.fillPolygon(x3, y3, 4);

        // Струны
        g.setColor(Color.WHITE);
        g.drawLine(150, 225, 355, 40);
        g.drawLine(152, 227, 353, 45);
        g.drawLine(154, 229, 351, 50);
        g.drawLine(156, 231, 349, 55);
        g.drawLine(158, 233, 347, 60);
        g.drawLine(160, 235, 345, 65);
    }
    int width = 500;
    int height = 500;
    private void drawGrid(Graphics g) {
        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.BOLD, 10));
        int len = 20;
        for (int x = 0; x < width - len; x+=len) {
            g.drawLine(x, len, x, height - len);
            g.drawString(String.valueOf(x), x - 10, 20);
        }
        for (int y = 0; y < height - len; y+=len) {
            g.drawLine(len, y, width - len, y);
            g.drawString(String.valueOf(y), 5, y + 5);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Электрогитара");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(500, 500);
        frame.setBackground(Color.WHITE);
        frame.add(new Lab5B1_3());
        frame.setVisible(true);
    }
}
