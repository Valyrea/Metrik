package softwaretechnik.de;

import java.awt.*;


/**
 * @author Jana Apfelhofer M27431
 * @author Miriam Bork M27432
 * @date 07.10.2021
 * Software technology task 1
 *
 * The MainFrame class which extends Frame
 * Contains two private static instances
 *
 */
public class MainFrame extends Frame {

    private static PaintAreaController _paController = new PaintAreaController();
    private static PaintArea _paintArea = new PaintArea(_paController);


    /**
     * Getter Method for _paintArea
     * @return _paintArea
     */
    public static PaintArea get_paintArea() {
        return _paintArea;
    }


    /**
     * defines the title and size of the Window.
     * @param mfc the MainFrameController
     */
    public MainFrame(MainFrameController mfc){
        setTitle("AWT-Demo");
        setSize(600, 500);

        addWindowListener(mfc);
        add(_paintArea);

    }

}
