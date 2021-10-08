package softwaretechnik.de;

/**
 * @author Jana Apfelhofer M27431
 * @author Miriam Bork M27432
 * @date 07.10.2021
 *
 * software technology task 1
 *
 * This is the executing Program-Class which contains the main-method.
 *
 */

public class Program {

    public static void main(String[] args) {

        //new MainFrameController
        MainFrameController mfc = new MainFrameController();

        //new MainFrame, the belonging Controller gets handed over
        MainFrame mf = new MainFrame(mfc);

        //MainFrame Visibility
        mf.setVisible(true);



    }

}