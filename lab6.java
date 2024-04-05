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
    }
}