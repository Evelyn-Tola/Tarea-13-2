
package componentes;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Panel extends JPanel{
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);

        // Dibujar cabeza (círculo)
        g.setColor(Color.PINK);
        g.fillOval(150, 50, 100, 100); // Cabeza

        // Dibujar cuerpo (línea)
        g.setColor(Color.BLACK);
        g.drawLine(200, 150, 200, 300); // Cuerpo

        // Dibujar brazos (líneas)
        g.drawLine(200, 180, 130, 250); // Brazo izquierdo
        g.drawLine(200, 180, 270, 250); // Brazo derecho

        // Dibujar piernas (líneas)
        g.drawLine(200, 300, 150, 400); // Pierna izquierda
        g.drawLine(200, 300, 250, 400); // Pierna derecha

        // Dibujar ojos (círculos pequeños)
        g.setColor(Color.BLUE);
        g.fillOval(175, 80, 10, 10); // Ojo izquierdo
        g.fillOval(215, 80, 10, 10); // Ojo derecho

        // Dibujar boca (línea)
        g.setColor(Color.RED);
        g.drawLine(185, 120, 215, 120); // Boca
    }
    
}
