package Model;
import Model.Monster;
/**
 * Created by janpa on 12.09.2016.
 */
public class textAdventure
{
    private String[] Text;
    private String[] Aktion;
    private String[] anfangsdialog = new String[10];

    public textAdventure() {

        anfangsdialog[0]="Hallo wir erklären dir nun kurz das prinzip des Spiels!\nDu kannst einfach in die Konsole klicken und dann dort meißt a/b/c/d Antworten auswählen oder andere Sachen eintippen jenachdem was dort steht!\nAber jetzt sag uns doch ertmal wie du heißt?";





        this.Text = new String[15];
        this.Aktion = new String[20];
        this.Text[0] = "Hallo, und wilkommen in ... ach weiß ich doch auch nicht!"+ "\n"+"Jedenfalls willst du hier nicht lange bleiben und suchst einen Ausweg aus dem Dunkel!";

        /*erste Entscheidung*/this.Text[1] = "OK, nun stehst du vor 3 Türen. Wähle";
        /*zweite Entscheidung*/this.Text[2] = "Gute Wahl, denke Ich. 3 Wege kannst du erkennen."+"\n"+" a) Der Linke: Frei\n b) Der Rechte: Ein verschlossenes Tor\n c) Der Vordere: Zu dunkel um etwas zu sehen.";
        /*Vorne*/this.Text[3] = "Es war zu dunkel und du bist in ein Loch gefallen." +"\n"+"Du bist an einem langen elenden Tod verreckt!";
        /*Rechts*/this.Text[4] = "Die Tür ist zu.";
        /*Links*/this.Text[5] = "Du folgst dem dir sichtbaren Weg, und findest eine Truhe... "+"\n"+"Die Truhe ist OFFEN";
        /*Schlüssel*/this.Text[6] = "Du hast einen Schlüssel gefunden."+"\n"+"Vieleicht passt er ja zu der Tür";
        /*dritte Entscheidung*/this.Text[7] = "Du versuchst die Tür zu Öffnen. Der Schlüssel passt nicht!"+"\n"+"Du gehst wieder zur Truhe wo du den Schlüssel gefunden hast!"+"\n"+"2 Wege füren dich weiter, von rechts hörst du ein winseln. Von links Totenstille.";
        /*totenstille*/this.Text[8] = "Du bist in eine Sackgasse gelaufen und drehst wieder um."+"\n"+"Du gehst nun den Weg wo ein winseln herkommt.Ein Troll steht vor dir. Angeckettet. Hinter ihm eine Truhe. Er schnaubt.";
        /*winseln*/this.Text[9] = "Ein Troll steht vor dir. Angeckettet. Hinter ihm eine Truhe. Er schnaubt.\nDer Troll versperrt dir den Weg. Du kommst nicht an die Kiste herran."+"\n"+"Du musst ihn besiegen. Der Schlüssel verleit dir 2 attackPoints.";
        /*attack*/this.Text[10] = "Du kämpfst, aber weißt nicht wofür. Es ist nur eine Kiste.";



        /*Auswahl erste Entscheidung*/this.Aktion[0]= "Rechts";
        /*Auswahl erste Entscheidung*/this.Aktion[1]= "Links";
        /*Auswahl erste Entscheidung*/this.Aktion[2]= "Vorne";
        /*Auswahl zweite Entscheidung*/this.Aktion[3]= "Dunkel";
        /*Auswahl zweite Entscheidung*/this.Aktion[4]= "Sichtbar";
        /*Auswahl zweite Entscheidungg*/this.Aktion[5]= "Tür";
        /*Schlüssel*/this.Aktion[6]= "Hineinschauen";
        /*dritteEntschedung*/this.Aktion[7]= "Stille";
        /*dritteEntschedung*/this.Aktion[8]= "Winseln";
        /*Troll*/this.Aktion[9]= "Attackieren";

    }

    public String getAnfangsdialog(int i)
    {
        return anfangsdialog[i];
    }

    public String getText(int i) {
        return Text[i];
    }
    public String getAktion(int i){
        return Aktion[i];
    }
}
