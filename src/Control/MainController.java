package Control;


import Model.Creature;
import Model.Monster;
import Model.Player;
import View.*;

import java.awt.*;
import java.util.Random;

/**
 * Created by janpa on 11.09.2016.
 */
public class MainController
{
    Console fyngui = new Console();
    Model.textAdventure text = new Model.textAdventure();
    Player player = new Player("name",100,0,0,5);
    Monster troll = new Monster("Troll",100,5,3);
    AuswahlGUI aus = new AuswahlGUI();
    ViewController viewcontrol;

    public MainController()
    {
        //Auswahl der Gui
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

    //Konsole anfangsstory
    public void anfangsDialogKonsole()
    {
        fyngui.textHinzufügenMitAuswahl(text.getAnfangsdialog(0));
        player.setName(fyngui.getInput());
        fyngui.textHinzufügenMitAuswahl("Hallo "+player.getName());
        while (player.getPunkte()>0)
        {
            fyngui.textHinzufügenMitAuswahl("Du hast noch "+player.getPunkte()+" "+text.getAnfangsdialog(2));
            if (fyngui.getInput().equals("a"))
            {
                player.setHp(player.getHp()+10);
            }else if (fyngui.getInput().equals("b")){
                player.setAttackPoints(player.getAttackPoints()+5);
            }else if (fyngui.getInput().equals("c")){
                player.setDefensePoints(player.getDefensePoints()+5);
            }
            player.setPunkte(player.getPunkte()-1);
        }
    }

    //Konsole story komplett
    public void consoleStory() {
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
        if(fyngui.getInput().equals("a"))
        {
            fyngui.textHinzufügenMitAuswahl(text.getText(9));
        }else{
            fyngui.textHinzufügenMitAuswahl(text.getText(8));
        }
        fyngui.textHinzufügenMitAuswahl(text.getText(10));
        fyngui.textHinzufügenMitAuswahl(text.getText(11));
        troll.setName("Troll");
        fyngui.textHinzufügenMitAuswahl(kaempfen(player,troll));
        fyngui.textHinzufügenMitAuswahl(text.getText(13));
        fyngui.textHinzufügenMitAuswahl(text.getText(14));
        fyngui.textHinzufügenMitAuswahl(text.getText(15));
        fyngui.textHinzufügenMitAuswahl(text.getText(16));
        fyngui.textHinzufügenMitAuswahl(text.getText(17));
        fyngui.textHinzufügenMitAuswahl(text.getText(18));
        fyngui.textHinzufügenMitAuswahl(text.getText(19));
        if (fyngui.getInput().equals("a"))
        {
            fyngui.textHinzufügenMitAuswahl(text.getText(20));
        }else{
            fyngui.textHinzufügenMitAuswahl(text.getText(21));
        }




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
        viewcontrol.textAusgebenG(text.getText(6), Color.RED);
        viewcontrol.textAusgebenG(text.getText(7), Color.RED);
        viewcontrol.buttonText(text.getAktion(7), text.getAktion(8), null, null);
        switch(viewcontrol.getButtonPressed())
        {
            case 1:
                viewcontrol.textAusgebenG(text.getText(8), Color.RED);
                break;
            case 2:
                viewcontrol.textAusgebenG(text.getText(9), Color.RED);
                break;
        }
        viewcontrol.resetButton();
        viewcontrol.buttonText(text.getAktion(9), null, null, null);
        switch(viewcontrol.getButtonPressed())
        {
            case 1:
                viewcontrol.textAusgebenG(text.getText(10), Color.RED);
                break;
        }
        viewcontrol.resetButton();
        viewcontrol.textAusgebenG(text.getText(11), Color.RED);
        viewcontrol.buttonText(text.getAktion(10), null, null, null);
        switch(viewcontrol.getButtonPressed())
        {
            case 1:
                viewcontrol.textAusgebenG(text.getText(12), Color.RED);
                break;
        }
        viewcontrol.resetButton();
        viewcontrol.textAusgebenG(text.getText(13), Color.RED);
        viewcontrol.buttonText(text.getAktion(11), null, null, null);
        switch (viewcontrol.getButtonPressed())
        {
            case 1:
                viewcontrol.textAusgebenG(text.getText(14), Color.RED);
                break;
        }
        viewcontrol.resetButton();
        viewcontrol.textAusgebenG(text.getText(15), Color.RED);
        viewcontrol.textAusgebenG(text.getText(16), Color.RED);
        viewcontrol.buttonText(text.getAktion(11), text.getAktion(12), null, null);
        switch(viewcontrol.getButtonPressed())
        {
            case 1:
                viewcontrol.textAusgebenG(text.getText(17), Color.RED);
                break;
            case 2:
                viewcontrol.textAusgebenG(text.getText(18), Color.RED);
                viewcontrol.textAusgebenG(text.getText(17), Color.RED);
                break;
        }
        viewcontrol.resetButton();
        viewcontrol.textAusgebenG(text.getText(19), Color.RED);
        viewcontrol.buttonText(text.getAktion(13), text.getAktion(14), null, null);
        switch(viewcontrol.getButtonPressed())
        {
            case 1:
                viewcontrol.textAusgebenG(text.getText(20), Color.RED);
                break;
            case 2:
                viewcontrol.textAusgebenG(text.getText(21), Color.RED);
                break;
        }
        viewcontrol.resetButton();
        viewcontrol.textAusgebenG(text.getEnd(0), Color.RED);
    }

    //Methode fürs Kämpfen vergleicht Werte
    public String kaempfen(Creature a,Creature b)
    {
        //Solange beide Leben haben wird gekämpft
        while(a.getHp()>0&&b.getHp()>0)
        {
            //Schaden auf das Leben des Gegners wird aus den Angriffspunkten minus den Verteidigungspunkten errechnet
            b.setHp(b.getHp()-(a.getAttackPoints()-b.getDefensePoints()));
            a.setHp(b.getHp()-(b.getAttackPoints()-a.getDefensePoints()));
        }
        //Wenn a über 0 Leben hat gewinnt a wenn nicht dann b und es wird ausgegeben mit wie vielen Lebenspunkten man gewinnt
        if (a.getHp()>0)
        {
            return a.getName()+" besiegt "+b.getName()+" mit "+a.getHp()+" Lebenspunkten";
        }else{
            return b.getName()+" besiegt "+a.getName()+" mit "+b.getHp()+" Lebenspunkten";
        }

    }

}
