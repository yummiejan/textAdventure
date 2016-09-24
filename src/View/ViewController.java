package View;

import View.*;
import Control.MainController;

/**
 * Created by 204g02 on 23.09.2016.
 */
public class ViewController
{
    public GUI gui = new GUI();

    public ViewController()
    {

    }

    public void textAusgebenG(String text)
    {
        for (int i = 0; i < text.length(); i++)
        {
            char result = text.charAt(i);
            gui.enterText(result);
            try
            {
                Thread.sleep(40);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }
}
