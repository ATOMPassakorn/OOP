import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyFrame implements MouseListener {
    public JFrame frame;
    public MyClock clock;
    public MyTimer timer;
    public Thread t;
    public MyFrame(){
        frame = new JFrame();
        clock = new MyClock();
        timer = new MyTimer();
        timer.addMouseListener(this);
        t = new Thread(timer);
        t.start();
        frame.add(timer);
        frame.setSize(300,150);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new MyFrame();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (timer.pause) {
            timer.resumeThread();
        } else {
            timer.pauseThread();
        }
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
