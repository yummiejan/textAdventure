package Model;

/**
 * Created by janpa on 12.09.2016.
 */
public class textAdventure
{
    private String[] Text;
    private String[] Aktion;

    public textAdventure() {
        this.Text = new String[10];
        this.Aktion = new String[20];
        this.Text[0] = "Hallo, und wilkommen in ... ach weiß ich doch auch nicht!"+ "\n"+"Jedenfalls willst du hier nicht lange bleiben und suchst einen Ausweg aus dem Dunkel!";
        this.Text[1] = "OK, nun stehst du vor 3 Türen. Vorne - Rechts - Links, Wähle";
        this.Text[2] = "Gute Wahl, denke Ich. 3 Wege kannst du erkennen."+"\n"+"Der Linke: Frei - Der Rechte: Ein verschlossenes Tor - Der Vordere: Zu dunkel um etwas zu sehen.";
        this.Text[3] = "Es war zu dunkel und du bist in ein Loch gefallen." +"\n"+"Du bist an einem langen elenden Tod verreckt!";
        this.Text[4] = "Die Tür ist zu. Willst du den Sichtbaren Weg gehen oder den Dunklen?";
        this.Text[5] = "Du folgst dem dir sichtbaren Weg, und findest eine Truhe... "+"\n"+"Die Truhe ist OFFEN";
        this.Text[6] = "Du hast einen Schlüssel gefunden."+"\n"+"Vieleicht passt er ja zu der Tür";
        this.Text[7] = "Du versuchst die Tür zu Öffnen. Der Schlüssel passt nicht!"+"\n"+"Du gehst wieder zur Truhe wo du den Schlüssel gefunden hast!"+"\n"+"2 Wege füren dich weiter, von rechts hörst du ein winseln. Von links Totenstille.";
        this.Text[8] = "Du bist in eine Sackgasse gelaufen und drehst wieder um."+"\n"+"Du gehst nun den Weg wo ein winseln herkommt."+"\n"+"Ein Troll steht vor dir. Angeckettet. Hinter ihm eine Truhe. Er schnaubt.";
        this.Text[9] = "Der Troll versperrt dir den Weg. Du kommst nicht an die Kiste herran."+"\n"+"Du musst ihn besiegen. Der Schlüssel verleit dir 2 attackPoints.";
        this.Aktion[0]= "Rechts";
        this.Aktion[1]= "Links";
        this.Aktion[2]= "Vorne";
        this.Aktion[3]= "Dunkel";
        this.Aktion[4]= "Sichtbar";
        this.Aktion[5]= "Tür";
        this.Aktion[6]= "Hineinschauen";
        this.Aktion[7]= "Stille";
        this.Aktion[8]= "Winseln";
        this.Aktion[9]= "Attackieren";
    }

    public String getText(int i) {
        return Text[i];
    }
    public String getAktion(int i){
        return Aktion[i];
    }
}
