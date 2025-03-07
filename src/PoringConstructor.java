import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PoringConstructor implements ActionListener {
    public JFrame frame;
    public JPanel panel;
    public JButton button;
    public Thread t;
    public Poring poring;
    public PoringConstructor(){
        frame = new JFrame();
        frame.setLayout(new GridLayout(1,1));
        button = new JButton("Add");
        button.addActionListener(this);

        panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(button);

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(button)){
            poring = new Poring();
            t = new Thread(poring);
            t.start();
            Poring.count++;
        }
    }

    public static void main(String[] args) {
        new PoringConstructor();
    }
}
