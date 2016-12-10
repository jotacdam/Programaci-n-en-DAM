import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

// Los hemos incorporado para que funcione porque daba errores de compilación
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import Juego.Jugador;
import java.awt.Color;

public class Principal extends JFrame {

	
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_3;

	
	//  Generamos el siguiente jugador
	Jugador player1 = new Jugador();
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	
	public Principal() {
		
		// Para rellenar los datos del jugador
        player1.setNombre("");
	    player1.setApellido1("");
	    player1.setApellido2("");
	    player1.setEdad(0);
	    player1.setId(0);
		
		// Propiedades de la ventana principal		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 481, 367);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//  Etiquetamos lo datos del jugador
		JLabel lblNewLabel = new JLabel("DATOS  del  JUGADOR");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(141, 24, 176, 22);
		contentPane.add(lblNewLabel);
		
		//  Etiquetamos el Nombre
		JLabel lblNewLabel_1 = new JLabel("NOMBRE");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(25, 61, 81, 14);
		contentPane.add(lblNewLabel_1);
		
		//  Etiquetamos el Primer Apellido
		JLabel lblNewLabel_2 = new JLabel("APELLIDO 1");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(25, 101, 94, 14);
		contentPane.add(lblNewLabel_2);
		
	    //  Etiquetamos el Segundo Apellido
		JLabel lblNewLabel_3 = new JLabel("APELLIDO 2");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(25, 140, 94, 14);
		contentPane.add(lblNewLabel_3);
		
		//  Etiquetamos la Edad
		JLabel lblNewLabel_4 = new JLabel("EDAD");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setBounds(25, 184, 94, 14);
		contentPane.add(lblNewLabel_4);
		
		//  Creamos el campo para ubicar el Nombre
		textField = new JTextField();
		textField.setBounds(125, 57, 307, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		// Listener sobre textfield y espera hasta que pulsemos la tecla intro
        textField.addActionListener(new ActionListener()  {
           public void actionPerformed(ActionEvent arg0)     {
               // Al hacer intro se rellena el Nombre del jugador
               player1.setNombre(textField.getText());
                                                             }
                                                          });

		
	    //  Creamos el campo para ubicar el Primer Apellido
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(125, 100, 307, 20);
		contentPane.add(textField_1);
		// Listener sobre textfield_1 y espera hasta que pulsemos la tecla intro
        textField_1.addActionListener(new ActionListener()  {
           public void actionPerformed(ActionEvent arg0)     {
               // Al hacer intro se rellena el Primer Apellido del jugador
               player1.setApellido1(textField_1.getText());
                                                             }
                                                          });
		
		
	    //  Creamos el campo para ubicar el Segundo Apellido
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(125, 139, 307, 20);
		contentPane.add(textField_2);
		// Listener sobre textfield_2 y espera hasta que pulsemos la tecla intro
        textField_2.addActionListener(new ActionListener()  {
           public void actionPerformed(ActionEvent arg0)     {
               // Al hacer intro se rellena el Segundo Apellido del jugador
               player1.setApellido2(textField_2.getText());
                                                             }
                                                          });
		
	    //  Creamos el campo para ubicar la Edad
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(125, 183, 307, 20);
		contentPane.add(textField_4);
		// Listener sobre textfield_4 y espera hasta que pulsemos la tecla intro
        textField_4.addActionListener(new ActionListener()  {
           public void actionPerformed(ActionEvent arg0)            {
               // Al hacer intro se rellena la Edad del jugador
               //Comprobaremos si la Edad dada es numérico
               if(player1.isNumeric(textField_4.getText())==true)
                  player1.setEdad(Integer.parseInt(textField_4.getText()));
               else
                   player1.setEdad(0);    
                                                                 }
                                                              });
        
	    //  Creamos el campo para ubicar comentarios erroneos
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(25, 256, 407, 45);
		contentPane.add(textField_3);
		
		// Ahora reagruparemos todos los datos y los asignaremos al Jugador
        player1.setNombre(textField.getText());
        player1.setApellido1(textField_1.getText());
		
		//  Añadimos el botón  " A  JUGAR "
		JButton btnNewButton = new JButton(" A  JUGAR");
		btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                  // Al pulsa el botón escribiremos el mensaje que se ubicará en textfield_3
                  if (player1.getEdad()==0)
                     textField_3.setText("La EDAD no es correcta o te falta. Pulse la tecla intro.");
                  else if (player1.sonEspacios(player1.getNombre()))
                     textField_3.setText("Falta el NOMBRE o no ha pulsado la tecla intro.");
                  else if (player1.sonEspacios(player1.getApellido1()))
                     textField_3.setText("Falta el APELLIDO1 o no ha pulsado la tecla intro.");
                  else if (player1.sonEspacios(player1.getApellido2()))
                     textField_3.setText("Falta el APELLIDO2 o no ha pulsado la tecla intro.");
                  else
                     textField_3.setText("El nuevo jugador es: "+player1.getNombre()+" "+player1.getApellido1()+" "+player1.getApellido2()+" "+player1.getEdad()+" años");
                                                          }
                                                             });
     	
		
		
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(25, 222, 407, 23);
		contentPane.add(btnNewButton);
	}
}
