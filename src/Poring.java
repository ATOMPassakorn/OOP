import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;

public class Poring implements MouseListener{
    public JFrame frame;
    public JPanel panel;
    public JLabel label1, label2;
    public static int count = 1;
    public Poring(){
        ImageIcon icon = null;
        URL imageURL = Poring.class.getResource("poring.png");
        if(imageURL != null){
            icon = new ImageIcon(imageURL);
        }

        frame = new JFrame();

        label1 = new JLabel(icon);
        label1.addMouseListener(this);

        label2 = new JLabel(String.valueOf(count));
        label2.setFont(new Font("Arial", Font.BOLD, 20));

        panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(label1);
        panel.add(label2);

        frame.add(panel);

        frame.pack();
        frame.setLocation(100,100);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        frame.dispose();
        Poring.count--;
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
