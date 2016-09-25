package View;

import java.util.Scanner;

/**
 * Created by janpa on 11.09.2016.
 */
public class Console
{
    //Neuen Scanner erstellen
    Scanner scanner = new Scanner(System.in);

    //Text hinzufügen
    public void textHinzufügenMitAuswahl(String text)
    {
        System.out.println(text+"\n");
        try
        {
            Thread.sleep(3000);
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
    }

    //Text hinzufügen mit 2 Antwortmöglichkeitzen
    public void textHinzufügenMitAuswahl(String text,String antwort1,String antwort2)
    {
        System.out.println(text+"\n");
        System.out.println(" a) " + antwort1 + "\n b) " + antwort2);
    }

    //Text hinzufügen mit 3 Antwortmöglichkeitzen
    public void textHinzufügenMitAuswahl(String text,String antwort1,String antwort2,String antwort3)
    {
        System.out.println(text+"\n");
        System.out.println(" a) " + antwort1 + "\n b) " + antwort2 + "\n c) " + antwort3);

    }

    //Text hinzufügen mit 4 Antwortmöglichkeitzen
    public void textHinzufügenMitAuswahl(String text,String antwort1,String antwort2,String antwort3,String antwort4)
    {
        System.out.println(text+"\n");
        System.out.println(" a) " + antwort1 + "\n b) " + antwort2 + "\n c) " + antwort3 + "\n d) " + antwort4);
    }

    //Eingabe aus der Konsole als String zurückgeben
    public String getInput()
    {
        return scanner.nextLine();
    }



}
