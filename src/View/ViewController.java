package View;

import View.*;
import Control.MainController;

import java.awt.*;

/**
 * Created by 204g02 on 23.09.2016.
 */
public class ViewController
{
    public GUI gui = new GUI();

    public ViewController()
    {

    }

    public void textAusgebenG(String text, Color c)
    {
        for (int i = 0; i < text.length(); i++)
        {
            char result = text.charAt(i);
            gui.enterText(result, c);
            try
            {
                Thread.sleep(1);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }

    public void buttonText(String s1, String s2, String s3, String s4)
    {
        gui.buttonText(s1,s2,s3,s4);
    }

    public void setEditable(boolean b)
    {
        gui.setEditable(b);
    }

    public String getName()
    {
        return gui.getName();
    }
}
