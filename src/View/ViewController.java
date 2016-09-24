package View;

import View.GUI;
import Control.MainController;

/**
 * Created by 204g02 on 23.09.2016.
 */
public class ViewController
{
    public String text;

    public ViewController()
    {

    }

    public void textAusgebenG(String text)
    {
        for (int i = 0; i < text.length(); i++)
        {
            char result = text.charAt(i);
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
