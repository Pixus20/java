import java.applet.Applet;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;

public class lab7 extends Applet {
    Button btReady;
    CheckboxGroup grRadio;
    Choice chi;
    Label lbFirstName, lbSecondName;
    TextField txtFirstName, txtSecondName;
    TextArea txtArea;

    @Override
    public void init() {
        setLayout(new GridLayout(6, 2)); // Changed the GridLayout rows from 5 to 6

        lbFirstName = new Label("ВВЕДІТЬ ДАНІ ПРО ПЕРШОГО СТУДЕНТА");
        add(lbFirstName);
        txtFirstName = new TextField("", 30);
        add(txtFirstName);

        lbSecondName = new Label("ВВЕДІТЬ ДАНІ ПРО ДРУГОГО СТУДЕНТА");
        add(lbSecondName);
        txtSecondName = new TextField("", 30);
        add(txtSecondName);

        grRadio = new CheckboxGroup();
        Checkbox rd1 = new Checkbox("ЛАБОРАТОРНА РОБОТА 1", grRadio, true);
        add(rd1);
        Checkbox rd2 = new Checkbox("ЛАБОРАТОРНА РОБОТА 2", grRadio, false);
        add(rd2);
        Checkbox rd3 = new Checkbox("ЛАБОРАТОРНА РОБОТА 3", grRadio, false);
        add(rd3);

        chi = new Choice();
        chi.add("White");
        chi.add("Green");
        chi.add("Blue");
        add(chi);

        setBackground(Color.yellow);
        lbFirstName.setBackground(Color.yellow);
        lbSecondName.setBackground(Color.yellow);
        rd1.setBackground(Color.yellow);
        rd2.setBackground(Color.yellow);
        rd3.setBackground(Color.yellow);

        txtArea = new TextArea("", 6, 45);
        add(txtArea);
        txtArea.setBackground(Color.white);

        btReady = new Button("OВРОВИТИ ДАНІ");
        add(btReady);
    }

    @Override
    public String getAppletInfo() {
        return "Name: FormDemo";
    }

    @Override
    public void paint(Graphics g) {
        Dimension dimAppWnd = getSize();
        g.setColor(Color.black);
        g.drawRect(0, 0, dimAppWnd.width - 1, dimAppWnd.height - 1);
    }

    @Override
    public boolean action(Event evt, Object obj) {
        if (evt.target instanceof Button) {
            if (evt.target.equals(btReady)) {
                String str1 = txtFirstName.getText();
                String str2 = txtSecondName.getText();

                txtArea.append(str1);
                txtArea.append(str2);

                Checkbox selectedCheckbox = grRadio.getSelectedCheckbox();
                if (selectedCheckbox != null) {
                    txtArea.append("\n" + selectedCheckbox.getLabel() + "\n");
                }

                return true;
            }
        } else if (evt.target instanceof Choice) {
            if (evt.target.equals(chi)) {
                switch (chi.getSelectedIndex()) {
                    case 0:
                        txtArea.setBackground(Color.white);
                        break;
                    case 1:
                        txtArea.setBackground(Color.green);
                        break;
                    case 2:
                        txtArea.setBackground(Color.blue);
                        break;
                }
            }
        }
        return false;
    }
}
