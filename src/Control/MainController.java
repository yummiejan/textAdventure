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
            guiStory();
        }
        else if(aus.getAuswahl() == 1)
        {
            anfangsDialogKonsole();
            consoleStory();
        }
    }

    public void anfangsDialogKonsole()
    {
        fyngui.textHinzufügenMitAuswahl(text.getAnfangsdialog(0));
        player.setName(fyngui.getInput());
        fyngui.textHinzufügenMitAuswahl("Hallo "+player.getName());
    }
    public void consoleStory() {
        fyngui.textHinzufügenMitAuswahl(text.getText(0));
        fyngui.textHinzufügenMitAuswahl(text.getText(1), "Holz Tür", "Stahl Tür", "Stein Tür");
        fyngui.getInput();
        fyngui.textHinzufügenMitAuswahl(text.getText(2));
        if (fyngui.getInput().equals("a")) {
            fyngui.textHinzufügenMitAuswahl(text.getText(5));
        } else if (fyngui.getInput().equals("b")) { //TODO Fehler das man 2 mal b drücken muss
            fyngui.textHinzufügenMitAuswahl(text.getText(4), "den sichtbaren", "den dunklen");
            if (fyngui.getInput().equals("a")) {
                fyngui.textHinzufügenMitAuswahl(text.getText(5));
            }else if (fyngui.getInput().equals("b")) {
                fyngui.textHinzufügenMitAuswahl(text.getText(3));
            }
        } else if (fyngui.getInput().equals("c")) {
            fyngui.textHinzufügenMitAuswahl(text.getText(3));
        }
        fyngui.textHinzufügenMitAuswahl(text.getText(6));
        fyngui.textHinzufügenMitAuswahl(text.getText(7));

    }
    public void guiStory()
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
        while(viewcontrol.getButtonPressed() == 0)
        {
            System.out.print("");
        }
        switch(viewcontrol.getButtonPressed())
        {
            case 1:
                viewcontrol.textAusgebenG(text.getText(2), Color.RED);
                break;
            case 2:
                viewcontrol.textAusgebenG(text.getText(2), Color.RED);
                break;
            case 3:
                viewcontrol.textAusgebenG(text.getText(2), Color.RED);
                break;
        }
        viewcontrol.resetButton();
        viewcontrol.buttonText(text.getAktion(3),text.getAktion(4),text.getAktion(5),null);
        switch(viewcontrol.getButtonPressed())
        {
            case 1:
                viewcontrol.textAusgebenG(text.getText(3), Color.RED);
                System.out.println("");
                break;
            case 2:
                viewcontrol.textAusgebenG(text.getText(4), Color.RED);
                break;
            case 3:
                viewcontrol.textAusgebenG(text.getText(5), Color.RED);
                break;
        }
        viewcontrol.resetButton();

    }

}
