package View;

import java.util.Scanner;

/**
 * Created by janpa on 11.09.2016.
 */
public class Console
{
    Scanner scanner = new Scanner(System.in);


    public void textHinzufügenMitAuswahl(String text)
    {
        System.out.println(text);
    }

    public void textHinzufügenMitAuswahl(String text,String antwort1,String antwort2)
    {
        System.out.println(text);
        System.out.println(" a) " + antwort1 + "\n b) " + antwort2);
    }

    public void textHinzufügenMitAuswahl(String text,String antwort1,String antwort2,String antwort3)
    {
        System.out.println(text);
        System.out.println(" a) " + antwort1 + "\n b) " + antwort2);
        System.out.println(" a) " + antwort1 + "\n b) " + antwort2 + "\n c) " + antwort3);

    }

    public void textHinzufügenMitAuswahl(String text,String antwort1,String antwort2,String antwort3,String antwort4)
    {
        System.out.println(text);
        System.out.println(" a) " + antwort1 + "\n b) " + antwort2);
        System.out.println(" a) " + antwort1 + "\n b) " + antwort2 + "\n c) " + antwort3);
        System.out.println(" a) " + antwort1 + "\n b) " + antwort2 + "\n c) " + antwort3 + "\n d) " + antwort4);
    }


    public void textHinzufügen(String text)
    {
        System.out.println(text);
    }

    public String getInput()
    {
        return scanner.nextLine();
    }



}
