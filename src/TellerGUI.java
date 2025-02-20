//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
//public class TellerGUI implements ActionListener{
//    public JFrame frame;
//    public JPanel panel;
//    public JPanel panel2;
//    public JLabel label1;
//    public JLabel label2;
//    public JButton deposit;
//    public JButton withdraw;
//    public JButton exit;
//    public JTextField field1;
//    public JTextField field2;
//    public Account acct;
//    public TellerGUI(){
//        acct = new Account();
//        frame = new JFrame("Teller GUI");
//        panel = new JPanel();
//        panel2 = new JPanel();
//        label1 = new JLabel("Balance");
//        label2 = new JLabel("Amount");
//        deposit = new JButton("Deposit");
//        deposit.addActionListener(this);
//        withdraw = new JButton("Withdraw");
//        withdraw.addActionListener(this);
//        exit = new JButton("Exit");
//        exit.addActionListener(this);
//        field1 = new JTextField(String.valueOf(acct.getBalance()));
//        field1.setEditable(false);
//        field2 = new JTextField();
//        frame.setLayout(new GridLayout(2,2));
//        panel.setLayout(new GridLayout(2,2));
//        panel.add(label1);
//        panel.add(field1);
//        panel.add(label2);
//        panel.add(field2);
//        frame.add(panel);
//        panel2.add(deposit);
//        panel2.add(withdraw);
//        panel2.add(exit);
//        frame.add(panel2);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(350, 250);
//        frame.setVisible(true);
//    }
//    @Override
//    public void actionPerformed(ActionEvent ae) {
//        if(ae.getSource().equals(withdraw)){
//            acct.withdraw(Double.parseDouble(field2.getText()));
//            field1.setText(String.valueOf(acct.getBalance()));
//        }else if(ae.getSource().equals(deposit)){
//            acct.deposit(Double.parseDouble(field2.getText()));
//            field1.setText(String.valueOf(acct.getBalance()));
//        }else if(ae.getSource().equals(exit)){
//            System.exit(0);
//        }
//        field2.setText("");
//    }
//}
