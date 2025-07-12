package JAVA_PROJECTS;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class TallyCounter extends Frame {
    TextField display;
    Button increment;
    Button reset;
    TallyCounter(){
        display = new TextField("0");
        display.setBounds(50,50,300,50);

        increment = new Button("Increment");
        increment.setBounds(100,200,100,20);

        increment.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n = Integer.parseInt(display.getText());
                display.setText(String.valueOf(++n));   
            }
        });

        reset = new Button("Reset");
        reset.setBounds(250,200,50,20);

        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText("0");
            }
        });

        add(display);
        add(increment);
        add(reset);

        setLayout(null);
        setSize(500,500);
        setTitle("Tally Counter");
        setVisible(true);

    }
    public static void main(String[] args) {
        new TallyCounter();
    }
}
