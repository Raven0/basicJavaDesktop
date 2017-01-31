package hello;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPanel;

public class java_window {

	private JFrame frame;
	private JTextField textField;
	private JLabel lblNilai;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					java_window window = new java_window();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public java_window() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblMasukkanNama = new JLabel("Masukkan Nama :");
		lblMasukkanNama.setBounds(56, 50, 175, 14);
		frame.getContentPane().add(lblMasukkanNama);
		
		textField = new JTextField();
		textField.setBounds(56, 75, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String nama = textField.getText();
				String nilai = textField_1.getText();
				Double Score =  Double.parseDouble(nilai);
				String P="Default";
				String lulus = "Default";
				if(Score >= 90 ){
					P="A";
					lulus="lulus";
				}else if(Score >= 80 ){
					P="B";
					lulus="lulus";
				}else if(Score >= 70 ){
					P="C";
					lulus="lulus";
				}else if(Score >= 60 ){
					P="D";
					lulus="Gagal";
				}else{
					P="E";
					lulus="Gagal";
				}
				JOptionPane.showMessageDialog(frame, "BALIK " + nama + "  nilai  " + P +"  kelulusan  "+lulus);
			}
		});
		btnOk.setBounds(53, 197, 89, 23);
		frame.getContentPane().add(btnOk);
		
		lblNilai = new JLabel("Nilai");
		lblNilai.setBounds(76, 106, 46, 14);
		frame.getContentPane().add(lblNilai);
		
		textField_1 = new JTextField();
		textField_1.setBounds(56, 128, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
	}
}
