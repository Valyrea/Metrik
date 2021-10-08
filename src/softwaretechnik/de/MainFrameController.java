package softwaretechnik.de;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


/**
 * @author Jana Apfelhofer M27431
 * @author Miriam Bork M27432
 * @date 07.10.2021
 * Software technology task 1
 *
 *
 * The MainFrameCOntroller class which extends WindowListener
 *
 * Overrides the Window Methods
 */
public class MainFrameController implements WindowListener {

    /**
     * Method gets called when the window is opend the first time
     * @param e windowEvent
     */
    @Override
    public void windowOpened(WindowEvent e) {

    }

    /**
     * Closes the window
     * @param e WindowEvent
     */
    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    /**
     * Method gets called when the window is closed
     * @param e WindowEvent
     */
    @Override
    public void windowClosed(WindowEvent e) {

    }

    /**
     * Method gets called when the window size get changed
     * @param e WindowEvent
     */
    @Override
    public void windowIconified(WindowEvent e) {

    }

    /**
     * Method gets called when the window size get changed back
     * @param e WindowEvent
     */
    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    /**
     * Method gets called when the window gets active
     * @param e WindowEvent
     */
    @Override
    public void windowActivated(WindowEvent e) {

    }

    /**
     * Method gets called when the window gets deactivated
     * @param e WindowEvent
     */
    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
