package Main;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics;

public class Draw extends JPanel{
    int[] values;
    public Draw(int[] values){
        this.values = values;
    }
    public Draw(){}
    public void drawing(){
        repaint();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        //int incr = 2;
        int x = 10;
        int y = 380;
        for(int barHeight:values){
            g.setColor(Color.WHITE);
            g.fillRect(x, y-(barHeight), 4, barHeight);
            x+=4;
            g.setColor(Color.BLACK);
            g.fillRect(x, 0, 2, 600);
            x+=2;
        }
        g.setColor(Color.BLACK);
        g.fillRect(x, 0, 10, 600);
       
    }
}