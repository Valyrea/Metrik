package softwaretechnik.de;

import org.w3c.dom.css.RGBColor;

import javax.swing.*;
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

    private static int n = 20;



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

        MenuItem radius = new MenuItem("Radius");

        mFile.add(blue);
        mFile.add(pink);
        mFile.add(violet);
        mFile.add(white);

        Menu mSettings = new Menu("Settings");
        mSettings.add(radius);

        mbar.add(mFile);
        mbar.add(mSettings);
        setMenuBar(mbar);

        blue.addActionListener(e -> {

            _paintArea.setBackground(new Color(130,173,218));
        });
        pink.addActionListener(e -> {
            _paintArea.setBackground(new Color(142,28,98));
        });
        violet.addActionListener(e -> {
            _paintArea.setBackground(new Color (82, 43, 106));
        });
        white.addActionListener(e -> {
            _paintArea.setBackground(Color.white);
        });


        radius.addActionListener(e -> {
            TextField tex = new TextField();
            Integer[] options = {20, 30, 40, 50, 60};
            n = (Integer)JOptionPane.showInputDialog(null, "Choose the Radius:",
                    "Radius", JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            setN(n);


        });


    }
    public void setN(int n) {
        this.n = n;
    }

    public static int getN() {
        return n;
    }

}
