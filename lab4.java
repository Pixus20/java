import java.awt.*;
import javax.swing.*;

public class lab4{
    public static void main(String[] args) {
        new Program("Program window");
    }
}

class Program extends JFrame {
    public Program(String str) {
        super(str);
        setSize(950, 600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container cont = getContentPane();
        cont.setLayout(new FlowLayout());

        JLabel label1 = new JLabel("Виконав: ст. гр. ПОс-11 Михальчук В.А");
        cont.add(label1);

        JLabel label2 = new JLabel("Перевірив: Кабак В. В.");
        cont.add(label2);
    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setFont(new Font("Serif", Font.PLAIN, 30));
        g.drawString("Лабораторна робота №4", 250, 100);

        g.setFont(new Font("Verdana", Font.ITALIC, 37));
        g.setColor(Color.MAGENTA);
        g.drawString("\"Створення віконного інтерфейсу\"", 150, 150);
    }
}
