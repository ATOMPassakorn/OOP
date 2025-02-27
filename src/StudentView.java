import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.*;

public class StudentView implements ActionListener, WindowListener {
    public JFrame frame;
    public JPanel panel1;
    public JButton deposit, withdraw;
    public JLabel label1, label2, label3;
    public JTextField textField1, textField2, textField3;
    public Student student = new Student();
    public StudentView(){
        frame = new JFrame();

        label1 = new JLabel("ID :");
        label2 = new JLabel("Name :");
        label3 = new JLabel("Money :");

        textField1 = new JTextField("");
        textField2 = new JTextField("");
        textField3 = new JTextField(String.valueOf(student.getMoney()));
        textField3.setEditable(false);
        loadHistory();

        deposit = new JButton("Deposit");
        deposit.addActionListener(this);
        withdraw = new JButton("Withdraw");
        withdraw.addActionListener(this);

        panel1 = new JPanel();
        panel1.setLayout(new GridLayout(4,2));
        panel1.add(label1);
        panel1.add(textField1);
        panel1.add(label2);
        panel1.add(textField2);
        panel1.add(label3);
        panel1.add(textField3);
        panel1.add(deposit);
        panel1.add(withdraw);

        frame.add(panel1);
        frame.addWindowListener(this);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(320,200);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(deposit)){
            student.setMoney(student.getMoney()+100);
            textField3.setText(String.valueOf(student.getMoney()));
        }
        if(e.getSource().equals(withdraw)){
            student.setMoney(student.getMoney()-100);
            textField3.setText(String.valueOf(student.getMoney()));
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {}

    @Override
    public void windowClosing(WindowEvent e) {
        try {
            saveHistory();
        }catch (Exception ex){
            ex.printStackTrace();
        }

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
        try(FileOutputStream fout = new FileOutputStream("StudentM.dat");){
            ObjectOutputStream oout = new ObjectOutputStream(fout);
            student.setID(Integer.parseInt(textField1.getText()));
            student.setName(textField2.getText());
            oout.writeObject(student);
            oout.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loadHistory(){
        File file = new File("StudentM.dat");
        if(!file.exists()){
            student = new Student();
            textField1.setText("");
            textField2.setText("");
            textField3.setText(String.valueOf(student.getMoney()));
            return;
        }
        try(FileInputStream fin = new FileInputStream(file);){
            if (fin.available() == 0) {
                student = new Student();
                textField1.setText("");
                textField2.setText("");
                textField3.setText(String.valueOf(student.getMoney()));
                return;
            }
            ObjectInputStream in = new ObjectInputStream(fin);
            student = (Student) in.readObject();
            in.close();
            textField1.setText(String.valueOf(student.getID()));
            textField2.setText(student.getName());
            textField3.setText(String.valueOf(student.getMoney()));
        } catch (EOFException ex){
            student = new Student();
            textField1.setText("");
            textField2.setText("");
            textField3.setText(String.valueOf(student.getMoney()));
        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new StudentView();
    }
}
