import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MiPerfil extends JFrame 
{
    /*Definimos el contenedor y las cuatro siguientes etiquetas */
	
	private JPanel contentPane;
	private JTextField etiquetaNombre;
	private JTextField etiquetaApellidos;
	private JTextField etiquetaEdad;
	private JTextField etiquetaEmail;

	/**
	 * Lanzaremos la aplicacion principal
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MiPerfil frame = new MiPerfil();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Creamos la Ventana.
	 */
	public MiPerfil() {
		setTitle("MiPerfil");         // La Ventana aparecerá con título MiPerfil
		// Configuramos la Ventana
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		// Configuramos el Contenedor
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// Etiquetaremos el Nombre
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(10, 11, 49, 14);
		contentPane.add(lblNombre);
		
		//Caja donde pondremos el Nombre
		etiquetaNombre = new JTextField();
		etiquetaNombre.setEditable(false);      // No se puede editar en la ventana
		etiquetaNombre.setText("Juan Carlos");
		etiquetaNombre.setBounds(10, 36, 184, 20);
		contentPane.add(etiquetaNombre);
		etiquetaNombre.setColumns(10);
		
		// Etiquetaremos los Apellidos
		JLabel lblApellidos = new JLabel("Apellidos");
		lblApellidos.setBounds(10, 67, 77, 14);
		contentPane.add(lblApellidos);
		
		//Caja donde pondremos los Apellidos
		etiquetaApellidos = new JTextField();
		etiquetaApellidos.setEditable(false);    // No se puede editar en la ventana
		etiquetaApellidos.setText("Hueso M.");
		etiquetaApellidos.setColumns(10);
		etiquetaApellidos.setBounds(10, 92, 184, 20);
		contentPane.add(etiquetaApellidos);
		
		// Etiquetaremos la Edad
		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setBounds(10, 131, 46, 14);
		contentPane.add(lblEdad);
		
		//Caja donde pondremos la Edad
		etiquetaEdad = new JTextField();
		etiquetaEdad.setEditable(false);        // No se puede editar en la ventana
		etiquetaEdad.setText("43");
		etiquetaEdad.setColumns(10);
		etiquetaEdad.setBounds(10, 156, 40, 20);
		contentPane.add(etiquetaEdad);
		
		// Etiquetaremos el Email
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setBounds(10, 195, 80, 14);
		contentPane.add(lblEmail);
		
		//Caja donde pondremos el Email
		etiquetaEmail = new JTextField();
		etiquetaEmail.setEditable(false);                // No se puede editar en la ventana
		etiquetaEmail.setText("nolase@florida-uni.es");
		etiquetaEmail.setColumns(10);
		etiquetaEmail.setBounds(10, 220, 184, 20);
		contentPane.add(etiquetaEmail);
	}

}
