package Control;


import Model.Player;
import View.*;

import java.awt.*;

/**
 * Created by janpa on 11.09.2016.
 */
public class MainController
{
    Console fyngui = new Console();
    Model.textAdventure text = new Model.textAdventure();
    Player player = new Player("name",100,1,1);
    AuswahlGUI aus = new AuswahlGUI();
    ViewController viewcontrol;

    public MainController()
    {
        while(aus.getAuswahl() == 0)
        {
            System.out.print("");
        }
        if(aus.getAuswahl()==2)
        {
            viewcontrol = new ViewController();
            guiTest();
        }
        else if(aus.getAuswahl() == 1)
        {
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
    public void guiTest()
    {
        viewcontrol.textAusgebenG(text.getAnfangsdialog(0) + "\n", Color.RED);
        viewcontrol.setEditable(true);
        while(viewcontrol.getName() == null)
        {
            System.out.print("");
        }
        viewcontrol.setEditable(false);
        player.setName(viewcontrol.getName());
        viewcontrol.textAusgebenG("Hallo " + player.getName() + "! \n", Color.RED);
        viewcontrol.textAusgebenG(text.getText(0), Color.RED);
        viewcontrol.textAusgebenG(text.getText(1), Color.RED);
        viewcontrol.buttonText(text.getAktion(0),text.getAktion(1),text.getAktion(2),null);

    }

}
