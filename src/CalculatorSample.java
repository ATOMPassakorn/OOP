import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CalculatorSample implements ActionListener{
    public JFrame frame;
    public JPanel panel;
    public JButton one;
    public JButton two;
    public JButton three;
    public JButton four;
    public JButton five;
    public JButton six;
    public JButton seven;
    public JButton eight;
    public JButton nine;
    public JButton zero;
    public JButton clear;
    public JButton equal;
    public JButton plusButton;
    public JButton minusButton;
    public JButton multiplyButton;
    public JButton divideButton;
    public JTextField field1;
    public double num1,num2,result;
    public char operator;
    public CalculatorSample(){
        frame = new JFrame("My Calculator");
        panel = new JPanel();
        one = new JButton("1");
        one.addActionListener(this);
        two = new JButton("2");
        two.addActionListener(this);
        three = new JButton("3");
        three.addActionListener(this);
        four = new JButton("4");
        four.addActionListener(this);
        five = new JButton("5");
        five.addActionListener(this);
        six = new JButton("6");
        six.addActionListener(this);
        seven = new JButton("7");
        seven.addActionListener(this);
        eight = new JButton("8");
        eight.addActionListener(this);
        nine = new JButton("9");
        nine.addActionListener(this);
        zero = new JButton("0");
        zero.addActionListener(this);
        clear = new JButton("c");
        clear.addActionListener(this);
        equal = new JButton("=");
        equal.addActionListener(this);
        plusButton = new JButton("+");
        plusButton.addActionListener(this);
        minusButton = new JButton("-");
        minusButton.addActionListener(this);
        multiplyButton = new JButton("×");
        multiplyButton.addActionListener(this);
        divideButton = new JButton("/");
        divideButton.addActionListener(this);
        field1 = new JTextField();
        frame.setLayout(new BorderLayout());
        frame.add(field1,BorderLayout.NORTH);
        panel.setLayout(new GridLayout(4,4));
        panel.add(seven);
        panel.add(eight);
        panel.add(nine);
        panel.add(plusButton);
        panel.add(four);
        panel.add(five);
        panel.add(six);
        panel.add(minusButton);
        panel.add(one);
        panel.add(two);
        panel.add(three);
        panel.add(multiplyButton);
        panel.add(zero);
        panel.add(clear);
        panel.add(equal);
        panel.add(divideButton);
        frame.add(panel,BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource().equals(one)){
            field1.setText(field1.getText()+"1");
        }else if(ae.getSource().equals(two)){
            field1.setText(field1.getText()+"2");
        }else if(ae.getSource().equals(three)){
            field1.setText(field1.getText()+"3");
        }else if(ae.getSource().equals(four)){
            field1.setText(field1.getText()+"4");
        }else if(ae.getSource().equals(five)){
            field1.setText(field1.getText()+"5");
        }else if(ae.getSource().equals(six)){
            field1.setText(field1.getText()+"6");
        }else if(ae.getSource().equals(seven)){
            field1.setText(field1.getText()+"7");
        }else if(ae.getSource().equals(eight)){
            field1.setText(field1.getText()+"8");
        }else if(ae.getSource().equals(nine)){
            field1.setText(field1.getText()+"9");
        }else if(ae.getSource().equals(zero)){
            field1.setText(field1.getText()+"0");
        }else if(ae.getSource().equals(clear)){
            field1.setText("");
        }else if(ae.getSource().equals(plusButton)){
            num1 = Double.parseDouble(field1.getText());
            operator = '+';
            field1.setText("");
        }else if(ae.getSource().equals(minusButton)){
            num1 = Double.parseDouble(field1.getText());
            operator = '-';
            field1.setText("");
        }else if(ae.getSource().equals(multiplyButton)){
            num1 = Double.parseDouble(field1.getText());
            operator = '*';
            field1.setText("");
        }else if(ae.getSource().equals(divideButton)){
            num1 = Double.parseDouble(field1.getText());
            operator = '/';
            field1.setText("");
        }else if(ae.getSource().equals(equal)){
            num2 = Double.parseDouble(field1.getText());
            if (operator=='+'){
                result = num1+num2;
            }else if (operator=='-'){
                result = num1 - num2;
            }else if (operator=='*'){
                result = num1 * num2;
            }else if (operator=='/'){
                result = num1 / num2;
            }
            field1.setText(String.valueOf(result));
        }
    }
}
