import Control.MainController;
import View1.GUI;
import View2.Console;


/**
 * Created by 204g02 on 12.09.2016.
 */
public class MainProgram
{
    public static void main(String[] args)
    {
        MainController control = new MainController();
        GUI jan = new GUI(control);
    }
}
