import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ChatDemo implements ActionListener, WindowListener {
    JFrame frame;
    JTextArea textArea;
    JPanel panel1, panel2;
    JButton submit, reset;
    JTextField textField;
    Font thai;
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    public ChatDemo(){
        frame = new JFrame();
        frame.setLayout(new BorderLayout());

        thai = new Font("Tahoma", Font.PLAIN, 14);

        textArea = new JTextArea(45,20);
        textArea.setEditable(false);
        textArea.setFont(thai);
        textArea.setForeground(Color.BLUE);
        loadHistory();

        panel1 = new JPanel();
        submit = new JButton("Submit");
        submit.addActionListener(this);
        reset = new JButton("Reset");
        reset.addActionListener(this);
        panel1.add(submit);
        panel1.add(reset);

        textField = new JTextField(45);
        textField.setFont(thai);

        panel2 = new JPanel();
        panel2.setLayout(new GridLayout(2,1));
        panel2.add(textField);
        panel2.add(panel1);

        frame.add(textArea,BorderLayout.CENTER);
        frame.add(panel2,BorderLayout.SOUTH);
        frame.addWindowListener(this);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450,350);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource().equals(submit)){
            if(!textField.getText().isEmpty()){
                textArea.append(dtf.format(LocalDateTime.now())+" : "+textField.getText()+"\n");
                textField.setText("");
            }

        }
        if(ae.getSource().equals(reset)){
            textArea.setText("");
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {}

    @Override
    public void windowClosing(WindowEvent e) {
        saveHistory();
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {}

    @Override
    public void windowIconified(WindowEvent e) {}

    @Override
    public void windowDeiconified(WindowEvent e) {}

    @Override
    public void windowActivated(WindowEvent e) {}

    @Override
    public void windowDeactivated(WindowEvent e) {}

    public void saveHistory(){
        try(FileOutputStream fout = new FileOutputStream("ChatDemo.dat");){
            fout.write(textArea.getText().getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loadHistory(){
        File file = new File("ChatDemo.dat");
        if (!file.exists()) {
            saveHistory();
            return;
        }
        try(FileInputStream fin = new FileInputStream(file);){
            InputStreamReader in = new InputStreamReader(fin);
            BufferedReader bin = new BufferedReader(in);
            StringBuilder content = new StringBuilder();
            String line;

            while ((line = bin.readLine()) != null) {
                content.append(line).append("\n");
            }

            textArea.setText(content.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new ChatDemo();
    }

}
