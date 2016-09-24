package Model;

/**
 * Created by janpa on 12.09.2016.
 */
public class textAdventure
{
    private String[] Text=new String[22];
    private String[] Aktion=new String[15];
    private String[] anfangsdialog = new String[1];
    private String[] endbildschirm = new String[1];

    public textAdventure() {

        anfangsdialog[0]="Hallo wir erklären dir nun kurz das prinzip des Spiels!\nDu kannst einfach in die Konsole klicken und dann dort meißt a/b/c/d Antworten auswählen oder dich im Fenster durch klicken!\nAber jetzt sag uns doch ertmal wie du heißt?";
        endbildschirm[0]="Vielen Dank. Du hast dieses Text-Adventure erfolgreich abgeschlossen! Hurray";
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
        /*Angriff*/this.Text[11] = "Du machst 5 Schaden am Troll\n es scheint als würde er nur noch ein paar Schläge aushalten!\n Er hat noch 15 HP!";
        /*3xAngriff*/this.Text[12] = "Wow was für eine Kombo! Der zerschetzelst ihn wie mit einem Messer durch Butter!";
        /*Truhe*/this.Text[13] = "Du schiebst den Troll zur Seite und gehst zur Truhe!\n Dein Schlüssel vibriert. Er passt!";
        /*Treasure*/this.Text[14] = "Du erhältst einen Schlüssel und einen Totenkopf";
        /*DIE TÜR*/this.Text[15] = "Der Schlüssel passt nicht jedoch der Totenkopf! Wie komisch!\n";
        /*Etwas unerwartetes*/this.Text[16] = "Du gelangst auf eine Lichtung. Naja eine erleuchtete Fläche.\nIn der Mitte eine große Truhe sie scheint offen zu sein!";
        /*Die große kleine truhe*/this.Text[17] = "Du erblickst eine kleine Truhe zu der dein Schlüssel passt! Du öffnest sie!";
        /*weiter gehen*/this.Text[18] = "Du traust dem Braten nicht und suchst einen Weg, der dich weiter führt!\n Nach einer halben Stunde stellst du fest, dass du im Kreis gelaufen bist und dich nun der Truhe widmest!";
        /*Inhalt*/this.Text[19] = "In der kleinen Truhe ist ein Stück Pergament. Auf dem steht geschrieben: Dähmlich oder weise das ist hier die Frage! \nDas Ziel ist erreicht, nur welches!?\nReal oder fiktiv?";
        /*Real*/this.Text[20] = "Der Terror bleibt dir bestehen! Für immer in dieser Welt! R.I.P.";
        /*Fiktiv*/this.Text[21] = "Nur ein Traum hat dich geleitet! Du erwachest!";


        /*Auswahl erste Entscheidung*/this.Aktion[0]= "Rechts";
        /*Auswahl erste Entscheidung*/this.Aktion[1]= "Links";
        /*Auswahl erste Entscheidung*/this.Aktion[2]= "Vorne";
        /*Auswahl zweite Entscheidung*/this.Aktion[3]= "Dunkel";
        /*Auswahl zweite Entscheidung*/this.Aktion[4]= "Sichtbar";
        /*Auswahl zweite Entscheidungg*/this.Aktion[5]= "Tür";
        /*Schlüssel*/this.Aktion[6]= "Hineinschauen";
        /*Auswahl dritteEntschedung*/this.Aktion[7]= "Stille";
        /*Auswahl dritteEntschedung*/this.Aktion[8]= "Winseln";
        /*Auswahl Troll*/this.Aktion[9]= "Attackieren";
        /*Auswahl 3xAngriff*/this.Aktion[10] = "3xSchläge";
        /*Auswahl Etwas unerwartetes*/this.Aktion[11] = "Öffnen";
        /*Auswahl Etwas unerwartetes*/this.Aktion[12] = "weiter gehen";
        /*Auswahl Inhalt*/this.Aktion[13] = "Real";
        /*Auswahl*/this.Aktion[14] = "Fiktiv";

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
