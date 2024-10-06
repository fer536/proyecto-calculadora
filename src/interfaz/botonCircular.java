package interfaz;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

/**
 * La clase botonCircular extiende {@link JButton} para crear un botón con forma circular.
 * Este botón personalizado se dibuja como un círculo y responde visualmente a las acciones
 * del usuario como un botón estándar.
 */
public class botonCircular extends JButton {

    /**
     * Constructor que crea un botón circular con el texto especificado.
     *
     * @param texto El texto que se mostrará en el botón.
     */
    public botonCircular(String texto) {
        super(texto);
        setContentAreaFilled(false); // No llenar el área de contenido por defecto
        setFocusPainted(false); // No pintar el foco en el botón
    }

    /**
     * Sobrescribe el método {@link JButton#paintComponent(Graphics)} para personalizar la apariencia del botón.
     * Dibuja un óvalo que simula un botón circular.
     *
     * @param g El objeto {@link Graphics} usado para dibujar el botón.
     */
    @Override
    protected void paintComponent(Graphics g) {
        if (getModel().isArmed()) { // Cambiar color cuando el botón está presionado
            g.setColor(Color.LIGHT_GRAY);
        } else {
            g.setColor(getBackground());
        }
        g.fillOval(0, 0, getWidth() - 1, getHeight() - 1); // Dibujar el círculo
        super.paintComponent(g); // Llamar al comportamiento por defecto de JButton
    }

    /**
     * Sobrescribe el método {@link JButton#paintBorder(Graphics)} para dibujar un borde circular.
     *
     * @param g El objeto {@link Graphics} usado para dibujar el borde del botón.
     */
    @Override
    protected void paintBorder(Graphics g) {
        g.setColor(getForeground()); // Usar el color del texto del botón para el borde
        g.drawOval(0, 0, getWidth() - 1, getHeight() - 1); // Dibujar el borde circular
    }

    /**
     * Sobrescribe el método {@link JButton#getPreferredSize()} para asegurar que el botón
     * sea cuadrado con el diámetro basado en el mayor de los dos (ancho o alto).
     *
     * @return Las dimensiones preferidas del botón circular.
     */
    @Override
    public Dimension getPreferredSize() {
        Dimension size = super.getPreferredSize();
        int diameter = Math.max(size.width, size.height); // Usar el mayor valor entre ancho y alto
        size.setSize(diameter, diameter); // Ajustar el tamaño para que sea un cuadrado
        return size;
    }

    /**
     * Sobrescribe el método {@link JButton#contains(int, int)} para definir que el área activa
     * del botón sea un círculo en lugar de un rectángulo.
     *
     * @param x Coordenada X del punto a verificar.
     * @param y Coordenada Y del punto a verificar.
     * @return {@code true} si el punto (x, y) está dentro del círculo, de lo contrario {@code false}.
     */
    @Override
    public boolean contains(int x, int y) {
        Ellipse2D circle = new Ellipse2D.Float(0, 0, getWidth(), getHeight());
        return circle.contains(x, y); // Verificar si el punto está dentro del círculo
    }
}
