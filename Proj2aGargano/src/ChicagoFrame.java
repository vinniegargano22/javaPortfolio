//Vinnie Gargano, Project 2a, 1/24/18 - Chicago Frame
import javax.swing.*;
import java.awt.*;

public class ChicagoFrame extends JFrame {

	private ChicagoPanel p;
    public ChicagoFrame()
    {
        super("Chicago at Night");
        p = new ChicagoPanel();
        p.setLayout(new FlowLayout());
       
        setContentPane(p);
        setSize(600, 550);//size of frame
        setVisible(true);
    }//end public ChicagoFrame
}//end public class ChicagoFrame