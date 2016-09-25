package Model;

/**
 * Created by janpa on 12.09.2016.
 */
public class textAdventure
{
    private String[] Text=new String[22];
    private String[] Aktion=new String[15];
    private String[] anfangsdialog = new String[3];
    private String[] endbildschirm = new String[2];

    public textAdventure() {

        //Text für den Anfangsdialog
        anfangsdialog[0]="Hallo wir erklären dir nun kurz das Prinzip des Spiels!\nDu kannst einfach in die Konsole klicken und dann dort meist A/B/C/D als Antwort eingeben oder dich im Fenster durchklicken!\nAber jetzt sag uns doch erstmal wie du heißt?\nGib deinen Namen ein und drücke Enter!";
        anfangsdialog[1]="Du kannst in 3 Kategorien Punkte verteilen, am Anfang kannst du insgesamt 15 Punkte verteilen. Wähle Weise!";
        anfangsdialog[2]="Worin möchtest du einen Punkt investieren?\n a) Health\n b) Attack\n c) Defense";

        endbildschirm[0]="Vielen Dank. Du hast dieses Text-Adventure erfolgreich abgeschlossen! Hurrah!";
        endbildschirm[1]="Vielen Dank fürs Spielen. Du bist leider gestorben. Versuch es doch noch einmal!";
        this.Text[0] = "Willkommen in ... ach weiß ich doch auch nicht!"+ "\n"+"Jedenfalls willst du hier nicht lange bleiben und suchst einen Ausweg aus dem Dunkeln!\n";

        /*erste Entscheidung*/this.Text[1] = "OK, nun stehst du vor 3 Türen. Wähle eine aus... \n";
        /*zweite Entscheidung*/this.Text[2] = "Gute Wahl, denke ich. Du kannst 3 Wege erkennen.\n a) Der Linke: Frei\n b) Der Rechte: Ein verschlossenes Tor\n c) Der Vordere: Zu dunkel um etwas zu sehen. \n";
        /*Dunkel*/this.Text[3] = "Im Dunklen hast du nichts gesehen und  bist in ein Loch gefallen.\nDu bist an einem langen elenden Tod verreckt! \n";
        /*Tür*/this.Text[4] = "Die Tür ist zu. \n";
        /*Sichtbar*/this.Text[5] = "Du folgst dem dir sichtbaren Weg und findest eine Truhe... "+"\n"+"Die Truhe ist OFFEN.\n";
        /*Schlüssel*/this.Text[6] = "Du hast einen Schlüssel gefunden. Vielleicht passt er ja zu der Tür.\n";
        /*dritte Entscheidung*/this.Text[7] = "Du versuchst die Tür zu öffnen. Der Schlüssel passt nicht!"+"\n"+"Du gehst wieder zur Truhe, wo du den Schlüssel gefunden hast!"+"\n"+"Zwei Wege füren dich weiter:\n a) von rechts hörst du ein winseln\n b) Von links Totenstille.\n";
        /*totenstille*/this.Text[8] = "Du bist in eine Sackgasse gelaufen und drehst wieder um."+"\n"+"Du gehst nun den Weg wo das Winseln herkommt.\nEin Troll steht vor dir. Angekettet. Hinter ihm eine Truhe. Er schnaubt.\n";
        /*winseln*/this.Text[9] = "Der Troll versperrt dir den Weg. Du kommst nicht an die Kiste herran.\nDu musst ihn besiegen. Der Schlüssel verleit dir 2 attackPoints.\n";
        /*attack*/this.Text[10] = "Du kämpfst, aber weißt nicht wofür. Es ist nur eine Kiste.\n";
        /*Angriff*/this.Text[11] = "Du machst 5 Schaden am Troll.\nEs scheint als würde er nur noch ein paar Schläge aushalten!\nEr hat noch 15 HP! \n";
        /*3xAngriff*/this.Text[12] = "Wow was für eine Kombo! Du zerschnetzelst ihn wie mit einem Messer durch Butter! \n";
        /*Truhe*/this.Text[13] = "Du schiebst den Troll zur Seite und gehst zur Truhe!\nDein Schlüssel vibriert. Er passt!\n";
        /*Treasure*/this.Text[14] = "Du erhältst einen Schlüssel und einen Totenkopf.\n";
        /*DIE TÜR*/this.Text[15] = "Du gehst zurück zur Tür!\nDer Schlüssel passt jedoch nicht in dir Tür der Totenkopf jedoch schon! Wie komisch!\n";
        /*Etwas unerwartetes*/this.Text[16] = "Du gelangst auf eine Lichtung. Na ja,ist nur eine erleuchtete Fläche.\nAber in der Mitte steht eine große Truhe. Sie scheint nicht verschlossen zu sein!\n";
        /*Die große kleine truhe*/this.Text[17] = "Du erblickst in der Kiste eine kleine Box mit einem Schloss zu der dein Schlüssel passt! Du öffnest sie!\n";
        /*weiter gehen*/this.Text[18] = "Du traust dem Braten nicht und suchst einen Weg, der dich weiter führt!\nNach einer halben Stunde stellst du fest, dass du im Kreis gelaufen bist und dich nun der Truhe widmest!\n";
        /*Inhalt*/this.Text[19] = "In der kleinen Truhe ist ein Stück Pergament.\nAuf dem steht geschrieben: Dämlich oder Weise, das ist hier die Frage! \nDas Ziel ist erreicht, nur welches!?\n a) Real?\n b) Fiktiv?\n";
        /*Real*/this.Text[20] = "Der Terror bleibt dir bestehen! Für immer in dieser Welt! R.I.P.\n";
        /*Fiktiv*/this.Text[21] = "Nur ein Traum hat dich geleitet! Du erwachst!\n";


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
        /*Auswahl 3xAngriff*/this.Aktion[10] = "3x Schläge";
        /*Auswahl Etwas unerwartetes*/this.Aktion[11] = "Öffnen";
        /*Auswahl Etwas unerwartetes*/this.Aktion[12] = "Weitergehen";
        /*Auswahl Inhalt*/this.Aktion[13] = "Real";
        /*Auswahl*/this.Aktion[14] = "Fiktiv";

    }
    //Get Methoden für die Texte
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
    public String getEnd(int i){return endbildschirm[i];}
}
