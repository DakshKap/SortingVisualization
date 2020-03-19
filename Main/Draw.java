package Main;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import java.awt.Color;
import java.awt.Graphics;
import java.util.concurrent.TimeUnit;

public class Draw extends JPanel {
    static int[] values;
    static JFrame frame;

    public static void initialize() {
        frame = new JFrame("Quick Sort");
        Draw draw = new Draw();
        frame.setVisible(true);
        frame.setSize(620, 550);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        draw.setBackground(Color.BLACK);
        frame.getContentPane().add(draw);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // int incr = 2;
        int x = 5;
        int y = 525;
        for (int barHeight : values) {
            g.setColor(Color.WHITE);
            g.fillRect(x, y - (barHeight), 4, barHeight);
            x += 4;
            g.setColor(Color.BLACK);
            g.fillRect(x, 0, 4, 600);
            x += 2;
        }
        g.setColor(Color.BLACK);
        g.fillRect(x, 0, 9, 600);
    }

    public static void updateValues(int[] arr) {
        
        values = arr;
        frame.getContentPane().repaint();
        try {
            //System.out.println("Sleeping");
            TimeUnit.MILLISECONDS.sleep(15);
           // System.out.println("Awake");
        } catch (InterruptedException e) {
            
            System.out.print("Interuption...................");
            e.printStackTrace();
        }
    }
}