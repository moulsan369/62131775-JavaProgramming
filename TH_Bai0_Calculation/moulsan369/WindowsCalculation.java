package moulsan369;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WindowsCalculation extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtKq;


    public WindowsCalculation() {
        setTitle("Calculation");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 679, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("Write Number one(a)");
        lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        lblNewLabel.setBounds(127, 46, 126, 41);
        contentPane.add(lblNewLabel);

        JLabel lblWriteNumberTwob = new JLabel("Write Number two(b)");
        lblWriteNumberTwob.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        lblWriteNumberTwob.setBounds(129, 109, 126, 41);
        contentPane.add(lblWriteNumberTwob);

        txtA = new JTextField();
        txtA.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        txtA.setBounds(281, 54, 98, 30);
        contentPane.add(txtA);
        txtA.setColumns(10);

        txtB = new JTextField();
        txtB.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        txtB.setColumns(10);
        txtB.setBounds(281, 109, 98, 30);
        contentPane.add(txtB);

        JButton btnCong = new JButton("Cộng");
        btnCong.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        btnCong.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
             
                hamCong();
            }
        });
        btnCong.setBounds(64, 192, 98, 41);
        contentPane.add(btnCong);

        JButton btnTru = new JButton("Trừ");
        btnTru.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        btnTru.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
             
                hamTru();
            }
        });
        btnTru.setBounds(193, 192, 98, 41);
        contentPane.add(btnTru);

        JButton btnNhan = new JButton("Nhân");
        btnNhan.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        btnNhan.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              
                hamNhan();
            }
        });
        btnNhan.setBounds(328, 192, 98, 41);
        contentPane.add(btnNhan);

        JButton btnChia = new JButton("Chia");
        btnChia.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        btnChia.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               
                hamChia();
            }
        });
        btnChia.setBounds(462, 192, 98, 41);
        contentPane.add(btnChia);

        JLabel lblKtQu = new JLabel("Kết quả");
        lblKtQu.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        lblKtQu.setBounds(446, 72, 51, 41);
        contentPane.add(lblKtQu);

        txtKq = new JTextField();
        txtKq.setEditable(false);
        txtKq.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        txtKq.setColumns(10);
        txtKq.setBounds(502, 72, 98, 30);
        contentPane.add(txtKq);
    }

 
    void hamCong() {
    
        double a = Double.parseDouble(txtA.getText());
        double b = Double.parseDouble(txtB.getText());
       
        double ketQua = a + b;
       
        txtKq.setText(String.valueOf(ketQua));
    }

   
    void hamTru() {
        double a = Double.parseDouble(txtA.getText());
        double b = Double.parseDouble(txtB.getText());
        double ketQua = a - b;
        txtKq.setText(String.valueOf(ketQua));
    }

    
    void hamNhan() {
        double a = Double.parseDouble(txtA.getText());
        double b = Double.parseDouble(txtB.getText());
        double ketQua = a * b;
        txtKq.setText(String.valueOf(ketQua));
    }

    
    void hamChia() {
        double a = Double.parseDouble(txtA.getText());
        double b = Double.parseDouble(txtB.getText());
        
        if (b != 0) {
            double ketQua = a / b;
            txtKq.setText(String.valueOf(ketQua));
        } else {
            txtKq.setText("Không thể chia cho 0");
        }
    }
	
}
