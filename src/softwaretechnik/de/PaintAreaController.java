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

    private static int x1;
    private static int x2;
    private static int y1;
    private static int y2;


    public void setX1(int x1) {
        PaintAreaController.x1 = x1;
    }

    public void setX2(int x2) {
        PaintAreaController.x2 = x2;
    }

    public void setY1(int y1) {
        PaintAreaController.y1 = y1;
    }

    public void setY2(int y2) {
        PaintAreaController.y2 = y2;
    }

    public static int getX1() {
        return x1;
    }

    public static int getX2() {
        return x2;
    }

    public static int getY1() {
        return y1;
    }

    public static int getY2() {
        return y2;
    }

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

            if (clicks == 0) {
                x1 = e.getX();
                setX1(x1);
                y1 = e.getY();
                setY1(y1);

            } else if (clicks == 1){
                x2 = e.getX();
                setX2(x2);

                y2 = e.getY();
                setY2(y2);
            }
            MainFrame.get_paintArea().paint(MainFrame.get_paintArea().getGraphics());
            clicks++;
        } else {
            x = y = 0;
            x1 = x2 = y1 = y2 = 0;
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
