package ventana;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class ventanac extends JFrame {

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
					ventanac frame = new ventanac();
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
	public ventanac() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("nombre y ape");
		lblNewLabel.setBounds(27, 21, 104, 22);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(109, 22, 174, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("mujer");
		rdbtnNewRadioButton.setBounds(27, 60, 109, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("examne");
		chckbxNewCheckBox.setBounds(257, 60, 97, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"hj", "jn", "lm"}));
		comboBox.setBounds(45, 110, 144, 29);
		contentPane.add(comboBox);
	}
}
