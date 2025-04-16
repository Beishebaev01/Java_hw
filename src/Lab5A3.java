import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lab5A3 {
    private JFrame frame;
    private JTextField textField;

    double firstNumber, secondNumber, result;
    String operations, answer;

    public Lab5A3() {
        initialize();
    }
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    Lab5A3 window = new Lab5A3();
                    window.frame.setVisible(true);
                    window.frame.setResizable(false);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    private void initialize() {
        frame = new JFrame();
        frame.setTitle("Калькулятор");
        frame.setBounds(540, 100, 284, 429);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        textField = new JTextField();
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        textField.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        textField.setBounds(10, 11, 248, 43);
        textField.setColumns(10);;
        frame.getContentPane().add(textField);

        JButton btnBackSpace = new JButton("C");
        btnBackSpace.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String backSpace = null;
                if(!textField.getText().isEmpty()) {
                    StringBuilder strB = new StringBuilder(textField.getText());
                    strB.deleteCharAt(textField.getText().length() - 1);
                    backSpace = strB.toString();
                    textField.setText(backSpace);
                }
            }
        });
        btnBackSpace.setFont(new Font("Times New Roman", Font.BOLD, 20));
        btnBackSpace.setBounds(10, 316, 60, 60);
        frame.getContentPane().add(btnBackSpace);

        JButton btnClear = new JButton("Clear");
        btnClear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(!textField.getText().isEmpty()) {
                    textField.setText("");
                }
            }
        });
        btnClear.setFont(new Font("Times New Roman", Font.BOLD, 20));
        btnClear.setBounds(10, 68, 123, 60);
        frame.getContentPane().add(btnClear);

        JButton btn7 = new JButton("7");
        btn7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String EnterNumber = textField.getText() + btn7.getText();
                textField.setText(EnterNumber);
            }
        });
        btn7.setFont(new Font("Times New Roman", Font.BOLD, 20));
        btn7.setBounds(10, 130, 60, 60);
        frame.getContentPane().add(btn7);

        JButton btn4 = new JButton("4");
        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String EnterNumber = textField.getText() + btn4.getText();
                textField.setText(EnterNumber);
            }
        });
        btn4.setFont(new Font("Times New Roman", Font.BOLD, 20));
        btn4.setBounds(10, 192, 60, 60);
        frame.getContentPane().add(btn4);

        JButton btn1 = new JButton("1");
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String EnterNumber = textField.getText() + btn1.getText();
                textField.setText(EnterNumber);
            }
        });
        btn1.setFont(new Font("Times New Roman", Font.BOLD, 20));
        btn1.setBounds(10, 254, 60, 60);
        frame.getContentPane().add(btn1);

        JButton btn8 = new JButton("8");
        btn8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String EnterNumber = textField.getText() + btn8.getText();
                textField.setText(EnterNumber);
            }
        });
        btn8.setFont(new Font("Times New Roman", Font.BOLD, 20));
        btn8.setBounds(73, 130, 60, 60);
        frame.getContentPane().add(btn8);

        JButton btn5 = new JButton("5");
        btn5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String EnterNumber = textField.getText() + btn5.getText();
                textField.setText(EnterNumber);
            }
        });
        btn5.setFont(new Font("Times New Roman", Font.BOLD, 20));
        btn5.setBounds(73, 192, 60, 60);
        frame.getContentPane().add(btn5);

        JButton btn2 = new JButton("2");
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String EnterNumber = textField.getText() + btn2.getText();
                textField.setText(EnterNumber);
            }
        });
        btn2.setFont(new Font("Times New Roman", Font.BOLD, 20));
        btn2.setBounds(73, 254, 60, 60);
        frame.getContentPane().add(btn2);

        JButton btn9 = new JButton("9");
        btn9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String EnterNumber = textField.getText() + btn9.getText();
                textField.setText(EnterNumber);
            }
        });
        btn9.setFont(new Font("Times New Roman", Font.BOLD, 20));
        btn9.setBounds(136, 130, 60, 60);
        frame.getContentPane().add(btn9);

        JButton btn6 = new JButton("6");
        btn6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String EnterNumber = textField.getText() + btn6.getText();
                textField.setText(EnterNumber);
            }
        });
        btn6.setFont(new Font("Times New Roman", Font.BOLD, 20));
        btn6.setBounds(136, 192, 60, 60);
        frame.getContentPane().add(btn6);

        JButton btn3 = new JButton("3");
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String EnterNumber = textField.getText() + btn3.getText();
                textField.setText(EnterNumber);
            }
        });
        btn3.setFont(new Font("Times New Roman", Font.BOLD, 20));
        btn3.setBounds(136, 254, 60, 60);
        frame.getContentPane().add(btn3);

        JButton btn0 = new JButton("0");
        btn0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String EnterNumber = textField.getText() + btn0.getText();
                textField.setText(EnterNumber);
            }
        });
        btn0.setFont(new Font("Times New Roman", Font.BOLD, 20));
        btn0.setBounds(73, 316, 60, 60);
        frame.getContentPane().add(btn0);

        JButton btnEqual = new JButton("=");
        btnEqual.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                secondNumber = Double.parseDouble(textField.getText());
                if (operations == "+") {
                    result = firstNumber + secondNumber;
                    answer = String.format("%.2f", result);
                    textField.setText(answer);
                }
                else if (operations == "-") {
                    result = firstNumber - secondNumber;
                    answer = String.format("%.2f", result);
                    textField.setText(answer);
                }
                else if (operations == "*") {
                    result = firstNumber * secondNumber;
                    answer = String.format("%.2f", result);
                    textField.setText(answer);
                }
                else if (operations == "/") {
                    result = firstNumber / secondNumber;
                    answer = String.format("%.2f", result);
                    textField.setText(answer);
                }
                else if (operations == "%") {
                    result = firstNumber % secondNumber;
                    answer = String.format("%.2f", result);
                    textField.setText(answer);
                }
            }
        });
        btnEqual.setFont(new Font("Times New Roman", Font.BOLD, 20));
        btnEqual.setBounds(136, 316, 123, 60);
        frame.getContentPane().add(btnEqual);

        JButton btnDiv = new JButton("/");
        btnDiv.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                firstNumber = Double.parseDouble(textField.getText());
                textField.setText("");
                operations = "/";
            }
        });
        btnDiv.setFont(new Font("Times New Roman", Font.BOLD, 20));
        btnDiv.setBounds(198, 254, 60, 60);
        frame.getContentPane().add(btnDiv);

        JButton btnMul = new JButton("*");
        btnMul.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                firstNumber = Double.parseDouble(textField.getText());
                textField.setText("");
                operations = "*";
            }
        });
        btnMul.setFont(new Font("Times New Roman", Font.BOLD, 20));
        btnMul.setBounds(198, 192, 60, 60);
        frame.getContentPane().add(btnMul);

        JButton btnSub = new JButton("-");
        btnSub.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                firstNumber = Double.parseDouble(textField.getText());
                textField.setText("");
                operations = "-";
            }
        });
        btnSub.setFont(new Font("Times New Roman", Font.BOLD, 20));
        btnSub.setBounds(198, 130, 60, 60);
        frame.getContentPane().add(btnSub);

        JButton btnAdd = new JButton("+");
        btnAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                firstNumber = Double.parseDouble(textField.getText());
                textField.setText("");
                operations = "+";
            }
        });
        btnAdd.setFont(new Font("Times New Roman", Font.BOLD, 20));
        btnAdd.setBounds(198, 68, 60, 60);
        frame.getContentPane().add(btnAdd);

        JButton btnPer = new JButton("%");
        btnPer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                firstNumber = Double.parseDouble(textField.getText());
                textField.setText("");
                operations = "%";
            }
        });
        btnPer.setFont(new Font("Times New Roman", Font.BOLD, 20));
        btnPer.setBounds(136, 68, 60, 60);
        frame.getContentPane().add(btnPer);
    }
}