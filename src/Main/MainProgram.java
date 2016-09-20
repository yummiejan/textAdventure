package Main;

import Control.MainController;
import View.AuswahlGUI;
import View.Console;
import View.GUI;

/**
 * Created by 204g02 on 12.09.2016.
 */
public class MainProgram
{
    public static void main(String[] args)
    {
        MainController control = new MainController();
        //AuswahlGUI auswahl = new AuswahlGUI();
        GUI jangui = new GUI(control);
    }
}
