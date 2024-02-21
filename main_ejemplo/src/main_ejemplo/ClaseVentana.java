package main_ejemplo;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ClaseVentana extends JFrame {

	private static final long serialVersionUID = 1L;
	
	public ClaseVentana() {
		setTitle("Jpanel");

		setLocationRelativeTo(null);

		this.setSize(1000,1000);

		this.setVisible(true);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.setLocation(200,100);

		this.setResizable(true);

		this.setTitle("Mi ventana");

		this.setMinimumSize(new Dimension(250,250));

		this.setMaximumSize(new Dimension(1000,1000));

		this.setLocationRelativeTo(null);

		IniciarComponentes();


		setDefaultCloseOperation(EXIT_ON_CLOSE);

		this.setLayout(null);

	}
	
	private void IniciarComponentes() {
		JPanel panel = new JPanel();
		login(panel);
		register(panel);
		
		
		this.repaint();
		this.revalidate();
		//Login


		/*Register
		JPanel register = new JPanel();
		login.setSize(this.getWidth()/2,this.getHeight());
		register.setLocation(500,0);
		register.setBackground(Color.RED);
		register.setLayout(null);
		
		*/

		
		//this.add(register);
	}
	
	private void register(JPanel panel) {
		JPanel register = new JPanel();
		register.setSize(500,1000);
		register.setLocation(500,0);
		register.setBackground(Color.BLUE);
		register.setLayout(null);
		
		JLabel login_tittle = new JLabel("REGISTRO",0); //El 0 es para centrar el texto dentro del JLabel.
		login_tittle.setSize(330,40);
		login_tittle.setFont(new Font("ARIAL", Font.BOLD, 40));
		login_tittle.setForeground(Color.BLACK);
		login_tittle.setLocation(590,30); //SetBounds es una alternativa.
		login_tittle.setOpaque(true);
		login_tittle.setBackground(Color.RED);
		register.add(login_tittle);
		
		JLabel user_tittle = new JLabel("Nombre de usuario:",0);
		user_tittle.setBounds(500,80,500,30);
		user_tittle.setFont(new Font("ARIAL", Font.BOLD, 25));
		user_tittle.setForeground(Color.black);
		user_tittle.setLayout(null);
		register.add(user_tittle);
		
		JTextField user = new JTextField(0);
		user.setSize(345,40);
		user.setLocation(570,120);
		register.add(user);
		
		JLabel bioLabel = new JLabel("Bio",0);
		bioLabel.setBounds(500,80,500,200);
		bioLabel.setFont(new Font("ARIAL", Font.BOLD, 25));
		bioLabel.setForeground(Color.black);
		bioLabel.setLayout(null);
		register.add(bioLabel);
		
		JTextArea biotext = new JTextArea();
		biotext.setBounds(570,200,345,100);
		biotext.setBackground(Color.WHITE);
		register.add(biotext);
		
		JLabel preference = new JLabel("Preferencias",0);
		preference.setBounds(500,310,500,20);
		preference.setFont(new Font("ARIAL", Font.BOLD, 25));
		preference.setForeground(Color.black);
		preference.setLayout(null);
		register.add(preference);
		
		JCheckBox dulces = new JCheckBox("Dulces");
		dulces.setBounds(550,350,80,20);
		dulces.setFont(new Font("ARIAL", Font.BOLD, 15));
		register.add(dulces);	
		
		JCheckBox cafe = new JCheckBox("Cafe");
		cafe.setBounds(650,350,80,20);
		cafe.setFont(new Font("ARIAL", Font.BOLD, 15));
		register.add(cafe);
		
		JCheckBox salado = new JCheckBox("Comida salada");
		salado.setBounds(750,350,130,20);
		salado.setFont(new Font("ARIAL", Font.BOLD, 15));
		register.add(salado);
		//Agregar un borde para un checkbox:
		
		salado.setBorderPainted(true);
		salado.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
		
		/////////////////////////////////////
		
		JLabel termstag = new JLabel("Terminos",0);
		termstag.setBounds(500,380,500,20);
		termstag.setFont(new Font("ARIAL", Font.BOLD, 25));
		termstag.setForeground(Color.black);
		termstag.setLayout(null);
		register.add(termstag);
		
		JRadioButton rdbtn1 = new JRadioButton("Aceptar terminos");
		rdbtn1.setBounds(600,410,130,20);
		register.add(rdbtn1);
		
		JRadioButton rdbtn2 = new JRadioButton("Rechazar terminos");
		rdbtn2.setBounds(775,410,140,20);
		register.add(rdbtn2);
		
		ButtonGroup grupo = new ButtonGroup();
		grupo.add(rdbtn1);
		grupo.add(rdbtn2);
		
		String colonias[] = {"Centro","Camino Real","Santa Fe","Concha", "Villas del encanto"};
		JComboBox location = new JComboBox(colonias);
		location.setFont(new Font("ARIAL", Font.BOLD, 18));
		location.setBounds(600,450,320,25);
		register.add(location);
		
		JButton register_button = new JButton("Registro");
		register_button.setBounds(660,500,200,50);
		register_button.setFont(new Font("ARIAL", Font.BOLD, 25));
		register.add(register_button);
		
		
		
		
		this.add(register);
		
	}
	
	private void login(JPanel panel) {
		JPanel login = new JPanel();
		login.setSize(500,960);
		login.setBackground(Color.GRAY);
		login.setLayout(null);

		JLabel login_tittle = new JLabel("ACCEDER",0); //El 0 es para centrar el texto dentro del JLabel.
		login_tittle.setSize(330,40);
		login_tittle.setFont(new Font("ARIAL", Font.BOLD, 40));
		login_tittle.setForeground(Color.BLACK);
		login_tittle.setLocation(90,30); //SetBounds es una alternativa.
		login_tittle.setOpaque(true);
		login_tittle.setBackground(Color.RED);
		login.add(login_tittle);

		JLabel user_tittle = new JLabel("Nombre de usuario:");
		user_tittle.setBounds(20,80,500,30);
		user_tittle.setFont(new Font("ARIAL", Font.BOLD, 25));
		user_tittle.setForeground(Color.black);
		user_tittle.setLayout(null);
		login.add(user_tittle);


		JTextField user = new JTextField();
		user.setSize(300,40);
		user.setLocation(20,120);
		login.add(user);	

		JLabel password_tittle = new JLabel("Contraseña:");
		password_tittle.setBounds(20,170,500,30);
		password_tittle.setFont(new Font("ARIAL", Font.BOLD, 25));
		password_tittle.setForeground(Color.black);
		password_tittle.setLayout(null);
		login.add(password_tittle);

		this.getContentPane().add(panel);
		JPasswordField password = new JPasswordField();
		password.setSize(300,40);
		password.setLocation(20,210);
		login.add(password);

		JCheckBox recordarme = new JCheckBox();
		recordarme.setSize(120,15);
		recordarme.setText("Recordarme");
		recordarme.setFont(new Font("ARIAL",Font.BOLD,14));
		recordarme.setForeground(Color.black);
		recordarme.setBackground(Color.GRAY);
		recordarme.setLocation(20,260);
		login.add(recordarme);		

		JLabel olvidaste = new JLabel("¿Olvidó su contraseña?");
		olvidaste.setBounds(150,260,500,15);
		olvidaste.setFont(new Font("ARIAL", Font.BOLD, 14));
		olvidaste.setForeground(Color.black);
		olvidaste.setLayout(null);
		login.add(olvidaste);

		JButton acceder = new JButton();
		acceder.setBounds(60,300, 200, 50);
		acceder.setText("Acceder");
		acceder.setFont(new Font("ARIAL",Font.BOLD,25));
		login.add(acceder);
		
		this.add(login);
	}
}
