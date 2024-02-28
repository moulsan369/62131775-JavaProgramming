package moulsan369;


import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.*;

public class formLogin extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField txtDn;
    private JTextField textPass;

    public formLogin() {
        setTitle("ĐĂNG NHẬP HỆ THÔNG ");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JLabel txtA = new JLabel("Tên Đăng Nhập");
        txtA.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        txtA.setBounds(47, 35, 92, 34);
        contentPane.add(txtA);
        
        JLabel txtB = new JLabel("Mật Khẩu");
        txtB.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        txtB.setBounds(47, 91, 92, 34);
        contentPane.add(txtB);
        
        txtDn = new JTextField();
        txtDn.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        txtDn.setBounds(197, 43, 119, 26);
        contentPane.add(txtDn);
        txtDn.setColumns(10);
        
        textPass = new JTextField();
        textPass.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        textPass.setColumns(10);
        textPass.setBounds(197, 96, 119, 26);
        contentPane.add(textPass);
        
        JButton btnDn = new JButton("Đăng Nhập");
        btnDn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
           
                String username = txtDn.getText();
                String password = textPass.getText();
                
              
                if (username.equals("63CNTT") && password.equals("123")) {
                   
                    JOptionPane.showMessageDialog(contentPane, "Đăng nhập thành công!");
                  
                    HomeLogin homeLogin = new HomeLogin();
                    homeLogin.setVisible(true);
                    dispose();
                } else {
                    
                    JOptionPane.showMessageDialog(contentPane, "Đăng nhập không thành công. Vui lòng kiểm tra lại tên đăng nhập và mật khẩu!");
                }
            }
        });
        btnDn.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        btnDn.setBounds(146, 168, 139, 34);
        contentPane.add(btnDn);
    }


    
}
