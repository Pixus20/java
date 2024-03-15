import java.awt.*;

import javax.swing.JLabel;


public class lab4 {
    program m = new program("Program windov");
}

class program extends javax.swing.JFrame{
    public void paint (Graphics rys){
        rys.setFont(new Font("Serif", Font.CENTER_BASELINE,30));
        rys.drawString("Лбораторна робота №4",250, 100);
        rys.setFont(new Font("Verdana", Font.ITALIC,37));
        rys.setColor(Color.MAGENTA);
        rys.drawString("\"Створення віконного інтерфейсу \"",250, 100);
    }
    public program (String str){
        super(str);
        setSize(800,600);
        setVisible(true);
        Container cont =getContentPane();
        cont.setLayout(new FlowLayout());
        JLabel label1 = new JLabel("Виконав");
        label1.setToolTipText("ст. гр. ПОс-11 Михальчук В.А");
        cont.add (label1);
        JLabel label2 = new JLabel("Перевірив:");
        label2.setToolTipText("Кабак В. В.");
        cont.add (label2);
    }
}

