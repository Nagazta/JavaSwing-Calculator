import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class Main {
    public static String op;
    public static double result = 0;
    public static boolean display = true;
    public static boolean reset = false;

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.###");
        JFrame frame = new JFrame("NUMPAD CALCULATOR");
        frame.setSize(420, 550);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.LIGHT_GRAY);

        JTextField tfDisplay = new JTextField("0", 25);
        tfDisplay.setEditable(false);
        tfDisplay.setHorizontalAlignment(JTextField.RIGHT);
        tfDisplay.setBounds(40, 20, 300, 50);

        JButton bClr, bDivide, bMulti, bMinus, bPlus, bEnter, b7, b8, b9, b4, b5, b6, b1, b2, b3, b0, bDot;

        bClr = new JButton("CLR");
        bClr.setBounds(50, 90, 65, 50);
        bClr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfDisplay.setText("0");
                result = 0;
                op = "";
                display = true;
                reset = false;
            }
        });

        bDivide = new JButton("/");
        bDivide.setBounds(120, 90, 65, 50);
        bDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                result = Double.parseDouble(tfDisplay.getText());
                op = "/";
                display = true;
                reset = false;
            }
        });

        bMulti = new JButton("*");
        bMulti.setBounds(190, 90, 65, 50);
        bMulti.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                result = Double.parseDouble(tfDisplay.getText());
                op = "*";
                display = true;
                reset = false;
            }
        });

        bMinus = new JButton("-");
        bMinus.setBounds(260, 90, 65, 50);
        bMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                result = Double.parseDouble(tfDisplay.getText());
                op = "-";
                display = true;
                reset = false;
            }
        });

        bPlus = new JButton("+");
        bPlus.setBounds(260, 160, 65, 110);
        bPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                result = Double.parseDouble(tfDisplay.getText());
                op = "+";
                display = true;
                reset = false;
            }
        });

        b7 = new JButton("7");
        b7.setBounds(50, 160, 65, 50);
        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (display || tfDisplay.getText().equals("0") || reset) {
                    tfDisplay.setText("7");
                    display = false;
                    reset = false;
                } else {
                    tfDisplay.setText(tfDisplay.getText() + "7");
                }
            }
        });

        b8 = new JButton("8");
        b8.setBounds(120, 160, 65, 50);
        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (display || tfDisplay.getText().equals("0") || reset) {
                    tfDisplay.setText("8");
                    display = false;
                    reset = false;
                } else {
                    tfDisplay.setText(tfDisplay.getText() + "8");
                }
            }
        });

        b9 = new JButton("9");
        b9.setBounds(190, 160, 65, 50);
        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (display || tfDisplay.getText().equals("0") || reset) {
                    tfDisplay.setText("9");
                    display = false;
                    reset = false;
                } else {
                    tfDisplay.setText(tfDisplay.getText() + "9");
                }
            }
        });

        b4 = new JButton("4");
        b4.setBounds(50, 220, 65, 50);
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (display || tfDisplay.getText().equals("0") || reset) {
                    tfDisplay.setText("4");
                    display = false;
                    reset = false;
                } else {
                    tfDisplay.setText(tfDisplay.getText() + "4");
                }
            }
        });

        b5 = new JButton("5");
        b5.setBounds(120, 220, 65, 50);
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (display || tfDisplay.getText().equals("0") || reset) {
                    tfDisplay.setText("5");
                    display = false;
                    reset = false;
                } else {
                    tfDisplay.setText(tfDisplay.getText() + "5");
                }
            }
        });

        b6 = new JButton("6");
        b6.setBounds(190, 220, 65, 50);
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (display || tfDisplay.getText().equals("0") || reset) {
                    tfDisplay.setText("6");
                    display = false;
                    reset = false;
                } else {
                    tfDisplay.setText(tfDisplay.getText() + "6");
                }
            }
        });

        b1 = new JButton("1");
        b1.setBounds(50, 280, 65, 50);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (display || tfDisplay.getText().equals("0") || reset) {
                    tfDisplay.setText("1");
                    display = false;
                    reset = false;
                } else {
                    tfDisplay.setText(tfDisplay.getText() + "1");
                }
            }
        });

        b2 = new JButton("2");
        b2.setBounds(120, 280, 65, 50);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (display || tfDisplay.getText().equals("0") || reset) {
                    tfDisplay.setText("2");
                    display = false;
                    reset = false;
                } else {
                    tfDisplay.setText(tfDisplay.getText() + "2");
                }
            }
        });

        b3 = new JButton("3");
        b3.setBounds(190, 280, 65, 50);
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (display || tfDisplay.getText().equals("0") || reset) {
                    tfDisplay.setText("3");
                    display = false;
                    reset = false;
                } else {
                    tfDisplay.setText(tfDisplay.getText() + "3");
                }
            }
        });

        b0 = new JButton("0");
        b0.setBounds(50, 340, 130, 50);
        b0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (display || tfDisplay.getText().equals("0") || reset) {
                    tfDisplay.setText("0");
                    display = false;
                    reset = false;
                } else {
                    tfDisplay.setText(tfDisplay.getText() + "0");
                }
            }
        });

        bDot = new JButton(".");
        bDot.setBounds(190, 340, 65, 50);
        bDot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (display || tfDisplay.getText().equals("0") || reset) {
                    tfDisplay.setText("0.");
                    display = false;
                    reset = false;
                } else {
                    tfDisplay.setText(tfDisplay.getText() + ".");
                }
            }
        });

        bEnter = new JButton("=");
        bEnter.setBounds(260, 280, 65, 110);
        bEnter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num = Double.parseDouble(tfDisplay.getText());

                switch (op) {
                    case "+":
                        result += num;
                        tfDisplay.setText(df.format(result));
                        break;
                    case "-":
                        result -= num;
                        tfDisplay.setText(df.format(result));
                        break;
                    case "*":
                        result *= num;
                        tfDisplay.setText(df.format(result));
                        break;
                    case "/":
                        result /= num;
                        tfDisplay.setText(df.format(result));
                        break;
                }
                reset = true;
            }
        });

        panel.add(tfDisplay);
        panel.add(bClr);
        panel.add(bDivide);
        panel.add(bMulti);
        panel.add(bMinus);
        panel.add(bPlus);
        panel.add(b7);
        panel.add(b8);
        panel.add(b9);
        panel.add(b4);
        panel.add(b5);
        panel.add(b6);
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(b0);
        panel.add(bDot);
        panel.add(bEnter);
        
        frame.add(panel);
        frame.setVisible(true);
    }
}
