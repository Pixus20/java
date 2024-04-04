import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class lab5 {
    public static void main(String[] args) {
        new figuru("Program window");
    }
}
class figuru extends JFrame{
    JTextField text;
    JCheckBox check1;
    JCheckBox check2;
    JCheckBox check3;
    JComboBox<String> box;
    String[]colors = {"red", "blue", "yellow"};
    public void itemStateChanged(ItemEvent m){
        if (m.getStateChange()==ItemEvent.SELECTED){
            if(box.getSelectedIndex()==0)
                text.setBackground(Color.red);
            else if (box.getSelectedIndex()==1)
                text.setBackground(Color.blue);
            else if (box.getSelectedIndex()==2)
                text.setBackground(Color.yellow);
        }
    }
    public figuru(String str) {
        super(str);
        setSize(950, 600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container cont = getContentPane();
        cont.setLayout(new FlowLayout());
        JLabel label1 = new JLabel("Lab title");
        label1.setToolTipText("Java graphics components");
        cont.add(label1);
        text=new JTextField("Java graphics components");
        cont.add(text);
        check1 = new JCheckBox("Red");
        cont.add(check1);
        check2 = new JCheckBox("Blue");
        cont.add(check2);
        check3 = new JCheckBox("Yellow");
        cont.add(check3);
        Handler handler = new Handler();
        check1.addItemListener(handler);
        check2.addItemListener(handler);
        check3.addItemListener(handler);
        box = new JComboBox<>(colors);
        box.addItemListener(this::itemStateChanged); 
        cont.add(box);
    }
    class Handler implements ItemListener{
        Color color;
        public void itemStateChanged(ItemEvent e){
            if (e.getSource()==check1){
                if (e.getStateChange()==ItemEvent.SELECTED){
                    color = text.getBackground();
                    text.setBackground(Color.red);
                }
                else text.setBackground(color);
            }
            if (e.getSource()==check2){
                if (e.getStateChange()==ItemEvent.SELECTED){
                    color = text.getBackground();
                    text.setBackground(Color.blue);
                }
                else text.setBackground(color);
            }
            if (e.getSource()==check3){
                if (e.getStateChange()==ItemEvent.SELECTED){
                    color = text.getBackground();
                    text.setBackground(Color.yellow);
                }
                else text.setBackground(color);
            }
        }
    }
    
    public void paint (Graphics rys){
        rys.setFont(new Font("Tahoma", Font.CENTER_BASELINE,35));
        rys.drawString("Побудова геометричних фігур",100,150);
        rys.setColor(Color.ORANGE);
        rys.drawOval(250, 200, 300, 300);
        rys.setColor(Color.darkGray);
        rys.drawRect(240, 190, 320, 320);
        rys.setColor(Color.GRAY);
        rys.drawOval(250, 280, 300, 150);
        rys.setColor(Color.MAGENTA);
        rys.drawRoundRect(225, 180, 350, 350,25,25);
    }
}
