package interfaz;

import calculadora1.Calculadora1;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * La clase Register proporciona una interfaz gráfica para que los usuarios puedan registrarse.
 * Se asegura de que las contraseñas coincidan antes de guardar los detalles del usuario en un archivo.
 */
public class Register implements ActionListener {
    private JTextField usuarioField;
    private JPasswordField passwordField;
    private JPasswordField confirmPasswordField;
    private JFrame frame;

    /**
     * Constructor que inicializa la interfaz de registro y configura los componentes.
     */
    public Register() {
        frame = new JFrame("Registrar Usuario");
        usuarioField = new JTextField();
        passwordField = new JPasswordField();
        confirmPasswordField = new JPasswordField();
        JButton registerButton = new JButton("Guardar");
        JButton cancelButton = new JButton("Cancelar");

        // Configurar la interfaz de usuario
        frame.setSize(300, 250);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null); // Centrar la ventana

        // Etiquetas
        JLabel usuarioLabel = new JLabel("Usuario:");
        JLabel passwordLabel = new JLabel("Contraseña:");
        JLabel confirmPasswordLabel = new JLabel("Confirme Contraseña:");

        // Establecer límites para los componentes
        usuarioLabel.setBounds(30, 20, 100, 30);
        usuarioField.setBounds(150, 20, 120, 30);
        passwordLabel.setBounds(30, 60, 100, 30);
        passwordField.setBounds(150, 60, 120, 30);
        confirmPasswordLabel.setBounds(30, 100, 150, 30);
        confirmPasswordField.setBounds(150, 100, 120, 30);
        registerButton.setBounds(30, 150, 120, 30);
        cancelButton.setBounds(160, 150, 120, 30);

        // Agregar componentes al marco
        frame.add(usuarioLabel);
        frame.add(usuarioField);
        frame.add(passwordLabel);
        frame.add(passwordField);
        frame.add(confirmPasswordLabel);
        frame.add(confirmPasswordField);
        frame.add(registerButton);
        frame.add(cancelButton);

        registerButton.addActionListener(this);
        cancelButton.addActionListener(e -> frame.dispose()); // Acción para el botón de cancelar

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * Método que maneja las acciones de los botones de la interfaz.
     * Se asegura de que las contraseñas coincidan y guarda el usuario registrado en un archivo.
     * 
     * @param e El evento que se genera cuando se hace clic en un botón.
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        String usuario = usuarioField.getText().trim();
        String contraseña = new String(passwordField.getPassword()).trim();
        String confirmPassword = new String(confirmPasswordField.getPassword()).trim();

        // Validar que las contraseñas coincidan
        if (!contraseña.equals(confirmPassword)) {
            JOptionPane.showMessageDialog(frame, "Las contraseñas no coinciden. Inténtalo de nuevo.");
            return;
        }

        // Guardar el nuevo usuario
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter("C:\\Users\\Lenovo\\Downloads\\Calculadora1.6\\Calculadora1\\src\\data\\users.txt", true))) {
            escritor.write(usuario + "," + contraseña);
            escritor.newLine();
            escritor.flush();
            JOptionPane.showMessageDialog(frame, "Usuario registrado exitosamente.");
            frame.dispose(); // Cerrar el marco de registro
            Calculadora1.launchApp(); // Reiniciar la aplicación
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(frame, "Error al registrar el usuario.");
            ex.printStackTrace();
        }
    }
}
