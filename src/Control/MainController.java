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
        AuswahlGUI aus = new AuswahlGUI();
        while(aus.getAuswahl() == 0);
        if(aus.getAuswahl()==2)
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
        fyngui.textHinzufügenMitAuswahl("Hallo "+player.getName());
    }

}
