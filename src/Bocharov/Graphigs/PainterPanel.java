package Bocharov.Graphigs;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Nodyke on 28.04.2016.
 */
public class PainterPanel extends JPanel {
    JButton start=new JButton("Старт");
    JButton stop=new JButton("Пауза");
    int[] data;
    {
        this.setLayout(null);
        start.setBounds(this.getX(),250,100,20);
        this.add(start);
        stop.setBounds(this.getX(),280,100,20);
        this.add(stop);

    }

    public PainterPanel(int[] data) {
        this.data = data;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int i=0;i<data.length;i++) {
            g.setColor(Color.BLUE);
            g.fillRect(0,i*12,data[i],10);

        }
    }
}
