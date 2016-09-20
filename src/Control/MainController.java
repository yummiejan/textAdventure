package Control;


import Model.Player;
import View.AuswahlGUI;
import View.Console;
import View.GUI;

import javax.swing.*;

/**
 * Created by janpa on 11.09.2016.
 */
public class MainController
{
    Console fyngui = new Console();
    Model.textAdventure text = new Model.textAdventure();
    Player player = new Player("name",100,1,1);

    public MainController()
    {
        if(JOptionPane.showInputDialog(null,"Startfenster","Konsole/Fenster").equals("Fenster"))
        {
            GUI jangui = new GUI();
        }else{
            Console fyngui = new Console();
            anfangsDialogKonsole();
        }
    }

    public void anfangsDialogKonsole()
    {
        fyngui.textHinzufügenMitAuswahl(text.getAnfangsdialog(0));
        player.setName(fyngui.getInput());
        fyngui.textHinzufügen("Hallo "+player.getName());
    }

}
