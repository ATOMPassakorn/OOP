import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.net.URL;
import java.util.Random;

public class Poring implements Runnable,MouseListener, WindowListener {
    public JFrame frame;
    public JPanel panel;
    public JLabel label1, label2;
    public static int count = 1;
    public int x,y;
    public Dimension screenSize;
    public Random random;
    public Poring(){
        ImageIcon icon = null;
        URL imageURL = Poring.class.getResource("poring.png");
        if(imageURL != null){
            ImageIcon originalIcon = new ImageIcon(imageURL);
            Image image = originalIcon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
            icon = new ImageIcon(image);
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

        screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        random = new Random();
        x = random.nextInt(screenSize.width - frame.getWidth() - 50);
        y = random.nextInt(screenSize.height - frame.getHeight() - 50);

        frame.pack();
        frame.setLocation(x, y);
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

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {

    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }

    @Override
    public void run() {
        try{
            while (true){
                frame.setLocation(x + random.nextInt(10) - 5,y + random.nextInt(10) - 5);
                Thread.sleep(500);
            }
        } catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
