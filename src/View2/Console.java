package View2;

import java.util.Scanner;

/**
 * Created by janpa on 11.09.2016.
 */
public class Console
{
    Scanner scanner = new Scanner(System.in);


    public void textHinzufügenMitAuswahl(int i,String text,String antwort1,String antwort2,String antwort3,String antwort4)
    {
        System.out.println(text);
        if (i==2)
        {
            System.out.println(" a) " + antwort1 + "\n b) " + antwort2);
        }else if (i==3){
            System.out.println(" a) " + antwort1 + "\n b) " + antwort2 + "\n c) " + antwort3);
        }else{
            System.out.println(" a) " + antwort1 + "\n b) " + antwort2 + "\n c) " + antwort3 + "\n d) " + antwort4);
        }
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
