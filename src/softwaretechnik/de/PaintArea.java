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
        int rad = MainFrame.getN();

        if(x == 0 && y == 0) { return; }

        Ellipse2D ellipse2D;
        ellipse2D = new Ellipse2D.Float(
                x-25,  y-25,
                rad*2, rad*2
        );
        Graphics2D gd2 = (Graphics2D) g;

        gd2.setStroke(new BasicStroke(3.0F));

        int var1;
        int var2;

        switch (rad) {
            case 20:
                var1 = 40;
                var2 = 35;
                break;
            case 30:
                var1 = 33;
                var2 = 57;
                break;
            case 40:
                var1 = 23;
                var2 = 73;
                break;
            case 50:
                var1 = 11;
                var2 = 92;
                break;
            case 60:
                var1 = 3;
                var2 = 111;
                break;
            default:
                var1 = 40;
                var2 = 35;
        }

        gd2.drawString("(" + x + ", " + y + ")", x-var1, y+var2);

        int x1 = PaintAreaController.getX1();
        int x2 = PaintAreaController.getX2();
        int y1 = PaintAreaController.getY1();
        int y2 = PaintAreaController.getY2();

        if (x2 != 0){
            gd2.drawLine(x1, y1, x2, y2);
        }

        gd2.draw(ellipse2D);

    }

}
