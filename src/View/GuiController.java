package View;

import View.GUI;
import Control.MainController;

/**
 * Created by 204g02 on 23.09.2016.
 */
public class GuiController
{
    public String text;



    public GuiController()
    {

    }

    public void textAusgeben(String text)
    {
        String t = text;
        for (int i = 0; i < text.length(); i++)
        {
            char result = t.charAt(i);
            System.out.print(result);
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }
}
