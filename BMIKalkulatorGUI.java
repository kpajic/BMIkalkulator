import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class BMIKalkulatorGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldVisina;
	private JTextField textFieldTezina;
	private JTextField textFieldBMI;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BMIKalkulatorGUI frame = new BMIKalkulatorGUI();
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
	public BMIKalkulatorGUI() {
		setResizable(false);
		setTitle("BMICalculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblVisina = new JLabel("Visina:");
		lblVisina.setBounds(48, 34, 46, 14);
		contentPane.add(lblVisina);
		
		JLabel lblTezina = new JLabel("Tezina:");
		lblTezina.setBounds(48, 70, 46, 14);
		contentPane.add(lblTezina);
		
		JLabel lblBmi = new JLabel("BMI:");
		lblBmi.setBounds(48, 187, 46, 14);
		contentPane.add(lblBmi);
		
		textFieldVisina = new JTextField();
		textFieldVisina.setBounds(219, 31, 86, 20);
		contentPane.add(textFieldVisina);
		textFieldVisina.setColumns(10);
		
		textFieldTezina = new JTextField();
		textFieldTezina.setBounds(219, 67, 86, 20);
		contentPane.add(textFieldTezina);
		textFieldTezina.setColumns(10);
		
		textFieldBMI = new JTextField();
		textFieldBMI.setBounds(219, 184, 162, 20);
		contentPane.add(textFieldBMI);
		textFieldBMI.setColumns(10);
		
		JButton btnIzracunajBMI = new JButton("IzracunajBMI");
		btnIzracunajBMI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				BMIKalkulator b = new BMIKalkulator();
				
				double visina = Double.parseDouble(textFieldVisina.getText());
				double tezina = Double.parseDouble(textFieldTezina.getText());
				double bmi = b.izracunajBMI(visina, tezina);
				textFieldBMI.setText(""+bmi);

				
			}
		});
		btnIzracunajBMI.setBounds(135, 118, 115, 41);
		contentPane.add(btnIzracunajBMI);
	}

}
