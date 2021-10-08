package softwaretechnik.de;


import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * @author Jana Apfelhofer M27431
 * @author Miriam Bork M27432
 * @date 07.10.2021
 *
 * software technology task 1
 *
 * This is the PaintAreaController class which implements MouseListener.
 *
 *It contains 3 private static variables.
 */

public class PaintAreaController implements MouseListener {

    private static float x = 0;
    private static float y = 0;
    private int clicks = 0;

    /**
     * This method is activated as soon as the mouse is clicked.
     * If there are less than 2 clicks, the coordinates get set and calls the paint-method, which draws the shapes.
     * If there are more, the click counter and the coordinates are reset.
     * @param e MouseEvent
     */
    @Override
    public void mouseClicked(MouseEvent e) {

        if (clicks<2){
            x = e.getX();
            setX(x);

            y = e.getY();
            setY(y);
            MainFrame.get_paintArea().paint(MainFrame.get_paintArea().getGraphics());
            clicks++;
        } else {
            x = y = 0;
            MainFrame.get_paintArea().repaint();
            clicks = 0;
        }


    }


    /**
     * setter for the x coordinate
     * @param x
     */
    public static void setX(float x) {
        PaintAreaController.x = x;
    }

    /**
     * setter for the y coordinate
     * @param y
     */
    public static void setY(float y) {
        PaintAreaController.y = y;
    }

    /**
     * getter for the x coordinate
     * @return x
     */
    public static float getX() {
        return x;
    }

    /**
     * getter for the y coordinate
     * @return y
     */
    public static float getY() { return y; }

    /**
     * This method gets called when the mouse is pressed.
     * @param e MouseEvent
     */
    @Override
    public void mousePressed(MouseEvent e) {

    }

    /**
     * This method gets called when the mouse is released.
     * @param e MouseEvent
     */
    @Override
    public void mouseReleased(MouseEvent e) {

    }

    /**
     * This method gets called when the mouse is entered.
     * @param e MouseEvent
     */
    @Override
    public void mouseEntered(MouseEvent e) {

    }

    /**
     * This method gets called when the mouse is exited.
     * @param e MouseEvent
     */
    @Override
    public void mouseExited(MouseEvent e) {

    }
}
