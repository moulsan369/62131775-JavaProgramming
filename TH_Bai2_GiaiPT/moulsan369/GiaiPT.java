package moulsan369;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GiaiPT extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField txtA;
    private JTextField txtB;
    private JTextField txtC;
    private JTextField txtKq;

    public GiaiPT() {
        setTitle("GIẢI PHƯƠNG TRÌNH BẬC 2");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lbA = new JLabel("Nhập a");
        lbA.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        lbA.setBounds(55, 23, 60, 26);
        contentPane.add(lbA);

        JLabel lbB = new JLabel("Nhập b");
        lbB.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        lbB.setBounds(55, 60, 60, 26);
        contentPane.add(lbB);

        JLabel lbC = new JLabel("Nhập c");
        lbC.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        lbC.setBounds(55, 97, 60, 26);
        contentPane.add(lbC);

        txtA = new JTextField();
        txtA.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        txtA.setBounds(125, 27, 86, 20);
        contentPane.add(txtA);
        txtA.setColumns(10);

        txtB = new JTextField();
        txtB.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        txtB.setColumns(10);
        txtB.setBounds(125, 64, 86, 20);
        contentPane.add(txtB);

        txtC = new JTextField();
        txtC.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        txtC.setColumns(10);
        txtC.setBounds(125, 101, 86, 20);
        contentPane.add(txtC);

        JButton btnGiai = new JButton("Giải Phương Trình");
        btnGiai.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        btnGiai.setBounds(246, 46, 156, 56);
        contentPane.add(btnGiai);

        txtKq = new JTextField();
        txtKq.setEditable(false);
        txtKq.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        txtKq.setColumns(10);
        txtKq.setBounds(108, 191, 241, 32);
        contentPane.add(txtKq);

        JLabel lbKq = new JLabel("Kết Quả");
        lbKq.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        lbKq.setBounds(207, 165, 60, 26);
        contentPane.add(lbKq);

        
        btnGiai.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              
                double a = Double.parseDouble(txtA.getText());
                double b = Double.parseDouble(txtB.getText());
                double c = Double.parseDouble(txtC.getText());

                
                double delta = b * b - 4 * a * c;

                if (delta > 0) {
                    double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                    double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                    txtKq.setText("x1 = " + x1 + ", x2 = " + x2);
                } else if (delta == 0) {
                    double x = -b / (2 * a);
                    txtKq.setText("x = " + x);
                } else {
                    txtKq.setText("Phương trình vô nghiệm");
                }
            }
        });
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    GiaiPT frame = new GiaiPT();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
