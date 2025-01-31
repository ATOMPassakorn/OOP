import javax.swing.*;
import java.awt.*;
public class CalculatorOneGUI {
        public JFrame frame;
        public JPanel panel;
        public JButton plusButton;
        public JButton minusButton;
        public JButton multiplyButton;
        public JButton divideButton;
        public JTextField field1;
        public JTextField field2;
        public JTextField result;
        public CalculatorOneGUI(){
            frame = new JFrame("เครื่องคิดเลข");
            panel = new JPanel();
            plusButton = new JButton("plus");
            minusButton = new JButton("minus");
            multiplyButton = new JButton("multiply");
            divideButton = new JButton("divide");
            field1 = new JTextField();
            field2 = new JTextField();
            result = new JTextField();
            frame.setLayout(new GridLayout(4, 1));
            frame.add(field1);
            frame.add(field2);
            panel.add(plusButton);
            panel.add(minusButton);
            panel.add(multiplyButton);
            panel.add(divideButton);
            frame.add(panel);
            frame.add(result);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(420, 200);
            frame.setVisible(true);
        }
}