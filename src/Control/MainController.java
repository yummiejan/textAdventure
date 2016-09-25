package Control;


import Model.Player;
import View.AuswahlGUI;
import View.Console;
import View.GUI;
import View.GuiController;

import javax.swing.*;

/**
 * Created by janpa on 11.09.2016.
 */
public class MainController
{
    Console fyngui = new Console();
    GuiController guicontrol = new GuiController();
    GUI jangui = new GUI();
    Model.textAdventure text = new Model.textAdventure();
    Player player = new Player("name",100,1,1);

    public MainController()
    {
        AuswahlGUI aus = new AuswahlGUI();
        while(aus.getAuswahl() == 0);
        if(aus.getAuswahl()==2)
        {
            jangui.setVisible(true);

        }else{

            anfangsDialogKonsole();
            test();
        }

    }

    public void anfangsDialogKonsole()
    {
        fyngui.textHinzufügenMitAuswahl(text.getAnfangsdialog(0));
        player.setName(fyngui.getInput());
        fyngui.textHinzufügenMitAuswahl("Hallo "+player.getName());
    }
    public void test() {
        fyngui.textHinzufügenMitAuswahl(text.getText(0));
        fyngui.textHinzufügenMitAuswahl(text.getText(1), "Holz Tür", "Stahl Tür", "Stein Tür");
        fyngui.getInput();
        fyngui.textHinzufügenMitAuswahl(text.getText(2));
        if (fyngui.getInput().equals("a")) {
            fyngui.textHinzufügenMitAuswahl(text.getText(5));
        } else if (fyngui.getInput().equals("b")) {
            fyngui.textHinzufügenMitAuswahl(text.getText(4), "den sichtbaren", "den dunklen");
            if (fyngui.getInput().equals("a")) {
                fyngui.textHinzufügenMitAuswahl(text.getText(5));
            }
        } else if (fyngui.getInput().equals("c")) {
            fyngui.textHinzufügenMitAuswahl(text.getText(3));
        }

    }

    public void guiStory(){
        jangui.textAusgeben(text.getText(0));
        jangui.textAusgeben(text.getText(1));
    }

}
