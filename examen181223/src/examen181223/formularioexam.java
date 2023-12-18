package examen181223;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;

public class formularioexam extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					formularioexam frame = new formularioexam();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public formularioexam() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(26, 11, 101, 27);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(90, 14, 182, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("EDES");
		lblNewLabel_1.setBounds(26, 61, 113, 27);
		contentPane.add(lblNewLabel_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("SI");
		rdbtnNewRadioButton.setBounds(100, 63, 109, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("NO");
		rdbtnNewRadioButton_1.setBounds(236, 63, 109, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JButton btnNewButton = new JButton("ENVIAR");
		btnNewButton.setBounds(38, 147, 132, 45);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("REINICIAR");
		btnNewButton_1.setBounds(230, 147, 143, 45);
		contentPane.add(btnNewButton_1);
	}
}
