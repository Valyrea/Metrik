package softwaretechnik.de;

import java.awt.*;
import java.awt.geom.Ellipse2D;

/**
 * @author Jana Apfelhofer M27431
 * @author Miriam Bork M27432
 * @date 07.10.2021
 *
 * software technology task 1
 *
 * This is the PaintArea class which extends Canvas.
 *
 */

public class PaintArea  extends Canvas {



    /**
     * This is the constructor for PaintArea which sets the size of the canvas and adds the MouseListener.
     * @param pac Controller class
     */
    public PaintArea(PaintAreaController pac){
        setSize(600, 500);
        addMouseListener(pac);
    }


    /**
     * This method overrides the paint()-method. It draws circles at given coordinates.
     * @param g Graphics
     */
    @Override
    public void paint(Graphics g){

        float x = PaintAreaController.getX();
        float y = PaintAreaController.getY();

        if(x == 0 && y == 0) { return; }

        Ellipse2D ellipse2D;
        ellipse2D = new Ellipse2D.Float(
                x-25,  y-25,
                50.0F, 50.0F
        );
        Graphics2D gd2 = (Graphics2D) g;

        gd2.setStroke(new BasicStroke(3.0F));
        gd2.drawString("(" + x + ", " + y + ")", x-33, y+40);


        gd2.draw(ellipse2D);

    }

}
