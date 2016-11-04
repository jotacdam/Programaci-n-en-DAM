import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BailandoTexto extends JFrame {

	private JPanel contentPane;
	private JTextField CampoTextoIzquierda;
	private JTextField CampoTextoDerecha;
	private JButton buttonIzquierda;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BailandoTexto frame = new BailandoTexto();
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
	public BailandoTexto() {
		setTitle("Intercambio de texto");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// Caja para poner texto en la posición Izquierda
		CampoTextoIzquierda = new JTextField();
		CampoTextoIzquierda.setBounds(21, 120, 139, 30);
		contentPane.add(CampoTextoIzquierda);
		CampoTextoIzquierda.setColumns(10);
		
		// Caja para poner texto en la posición Derecha
		CampoTextoDerecha = new JTextField();
		CampoTextoDerecha.setBounds(274, 120, 139, 30);
		contentPane.add(CampoTextoDerecha);
		CampoTextoDerecha.setColumns(10);
		
		// Botón para pasar de la caja izquierda a la derecha
		JButton buttonDerecha = new JButton("  -->");
		buttonDerecha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// si se aprieta botón, coge el texto de la caja izquierda y lo pasa a la derecha
				CampoTextoDerecha.setText(CampoTextoIzquierda.getText());
				// deja en blanco el de la izquierda
				CampoTextoIzquierda.setText("");
			}
		});
		buttonDerecha.setBounds(168, 40, 89, 23);
		contentPane.add(buttonDerecha);
		
		// Botón para pasar de la caja derecha a la izquierda
		JButton buttonIzquierda = new JButton("<--");
		buttonIzquierda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			// si se aprieta botón, coge el texto de la caja derecha y lo pasa a la izquierda
			CampoTextoIzquierda.setText(CampoTextoDerecha.getText());
			// deja en blanco el de la derecha
			CampoTextoDerecha.setText("");
		}
	});
	    buttonIzquierda.setBounds(168, 200, 89, 23);
		contentPane.add(buttonIzquierda);
	}
}
