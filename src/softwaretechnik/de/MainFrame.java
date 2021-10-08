package softwaretechnik.de;

import org.w3c.dom.css.RGBColor;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


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

        initializeMenu();

    }

    /**
     * This method initializes a menu bar which changes the background color.
     */
    private void initializeMenu() {
        MenuBar mbar = new MenuBar();

        Menu mFile = new Menu("Hintergrundfarbe");
        MenuItem blue = new MenuItem("blau");
        MenuItem pink = new MenuItem("rosa");
        MenuItem violet = new MenuItem("violett");
        MenuItem white = new MenuItem("weiß");

        mFile.add(blue);
        mFile.add(pink);
        mFile.add(violet);
        mFile.add(white);

        mbar.add(mFile);
        setMenuBar(mbar);

        blue.addActionListener(e -> {

            _paintArea.setBackground(new Color(130,173,218));
            _paintArea.repaint();
        });
        pink.addActionListener(e -> {
            _paintArea.setBackground(new Color(142,28,98));
            _paintArea.repaint();
        });
        violet.addActionListener(e -> {
            _paintArea.setBackground(new Color (82, 43, 106));
            _paintArea.repaint();
        });
        white.addActionListener(e -> {
            _paintArea.setBackground(Color.white);
            _paintArea.repaint();
        });



    }

}
