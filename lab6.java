import java.awt.*;
import java.awt.event.*;

import javax.swing.JFrame;

public class lab6 {
    public static void main(String[] args){
        new Programa("Draw program:");
    }
}

class Programa extends JFrame{
    public Programa(String str){
        super(str);
        ScrollPane pane = new ScrollPane();
        pane.setSize(700, 700);
        add(pane,BorderLayout.CENTER);
        Scribble scr = new Scribble(this, 900, 700);
        pane.add(scr);
        MenuBar mb = new MenuBar();
        setMenuBar(mb);
        Menu f = new Menu("Файли");
        Menu v = new Menu("Малювати");
        mb.add(f); mb.add(v);

        MenuItem open =new MenuItem("Відкрити", new MenuShortcut(KeyEvent.VK_0));
        MenuItem save =new MenuItem("Зберегти", new MenuShortcut(KeyEvent.VK_S));
        MenuItem saveAs =new MenuItem("Зберегти як");
        MenuItem exit =new MenuItem("Вихід", new MenuShortcut(KeyEvent.VK_Q));
        f.add(open);
        f.add(save);
        f.add(saveAs);
        f.add(exit);

        open.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                FileDialog fd = new FileDialog(new Frame(), "Відкрити файл",FileDialog.LOAD);
                fd.setVisible(true);
            }
        });
        save.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                FileDialog fd = new FileDialog(new Frame(),"Зберегти файл",FileDialog.SAVE);
                fd.setVisible(true);
            }
        });
        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent ev){
                System.exit(0);
            }
        });

        Menu c =new Menu("Колір");
        v.add(c);
        MenuItem clear = new MenuItem("Очистити",new MenuShortcut(KeyEvent.VK_D));
        v.add(clear);
        MenuItem red = new MenuItem("Червоний");
        MenuItem green = new MenuItem("Зелений");
        MenuItem blue = new MenuItem("Синій");
        MenuItem black = new MenuItem("Чорний");
        c.add(red);c.add(green);c.add(blue);c.add(black);
        red.addActionListener(scr);
        green.addActionListener(scr);
        blue.addActionListener(scr);
        black.addActionListener(scr);
        clear.addActionListener(scr);


        Panel p =new Panel();
        add(p, BorderLayout.SOUTH);
        Button b1 = new Button("Червоний");
        p.add(b1);
        b1.addActionListener(scr);
        Button b2 = new Button("зелений");
        p.add(b2);
        b1.addActionListener(scr);
        Button b3 = new Button("Синій");
        p.add(b3);
        b1.addActionListener(scr);
        Button b4 = new Button("Чорний");
        p.add(b4);
        b1.addActionListener(scr);
        Button b5 = new Button("Очистити");
        p.add(b5);
        b1.addActionListener(scr);




    }
}