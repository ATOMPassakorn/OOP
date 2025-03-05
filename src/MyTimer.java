import javax.swing.*;
import java.awt.*;
import java.util.Calendar;

public class MyTimer extends JLabel implements Runnable {
    private int sec=0,min=0,hour=0;
    public boolean pause = false;
    private synchronized void checkPause(){
        while (pause){
            try{
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void pauseThread(){
        pause = true;
    }
    public synchronized void resumeThread(){
        pause = false;
        this.notify();
    }
    @Override
    public void run() {
        try {
            while (true) {
                checkPause();
                setFont(new Font("Tahoma", Font.BOLD, 46));
                setText(String.format("%02d : %02d : %02d", hour, min, sec));
                setHorizontalAlignment(JLabel.CENTER);
                setVerticalAlignment(JLabel.CENTER);
                Thread.sleep(1000);
                sec++;
                if(sec>=60){
                    sec=0;
                    min++;
                }
                if(min>=60){
                    min=0;
                    hour++;
                }

            }
        } catch(InterruptedException e){
            e.printStackTrace();
        }
    }

}
